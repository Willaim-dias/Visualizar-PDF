package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import model.GetData;
import model.InsertData;
import view.ProgramMain;

public class ProgramMainControl {

    private ProgramMain program;

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
            Object[] obj = {row.get("Id"),sdf.format(row.get("Data"))};
            dtm.addRow(obj);
        }
    }

    public void saveNewPdf(String date, String file) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        try {
            InsertData.inserirPDF(new java.sql.Date(sdf.parse(date).getTime()), file);
        } catch (ParseException e) {
        }
    }

    public void getPDF(int id,String file) {
        GetData getData = new GetData();
        getData.recuperarPDF(id, file);
    }
    
}
