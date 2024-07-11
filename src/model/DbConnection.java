package model;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import view.ShowMessage;

public class DbConnection {

    private Connection conn = null;

    public Connection getConnection() {
        return openConnection();
    }
    
    private Connection openConnection() {
        File file = new File("F:\\Teste/SavePDF.db");

        if (file.exists()) {
            if (conn == null) {
                try {
                    conn = DriverManager.getConnection("jdbc:sqlite:SavePDF.db");
                    return conn;
                } catch (SQLException ex) {
                }
            } else {
                return conn;
            }
        } else {
            ShowMessage message = new ShowMessage();
            message.information("Banco de dados não encontrado");
            System.exit(0);
        }
        
        return null;
    }
    
    public void closeConnection() throws SQLException {
        conn.close();
    }

}
