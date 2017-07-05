<%-- 
    Document   : insertarUsuario
    Created on : 03-jul-2017, 15:24:58
    Author     : chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page contentType="text/html"%>
<html>
    <head>
<!DOCTYPE html>
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="../css/estilos.css">
	<link rel="stylesheet" href="../css/style.css">
        
        <script rel="stylesheet" href
	<link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
	<link href="./css/alertify.css" rel="stylesheet">
	<link href="./css/alertify.core.css" rel="stylesheet">
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="./js/menu.js"></script>
	<script scr="./js/footer.js"></script>
	<script src="./js/login.js"></script>
	<script src="../js/Usuarios.js"></script>
	<script src="../js/validaciones.js"></script>
	<script src="//code.jquery.com/jquery-1.9.1.js"></script>
	<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
	
	<!-- link calendar resources -->
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<link rel="stylesheet" href="/resources/demos/style.css">
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<title>Registro</title>
</head>
<body onload="habilitar('<?php require_once './Validaciones/validarRegistro.php' ?>')" >
    <!--<?php include './interfaz/cabecera.php'; ?>!-->
	<div class="contenedor-formulario">
		<div class="wrap">
			<form class="formulario" name="formulario_registro">
				<div>
					<div>
						<label class="labelEncabezados" ><span class="icon-man-woman"></span></label>
						<label class="labelEncabezados" >Registro Usuario</label>
					</div>
                                    
                                    <div class="input-group radio">
						<input type="radio" name="persona" id="Cliente"  value="1" onClick="OpcionesCiclo(1)">
						<label for="Cliente" id="lClien" >Cliente</label>
						<input type="radio" name="persona"  id="Ciclo" value="2" onClick="OpcionesCiclo(2)">
						<label for="Ciclo" id="LCiclo" >Ciclo</label>
						
					</div>	
					
					<div class="input-group">
						<input type="text" id="nombre" name="nombre" onkeypress="return soloLetras(event, this)">
						<label class="label" for="nombre">Nombre:</label>
					</div>
					<div class="input-group">
						<input type="text" id="apellidos" name="apellidos" onkeypress="return soloLetras(event, this)">
						<label class="label" id="LApellido" for="correo">Apellidos:</label>
					</div>
					<div class="input-group" >
						<input type="datepicker" id="date" name="date" required readonly />
						<label class="label" for="bnombre" id="lfecha">Fecha de nacimiento:</label>
					</div>
					<div class="input-group">
						<input type="text" id="identificacion" name="identificacion" onkeypress="return soloNumeros(event, this)" maxlength="9" >
						<label class="label" id="LIdentificacion" for="identificacion">Identificación:</label>
					</div>
					
					<div class="input-group">
						<input type="text" id="tel" name="tel" onkeypress="return soloNumeros(event, this)" maxlength="8">
						<label class="label" for="tel">Teléfono:</label>
					</div>
					<div class="input-group">
						<input type="text" id="direccion" name="direccion">
						<label class="label" for="direccion">Dirección:</label>
					</div>
					<div class="input-group">
						<input type="email" id="correo" name="correo">
						<label class="label" for="correo">Correo:</label>
					</div>
                                                <div class="input-group">
						<input type="email" id="web" name="correo" style="display: none">
						<label class="label"id="lweb" for="correo" style="display: none">Pagina Web:</label>
					</div>
					<div class="input-group">
						<input type="password" id="pass" name="pass">
						<label class="label" for="pass">Contraseña:</label>
					</div>
					<div class="input-group">
						<input type="password" id="pass2" name="pass2">
						<label class="label" for="pass2">Repetir Contraseña:</label>
					</div>  
					
					<div>
						<div class="input-group">
							<label class="label" id="especialidadL"  style="display:none" for="nombre">Especialidad</label>
						</div>
						<div class="input-group">
							<select multiple type="select" id="SeleEspecialidad" style="display:none" onclick="SelectEspecialidad()" class="select"></select>
						</div>
					</div>

					<div>
						

					<div class="input-group radio" id="diGenero">
						<input type="radio" name="sexo" id="hombre" value="Hombre">
						<label for="hombre">Masculino</label>
						<input type="radio" name="sexo" id="mujer" value="Mujer">
						<label for="mujer">Femenino</label>
					</div>					
					<button type="button" class="button" id="btn-submit" value="Enviar" onClick="insertarPersona()"><span class="icon-floppy-disk"></span> Guardar</button>
				</div><br><br>

			</form>
		</div>
	</div>
	<script src="./js/alertify.js"></script>
	<script src="./js/formulario.js"></script>
	<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.21/jquery-ui.min.js"></script>
	<script>
		$( function() {
			$("#date").datepicker({ minDate: new Date(1920, 10 - 1, 25), changeMonth: true, changeYear: true, maxDate: "-12M", dateFormat: 'dd/mm/yy' }).val();
		} );
	</script>

	<div id="dialog"></div>

	<!--<?php include './interfaz/footer.php'; ?>!-->    
</body>
</html>
