package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import view.ShowMessage;

public class InsertData {

    DbConnection db = new DbConnection();
    private final Connection conn;
    
    public InsertData() {
        this.conn = db.getConnection();
    }
    
    private byte[] lerArquivoPDF(String caminhoArquivo) {
        File file = new File(caminhoArquivo);
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[(int) file.length()];
            fis.read(buffer);
            return buffer;
        } catch (IOException e) {       
        }
        return null;
    }

    public void inserirPDF(String title,String description, String caminhoArquivo) {
        String sql = "INSERT INTO PDFs(Titulo,Descricao, PDF) VALUES(?,?,?)";
        try {
            try (PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, title);
                ps.setString(2, description);
                ps.setBytes(3,lerArquivoPDF(caminhoArquivo));
                
                messageReturn(ps.executeUpdate());
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }
    }
    
    private void messageReturn(int resp) {
        ShowMessage message = new ShowMessage();
        if (resp > 0) {
            message.information("Salvo Com Sucesso!");
        } else {
            message.information("Erro ao Salvo!");
        }
    }
}
