/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.myapp.database.DataAccessPersona;
import com.myapp.model.Persona;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author Álvaro González
 */
public class PersonaAction extends DispatchAction{

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    
    
    public void insert(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
        
        int edad=Integer.parseInt(request.getParameter("edad"));
        String nombre=request.getParameter("nombre");
        String apellidos=request.getParameter("apellidos");
        
        Persona p = new Persona();
        p.setApellidos(apellidos);
        p.setEdad(edad);
        p.setNombre(nombre);
        
        DataAccessPersona.insert(p);
        
        PrintWriter pw = response.getWriter();
        pw.write("ksajfñljdaslkjf");
    }
    
    public ActionForward delete(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
        
        int id=Integer.parseInt(request.getParameter("id"));
        
        return DataAccessPersona.delete(id)? mapping.findForward("success") : mapping.findForward("failure");
    }
    
    public ActionForward getAll(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
        
        return null;
    }
}
