package controller;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.GetData;
import model.InsertData;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import view.ProgramMain;

public class ProgramMainControl {

    private final ProgramMain program;

    public ProgramMainControl(ProgramMain program) {
        this.program = program;
    }

    public void addDataDable() {
        DefaultTableModel dtm = (DefaultTableModel) program.getTablePDF().getModel();

        dtm.setRowCount(0);

        GetData getData = new GetData();
        List<Map<String, Object>> result = getData.recuperarDatas();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        for (Map<String, Object> row : result) {
            Object[] obj = {row.get("Id"), sdf.format(row.get("Data"))};
            dtm.addRow(obj);
        }
    }

    public void openPdf(String id) {
        GetData getData = new GetData();
        try {
            PDDocument document = PDDocument.load(new ByteArrayInputStream(getData.recuperarPDF(Integer.parseInt(id))));

            PDFRenderer pdfRenderer = new PDFRenderer(document);
            BufferedImage img = pdfRenderer.renderImageWithDPI(0, 300, ImageType.RGB);
            //int width = program.getLabelViewPDF().getWidth();
            //int height = program.getLabelViewPDF().getHeight();
            Image scaledImage = img.getScaledInstance(210, 297, Image.SCALE_SMOOTH);
            program.getLabelViewPDF().setIcon(new ImageIcon(scaledImage));
        } catch (IOException e) {
            System.out.println("Erro: " + e);
        }
    }

    public void saveNewPdf(String date, String file) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        try {
            InsertData.inserirPDF(new java.sql.Date(sdf.parse(date).getTime()), file);
        } catch (ParseException e) {
        }
    }

    public void getPDF(int id, String file) {
        GetData getData = new GetData();
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(getData.recuperarPDF(id));
        } catch (IOException e) {
        }
    }

}
