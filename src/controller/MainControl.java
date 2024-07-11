package controller;

import java.awt.Image;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.DeleteData;
import model.GetData;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import view.ScreenShowPdf;

public class MainControl {

    private final ScreenShowPdf program;
    private final PDFModules pdfModules;  
    private PDFRenderer renderer;
    private int pageNumber;

    private final List<Object> list = new ArrayList<>();
 
    public MainControl(ScreenShowPdf program) {
        this.program = program;
        pdfModules = new PDFModules();
    }

    public void addDataDable() {
        DefaultTableModel dtm = (DefaultTableModel) program.getTableData().getModel();

        list.clear();
        dtm.setRowCount(0);

        GetData getData = new GetData();
        List<Map<String, Object>> result = getData.recuperarDatas();
        for (Map<String, Object> row : result) {
            Object[] obj = {row.get("id"), row.get("titulo"), row.get("descricao")};
            dtm.addRow(obj);
        }
    }

    public void searchTable(String search) {
        DefaultTableModel dtm = (DefaultTableModel) program.getTableData().getModel();
        int contRows = program.getTableData().getRowCount();
        list.clear();
        for (int i = 0; i < contRows; i++) {
            Object[] obj = {program.getTableData().getValueAt(i, 0),program.getTableData().getValueAt(i, 1),program.getTableData().getValueAt(i, 2)};
            list.add(obj);
        }
        dtm.setRowCount(0);
        for (Object obj : list) {
            if (obj instanceof Object[]) {
                Object[] array = (Object[]) obj;      
                if (array[0].toString().equals(search)||array[1].toString().equals(search)) {
                    dtm.addRow(array);
                }
            }
        }
    }
    
    public void showPdf(int page) {
        Image img = null;
        try {
            img = renderer.renderImageWithDPI(page, 150, ImageType.RGB);
        } catch (IOException ex) {
            System.out.println("Erro: " + ex);
        }
        if (img != null) {
            int width = program.getLabelShowPDF().getWidth();
            Image formatedImg = img.getScaledInstance((width-30),1200, Image.SCALE_SMOOTH);
            program.getLabelShowPDF().setIcon(new ImageIcon(formatedImg));
        }
    }

    public void openPdf(String id) {
        if (renderer != null) {
            pdfModules.closeDocument();
        }
        GetData getData = new GetData();
        renderer = pdfModules.dbRendererPDF(getData.recuperarPDF(Integer.parseInt(id)));
        pageNumber = pdfModules.getNumberPage();
        program.getLabelShowNumber().setText("1/" + pageNumber);
        showPdf(0);
    }

    private int heavyPages = 0;

    public void skipPage(int btn) {
        if (btn == 1) {
            if (heavyPages != (pageNumber - 1)) {
                heavyPages += 1;
                showPdf(heavyPages);
                program.getLabelShowNumber().setText((heavyPages + 1) + "/" + pageNumber);
            }
        } else {
            if (heavyPages != 0) {
                heavyPages -= 1;
                showPdf(heavyPages);
                program.getLabelShowNumber().setText((heavyPages + 1) + "/" + pageNumber);
            }
        }
    }
    
    public void getPDF(int id, String file) {
        GetData getData = new GetData(); 
        try {
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(getData.recuperarPDF(id));
            }
        } catch (IOException e) {
        }
    }

    public void deletePDF(int id) {
        DeleteData delete = new DeleteData();
        delete.removePDF(id);
        addDataDable();
    }
}
