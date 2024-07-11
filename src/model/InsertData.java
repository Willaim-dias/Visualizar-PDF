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
    ShowMessage message = new ShowMessage();
    DbConnection db = new DbConnection();
    private final Connection conn;
    
    public InsertData() {
        this.conn = db.getConnection();
    }
    
    private byte[] lerArquivoPDF(String Filepath) {
        File file = new File(Filepath);
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] buffer = new byte[(int) file.length()];
            fis.read(buffer);
            return buffer;
        } catch (IOException e) {
            message.aler("Erro ao converter codigo-4: " + e);
        }
        return null;
    }

    public void inserirPDF(String name,String Reference, String description, String Filepath) {
        String sql = "INSERT INTO PDFs(Nome_arquivo,Referencia,Descricao,PDF) VALUES(?,?,?,?)";
        try {
            try (PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, name);
                ps.setString(2, Reference);
                ps.setString(3, description);
                ps.setBytes(4,lerArquivoPDF(Filepath));
                
                messageReturn(ps.executeUpdate());
            }
        } catch (SQLException e) {
            message.aler("Erro ao Salvar codigo-1: " + e);
        }
    }
    
    private void messageReturn(int resp) {    
        if (resp > 0) {
            message.information("Salvo Com Sucesso!");
        } else {
            message.information("Erro ao Salvo!");
        }
    }
}
