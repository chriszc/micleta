/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.data;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author varogonz
 */
public abstract class Database {
    
    private static final String USER ="root";
    private static final String PASSWORD ="root";
    private static final String HOST ="localhost";
    private static final String PORT ="3306";
    private static final String DBNAME ="example";
    private static final String URL ="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
    private static Connection connection = null;
    
    public static Connection getConnection(){
        try{
            DriverManager.registerDriver(new Driver());
            connection = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } 
        catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    
    public static void close(){
        try{
            if(connection!=null){
                if(!connection.isClosed()){
                    connection.close();
                }
            }
        }
        catch (SQLException ex) {Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
}
