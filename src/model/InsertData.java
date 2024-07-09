package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import view.ShowMessage;

public class InsertData {

    private static byte[] lerArquivoPDF(String caminhoArquivo) throws IOException {
        File file = new File(caminhoArquivo);
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[(int) file.length()];
            fis.read(buffer);
            return buffer;
        }
    }

    public static void inserirPDF(Date data, String caminhoArquivo) {
        DbConnection db = new DbConnection();
        try (PreparedStatement ps = db.getConnection().prepareStatement("INSERT INTO Celular_PDF(Data, PDF) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            ps.setDate(1, data);
            ps.setBytes(2, lerArquivoPDF(caminhoArquivo));

            int resp = ps.executeUpdate();

            ShowMessage message = new ShowMessage();
            if (resp > 0) {
                message.information("Arquivo Salvo!");
            } else {
                message.information("Erro ao Salvo Arquivo!");
            }
        } catch (SQLException | IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            try {
                db.closeConnection();
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}
