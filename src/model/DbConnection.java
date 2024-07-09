package model;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private Connection conn = null;

    public Connection getConnection() {
        return openConnection();
    }
    
    private Connection openConnection() {
        File file = new File("SavePDF.db");

        if (file.exists()) {
            if (conn == null) {
                try {
                    conn = DriverManager.getConnection("jdbc:sqlite:SavePDF.db");
                    return conn;
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } else {
                return conn;
            }
        }
        return null;
    }
    
    public void closeConnection() throws SQLException {
        conn.close();
    }

}
