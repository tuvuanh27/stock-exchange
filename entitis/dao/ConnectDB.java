/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private Connection connect;
    private String URL;
    private String USER;
    private String PASS;
    
    public ConnectDB() {
        
        URL="jdbc:sqlserver://localhost:1433;databasename = StockEx;instance=SQLSERVER;encrypt=true;TrustServerCertificate=true;";
        USER="tu2";
        PASS="12345678";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public Connection getConnect() {
        try {
            connect = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return connect;
    }
    
    
    public void closeConnect() {
        try {
            if (!connect.isClosed() || connect != null) {
                connect.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    } 
}
