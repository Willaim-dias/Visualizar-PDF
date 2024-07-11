package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import view.ShowMessage;

public class DeleteData {

    private final DbConnection dbConnection = new DbConnection();
    private final Connection conn;

    public DeleteData() {
        this.conn = dbConnection.getConnection();
    }

    public void removePDF(int id) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM PDFs WHERE ID = ?", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);

            messageReturn(ps.executeUpdate());
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    private void messageReturn(int resp) {
        ShowMessage message = new ShowMessage();
        if (resp > 0) {
            message.information("Deletado com Salvo!");
        } else {
            message.information("Erro ao Deletar Arquivo!");
        }
    }
}


