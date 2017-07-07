/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.database;

import com.myapp.model.Persona;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Álvaro González
 */
public class DataAccessPersona{

    public static boolean insert(Persona t) {
        Connection c = Database.getConnection();
        boolean r = false;
        try {
            PreparedStatement ps = (PreparedStatement) c.prepareStatement(
                    "insert into Persona values(null,'"+t.getNombre()+"','"+t.getApellidos()+"',"+t.getEdad()+")"
            );
            r = ps.executeUpdate() > 0;
        }
        catch (SQLException ex) {
            Logger.getLogger(DataAccessPersona.class.getName()).log(Level.SEVERE, null, ex);
        }        
        finally{Database.close();}
        
        return  r;
    }

    public boolean update(Persona t) {
        return false;
    }

    public static boolean delete(Object o) {
        Connection c = Database.getConnection();
        boolean r = false;
        try {
            PreparedStatement ps = (PreparedStatement) c.prepareStatement(
                    "delete from Persona where id="+o.toString()
            );
            r = ps.executeUpdate() > 0;
        }
        catch (SQLException ex) {
            Logger.getLogger(DataAccessPersona.class.getName()).log(Level.SEVERE, null, ex);
        }        
        finally{Database.close();}
        
        return  r;
    }

    public Persona get(Object o) {
        return null;
    }

    public List<Persona> getAll() {
        Connection c = Database.getConnection();
        LinkedList<Persona> l = null;
        try {
            PreparedStatement ps = (PreparedStatement) c.prepareStatement("select * from Persona");
            ResultSet rs = ps.executeQuery();
            
            l=new LinkedList<>();
            while(rs.next()){
                l.add(new Persona(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("edad")));
            }
        } 
        catch (SQLException sqle) {}
        finally{Database.close();}
        
        return  l;
    }
 
}
