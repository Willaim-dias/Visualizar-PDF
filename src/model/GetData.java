package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import view.ShowMessage;

public class GetData {

    private final DbConnection db = new DbConnection();
    ShowMessage message = new ShowMessage();
    private final Connection conn;

    public GetData() {
        this.conn = db.getConnection();
    }

    public byte[] recuperarPDF(int id) {
        String sql = "SELECT PDF FROM PDFs WHERE ID = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                byte[] pdfBytes = rs.getBytes("PDF");
                return pdfBytes;
            }
        } catch (SQLException e) {
            message.aler("Erro ao carregar codigo-1: "+e);
        }
        return null;
    }

    public List<Map<String, Object>> recuperarDatas() {
        String query = "SELECT ID,Nome_arquivo,Referencia FROM PDFs";
        try (PreparedStatement ps = conn.prepareStatement(query)) {

            try (ResultSet resultSet = ps.executeQuery()) {
                List<Map<String, Object>> result = new ArrayList<>();
                while (resultSet.next()) {
                    Map<String, Object> row = new HashMap<>();
                    row.put("id", resultSet.getString("ID"));
                    row.put("nome_arquivo", resultSet.getString("Nome_arquivo"));
                    row.put("referencia", resultSet.getString("Referencia"));
                    result.add(row);
                }
                return result;
            }
        } catch (SQLException e) {
            message.aler("Erro carregar codigo-1"+e);
        }
        return null;
    }

    public String[] getDetails(int id) {
        String query = "SELECT ID,Nome_arquivo,Referencia,Descricao FROM PDFs WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet resultSet = ps.executeQuery()) {
                String[] data = new String[3];
                data[0] = resultSet.getString("Nome_arquivo");
                data[1] = resultSet.getString("Referencia");
                data[2] = resultSet.getString("Descricao");
                return data;
            }
        } catch (SQLException e) {
            message.aler("Erro carregar codigo-1"+e);

        }
        return null;
    }
}
