package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/estilos.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("        \n");
      out.write("        <script rel=\"stylesheet\" href\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>\n");
      out.write("\t<link href=\"./css/alertify.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"./css/alertify.core.css\" rel=\"stylesheet\">\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery-latest.js\"></script>\n");
      out.write("\t<script src=\"./js/menu.js\"></script>\n");
      out.write("\t<script scr=\"./js/footer.js\"></script>\n");
      out.write("\t<script src=\"./js/login.js\"></script>\n");
      out.write("\t<script src=\"./js/cliente.js\"></script>\n");
      out.write("\t<script src=\"../js/validaciones.js\"></script>\n");
      out.write("\t<script src=\"//code.jquery.com/jquery-1.9.1.js\"></script>\n");
      out.write("\t<script src=\"//code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- link calendar resources -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\n");
      out.write("\t<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\n");
      out.write("\t<title>Registro</title>\n");
      out.write("</head>\n");
      out.write("<body onload=\"habilitar('<?php require_once './Validaciones/validarRegistro.php' ?>')\" >\n");
      out.write("    <!--<?php include './interfaz/cabecera.php'; ?>!-->\n");
      out.write("\t<div class=\"contenedor-formulario\">\n");
      out.write("\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t<form class=\"formulario\" name=\"formulario_registro\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<label class=\"labelEncabezados\" ><span class=\"icon-man-woman\"></span></label>\n");
      out.write("\t\t\t\t\t\t<label class=\"labelEncabezados\" >Registro Usuario</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"nombre\" name=\"nombre\" onkeypress=\"return soloLetras(event, this)\">\n");
      out.write("\t\t\t\t\t\t<label class=\"label\" for=\"nombre\">Nombre:</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"apellidos\" name=\"apellidos\" onkeypress=\"return soloLetras(event, this)\">\n");
      out.write("\t\t\t\t\t\t<label class=\"label\" for=\"correo\">Apellidos:</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\" >\n");
      out.write("\t\t\t\t\t\t<input type=\"datepicker\" id=\"date\" name=\"date\" required readonly />\n");
      out.write("\t\t\t\t\t\t<label class=\"label\" for=\"bnombre\" id=\"lfecha\">Fecha de nacimiento:</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"identificacion\" name=\"identificacion\" onkeypress=\"return soloNumeros(event, this)\" maxlength=\"9\" >\n");
      out.write("\t\t\t\t\t\t<label class=\"label\" for=\"identificacion\">Identificación:</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"tel\" name=\"tel\" onkeypress=\"return soloNumeros(event, this)\" maxlength=\"8\">\n");
      out.write("\t\t\t\t\t\t<label class=\"label\" for=\"tel\">Teléfono:</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"direccion\" name=\"direccion\">\n");
      out.write("\t\t\t\t\t\t<label class=\"label\" for=\"direccion\">Dirección:</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"email\" id=\"correo\" name=\"correo\">\n");
      out.write("\t\t\t\t\t\t<label class=\"label\" for=\"correo\">Correo:</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" id=\"pass\" name=\"pass\">\n");
      out.write("\t\t\t\t\t\t<label class=\"label\" for=\"pass\">Contraseña:</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" id=\"pass2\" name=\"pass2\">\n");
      out.write("\t\t\t\t\t\t<label class=\"label\" for=\"pass2\">Repetir Contraseña:</label>\n");
      out.write("\t\t\t\t\t</div>  \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"label\" id=\"especialidadL\"  style=\"display:none\" for=\"nombre\">Especialidad</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t<select multiple type=\"select\" id=\"SeleEspecialidad\" style=\"display:none\" onclick=\"SelectEspecialidad()\" class=\"select\"></select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"input-group radio\">\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"sexo\" id=\"hombre\" value=\"Hombre\">\n");
      out.write("\t\t\t\t\t\t<label for=\"hombre\">Masculino</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"sexo\" id=\"mujer\" value=\"Mujer\">\n");
      out.write("\t\t\t\t\t\t<label for=\"mujer\">Femenino</label>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"button\" id=\"btn-submit\" value=\"Enviar\" onClick=\"insertarPersona()\"><span class=\"icon-floppy-disk\"></span> Guardar</button>\n");
      out.write("\t\t\t\t</div><br><br>\n");
      out.write("\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script src=\"./js/alertify.js\"></script>\n");
      out.write("\t<script src=\"./js/formulario.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css\" />\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.21/jquery-ui.min.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$( function() {\n");
      out.write("\t\t\t$(\"#date\").datepicker({ minDate: new Date(1920, 10 - 1, 25), changeMonth: true, changeYear: true, maxDate: \"-12M\", dateFormat: 'dd/mm/yy' }).val();\n");
      out.write("\t\t} );\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t<div id=\"dialog\"></div>\n");
      out.write("\n");
      out.write("\t<!--<?php include './interfaz/footer.php'; ?>!-->    \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
