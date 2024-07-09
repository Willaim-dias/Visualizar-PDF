package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetData {
    
    private final DbConnection dbConnection = new DbConnection();
    private final Connection conn = dbConnection.getConnection();
    
    public void recuperarPDF(int id, String caminhoSaida) {
        String sql = "SELECT PDF FROM Celular_PDF WHERE ID = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {  
                byte[] pdfBytes = rs.getBytes("PDF");
                try (FileOutputStream fos = new FileOutputStream(caminhoSaida)) {
                    fos.write(pdfBytes);
                }
            }
        } catch (SQLException | IOException e) {
        }
    }
    
    public List<Map<String, Object>> recuperarDatas() {
        String query = "SELECT Id, Data FROM Celular_PDF";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            
            try (ResultSet resultSet = ps.executeQuery()) {
                List<Map<String, Object>> result = new ArrayList<>();
                while (resultSet.next()) {
                    Map<String, Object> row = new HashMap<>();
                    row.put("Id", resultSet.getString("Id"));
                    row.put("Data", resultSet.getDate("Data"));
                    result.add(row);
                }
                return result;
            }
        } catch (SQLException e) {
            return Collections.emptyList();
        }
    }
}
