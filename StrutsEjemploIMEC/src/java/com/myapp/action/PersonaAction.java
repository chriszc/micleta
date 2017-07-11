/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.action;

import com.myapp.data.DataAccessPersona;
import com.myapp.model.Persona;
import com.myapp.utils.JsonList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class PersonaAction extends DispatchAction {

    
    public void insert(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) throws Exception{
        int edad = Integer.parseInt(request.getParameter("edad"));
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        
        int result = DataAccessPersona.insertId(new Persona(nombre, apellidos, edad));
        
        String out =  result!= -1? "{\"attempt\":true, \"id\":"+result+'}':"{\"attempt\":false, \"id\":"+result+'}';
        
        response.getWriter().write(out);
    }
    
    public void delete(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) throws Exception{
        int id = Integer.parseInt(request.getParameter("id"));
        
        response.getWriter().write(DataAccessPersona.delete(id)?"true":"false");
    }
    
    public void update(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) throws Exception{
        
        int id = Integer.parseInt(request.getParameter("id"));
        int edad = Integer.parseInt(request.getParameter("edad"));
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        
        response.getWriter().write(DataAccessPersona.update(new Persona(id, nombre, apellidos, edad))?"true":"false");
    }
    
    public void get(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) throws Exception{
        int id=Integer.parseInt(request.getParameter("id"));
        String jsonResponse=DataAccessPersona.get(id).toString();     
        response.getWriter().write(jsonResponse);
    }
    
    public void getAll(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response) throws Exception{
        JsonList jl = (JsonList) DataAccessPersona.getAll();
        response.getWriter().write(jl.toString());
    }
    
}
