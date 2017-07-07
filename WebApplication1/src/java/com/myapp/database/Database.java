/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Álvaro González
 */
public abstract class Database {

    public static final String USER="root";
    public static final String PASS="root";
    public static final String HOST="localhost";
    public static final String DBNAME="test"; 
    public static final String PORT="3306";
    public static final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
    
    private static Connection con = null;
    
    public static Connection getConnection(){
        try {
            DriverManager.registerDriver(new Driver());
            con = (Connection) DriverManager.getConnection(URL, USER, PASS);
        } 
        catch (SQLException sqle) {}
        return con;
    }
    
    public static void close(){
        try {
            if(con!=null){if(!con.isClosed()){con.close();}}
        } 
        catch (SQLException sqle) {}
    }
    
}
