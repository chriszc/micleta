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
        
        int cedula=Integer.parseInt(request.getParameter("cedula"));
        String nombre=request.getParameter("nombre");
        String apellidos=request.getParameter("apellidos");
        String direccion=request.getParameter("direccion");
        int telefono=Integer.parseInt(request.getParameter("telefono"));
        String correo=request.getParameter("correo");
        String contra=request.getParameter("contra");
        
        Persona p = new Persona();
        p.setApellidos(apellidos);
        p.setDireccion(direccion);
        p.setId(cedula);
        p.setTelefono(telefono);
        p.setNombre(nombre);
        p.setCorreo(correo);
        p.setContra(contra);
        
        
        DataAccessPersona.insert(p);
    }
    
    public void delete(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
        response.getWriter().write(DataAccessPersona.delete(Integer.parseInt(request.getParameter("id")))?"true":"false");
    }
    
    public void getAll(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
        List<Persona> l = DataAccessPersona.getAll();
        String s = "[";
        for(Persona p : l){
            s+=
            "{\"cedula\":\""+p.getId()+"\","
            +"\"nombre\":\""+p.getNombre()+"\","
            +"\"apellidos\":\""+p.getApellidos()+"\","
            +"\"direccion\":"+p.getDireccion()+"\","
            +"\"telefono\":\""+p.getTelefono()+"\","
            +"\"correo\":\""+p.getCorreo()+"\","
            +"\"contra\":\""+p.getContra()+"\","        
            +"},";
        }
        s=s.substring(0,s.length()-1)+"]";
        response.getWriter().write(s);
    }
}
