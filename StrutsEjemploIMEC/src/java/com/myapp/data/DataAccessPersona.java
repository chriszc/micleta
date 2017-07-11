/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.data;

import com.myapp.model.Persona;
import com.myapp.utils.JsonList;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author varogonz
 */
public class DataAccessPersona {
 
    public static int insertId(Persona p){
        Connection c = Database.getConnection();
        int r = -1;
        try {
            PreparedStatement ps = c.prepareStatement(
                    "insert into persona values(null,'"
                            +p.getNombre()
                            +"','"+p.getApellidos()
                            +"',"+p.getEdad()+')'
            );
            
            if(ps.executeUpdate() > 0){
                ps = c.prepareStatement("select last_insert_id() as id");
                ResultSet rs = ps.executeQuery();
                rs.next();
                r = rs.getInt("id");
            }
        } 
        catch (SQLException sqle) {
            Logger.getLogger(DataAccessPersona.class.getName()).log(Level.SEVERE, null, sqle);
        }
        finally{Database.close();}
        
        return r;
    }
    
    public static boolean insert(Persona p){
        Connection c = Database.getConnection();
        boolean r = false;
        try {
            PreparedStatement ps = c.prepareStatement(
                    "insert into persona values(null,'"
                            +p.getNombre()
                            +"','"+p.getApellidos()
                            +"',"+p.getEdad()+')'
            );
            r= ps.executeUpdate() > 0;
            
        } 
        catch (SQLException sqle) {
            Logger.getLogger(DataAccessPersona.class.getName()).log(Level.SEVERE, null, sqle);
        }
        finally{Database.close();}
        
        return r;
    }
    
    public static boolean delete(int id){
        Connection c = Database.getConnection();
        boolean r = false;
        try {
            PreparedStatement ps = c.prepareStatement("delete from persona where id="+id);
            r= ps.executeUpdate() > 0;
        } 
        catch (SQLException sqle) {
            Logger.getLogger(DataAccessPersona.class.getName()).log(Level.SEVERE, null, sqle);
        }
        finally{Database.close();}
        
        return r;
    }
    
    public static boolean update(Persona p){
        
        Connection c = Database.getConnection();
        boolean r = false;
        
        try {    
            PreparedStatement ps = c.prepareStatement(
                    "update persona set nombre='"+p.getNombre()+"', apellidos='"
                    +p.getApellidos()+"', edad="+p.getEdad()
            );
            r = ps.executeUpdate() > 0;
        }
        catch (SQLException ex) {
            Logger.getLogger(DataAccessPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{Database.close();}
        
        return r;
    }
    
    public static Persona get(int id){
        Connection c = Database.getConnection();
        Persona p = null;
        try {
            PreparedStatement ps = c.prepareStatement("select * from persona where id="+id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                p = new Persona(rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("edad"));
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(DataAccessPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{Database.close();}
        
        return p;
    }
    
    public static List<Persona> getAll(){
        Connection c = Database.getConnection();
        List<Persona> p = null;
        
        try {
            PreparedStatement ps = c.prepareStatement("select * from persona");
            ResultSet rs = ps.executeQuery();
            
            p = new JsonList<>();
            
            while (rs.next()) {
                p.add(new Persona(rs.getInt("id"),rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("edad")));
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(DataAccessPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{Database.close();}
        
        return p;
    }
    
}
