/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.myapp.database.DataAccessPersona;
import com.myapp.model.Persona;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Álvaro González
 */
public class PersonaAction extends DispatchAction{

    public void insert(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
        
        int edad=Integer.parseInt(request.getParameter("edad"));
        String nombre=request.getParameter("nombre");
        String apellidos=request.getParameter("apellidos");
        
        Persona p = new Persona();
        p.setApellidos(apellidos);
        p.setEdad(edad);
        p.setNombre(nombre);
        
        DataAccessPersona.insert(p);
    }
    
    public void delete(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
        response.getWriter().write(DataAccessPersona.delete(Integer.parseInt(request.getParameter("id")))?"true":"false");
    }
    
    public void getAll(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
        List<Persona> l = DataAccessPersona.getAll();
        String s = "{[";
        int count=0;
        for(Persona p : l){
            s+=count
            +":{id:'"+p.getId()+"',"
            +"nombre:'"+p.getNombre()+"',"
            +"apellidos:'"+p.getApellidos()+"',"
            +"edad:'"+p.getEdad()
            +"'},";
            count++;
        }
        s=s.substring(0,s.length()-1)+"]}";
        response.getWriter().write(s);
    }
}
