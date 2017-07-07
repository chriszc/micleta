<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba</title>
    </head>
    <body>
        
        <header>
            <h3>Insertar persona</h3>
            <hr>
        </header>
        
        <section>
            <form action="./persona.do?action=insert" method="post">
                <input name="nombre" type="text" placeholder="nombre">
                <input name="apellidos" type="text" placeholder="apellidos">
                <input name="edad" type="number" min="1" max="100" placeholder="edad">
                <button type="submit">Insert this motherfucker</button>
            </form>
        </section>
        
        <header>
            <h3>Eliminar persona</h3>
            <hr>
        </header>
        
        <section>
            <form id="delete">
                <input name="id" type="number" placeholder="Id">
                <button type="button" onclick="deletePersona()">Delete this motherfucker</button>
            </form>
        </section>
        
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Edad</th>
                </tr>
            </thead>
            <tbody id="personas"></tbody>
        </table>

        <script src="./jquery.min.js"></script>
        <script src="./persona.js"></script>
    </body>
</html:html>
