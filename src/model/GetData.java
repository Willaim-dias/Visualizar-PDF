package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetData {
    
    private final DbConnection db = new DbConnection();
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
        }
        return null;
    }
    
    public List<Map<String, Object>> recuperarDatas() {
        String query = "SELECT ID,Titulo,Descricao FROM PDFs";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            
            try (ResultSet resultSet = ps.executeQuery()) {
                List<Map<String, Object>> result = new ArrayList<>();
                while (resultSet.next()) {
                    Map<String, Object> row = new HashMap<>();
                    row.put("id", resultSet.getString("ID"));
                    row.put("titulo", resultSet.getString("Titulo"));
                    row.put("descricao", resultSet.getString("Descricao"));
                    result.add(row);
                }
                return result;
            }
        } catch (SQLException e) {
        }
        return null;
    }
}
