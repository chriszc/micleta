<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IMEC Persona</title>
    </head>
    <body>
      
        <div>
            
            <header>
                <h3>Insertar persona</h3>
                <hr/>
            </header>
            
            <section>
                <form id="insertform">
                    <div><input type="text" name="nombre" placeholder="Nombre"/></div>
                    <div><input type="text" name="apellidos" placeholder="Apellidos"/></div>
                    <div><input type="number" name="edad" placeholder="Edad"/></div>
                    <button type="button" onclick="insert()">Insertar persona</button>
                </form>
            </section>
            
        </div>
        
        <div>
            
            <header>
                <h3>Actualizar usuario</h3>
                <hr/>
            </header>
            
            <section>
                <form id="updateform">
                    <div><input type="number" name="id" placeholder="Id"/></div>
                    <div><input type="text" name="nombre" placeholder="Nombre"/></div>
                    <div><input type="text" name="apellidos" placeholder="Apellidos"/></div>
                    <div><input type="number" name="edad" placeholder="Edad"/></div>
                    <button type="button" onclick="update()">Actualizar</button>
                </form>
            </section>
            
        </div>
        
        <div>
            
            <header>
                <h3>Personas registradas</h3>
                <hr/>
            </header>
            
            <section>
                <table>
                    <thead>
                        <tr>
                            <td>Id</td>
                            <td>Nombre</td>
                            <td>Apellidos</td>
                            <td>Edad</td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                    </thead>
                    
                    <tbody id="personastable"></tbody>
                    
                </table>
            </section>
            
        </div>
        
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" charset="utf-8"></script>
        <script src="./persona.js"></script>
    </body>
</html>
