/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.database;

import com.myapp.model.Persona;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataAccessPersona{

    public static boolean insert(Persona t) {
        Connection c = Database.getConnection();
        boolean r = false;
        try {
            CallableStatement ps = c.prepareCall("{ call insertarPersona(?,?,?,?,?,?,?) }");
            ps.setInt("ced", t.getId());
            ps.setString("nom", t.getNombre());
            ps.setString("ape", t.getApellidos());
            ps.setString("dire", t.getDireccion());
            ps.setInt("tele", t.getTelefono());
            ps.setString("mail", t.getCorreo());
            ps.setString("con", t.getContra());
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

    public static List<Persona> getAll() {
        Connection c = Database.getConnection();
        LinkedList<Persona> l = new LinkedList<>();
        try {
            PreparedStatement ps = (PreparedStatement) c.prepareStatement("select * from Persona");
            
            ResultSet rs = ps.executeQuery();
        
            while(rs.next()){
                //l.add(new Persona(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getInt("edad")));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(DataAccessPersona.class.getName()).log(Level.SEVERE, null, ex);
        }   
        finally{Database.close();}
        
        return  l;
    }
 
}
