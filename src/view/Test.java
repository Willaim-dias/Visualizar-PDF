package view;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.GetData;

public class Test {

    public static void main(String[] args) throws SQLException, IOException {

        GetData getData = new GetData();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvar PDF");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Arquivos PDF", "pdf"));
        fileChooser.setSelectedFile(new File("Relatorio.pdf"));
        File file = fileChooser.getSelectedFile();
        getData.recuperarPDF(2, file.getPath());
    }

}
