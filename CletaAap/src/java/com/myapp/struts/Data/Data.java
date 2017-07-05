package com.myapp.struts.Data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

public class Data {
    private Connection con;
    private static final String USER="ucrgrupo5";
    private static final String PASS="Grup5#fNeo6";
    private static final String HOST1="72.167.233.101";

    private static final String DATA="ucrgrupo5"; 
    
    public Connection getConnection() throws SQLException{
        con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =(com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://"+HOST1+":3306/"+DATA,USER,PASS);
        
        } catch (ClassNotFoundException ex) {
             try {
             con = (com.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://"+HOST1+":3306/"+DATA,USER,PASS);
            } catch (SQLException ex1) {
                java.util.logging.Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return con;
        
    }
}
 

