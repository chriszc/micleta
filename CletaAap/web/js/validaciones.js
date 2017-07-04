function soloLetras(e, solicitar){
         // Admitir solo letras
         tecla = (document.all) ? e.keyCode : e.which;
         if (tecla==8) return true;
         patron =/^[a-zA-ZñÑ\s\W]/;
         te = String.fromCharCode(tecla);
         if (!patron.test(te)) return false;
  // No amitir espacios iniciales y convertir 1ª letra a mayúscula
  txt = solicitar.value;
  if(txt.length==0 && te==' ') return false;
  if (txt.length==0 || txt.substr(txt.length-1,1)==' ') {
    solicitar.value = txt+te.toUpperCase();
    return false;
  }
}

function soloNumeros(e, valor) {
  var i = valor.value.length;
  key = e.keyCode || e.which;
  tecla = String.fromCharCode(key).toLowerCase();
  letras = "0123456789";
  especiales = [8, 239];

  tecla_especial = false
  for (var i in especiales) {
    if (key == especiales[i]) {
      tecla_especial = true;
      break;
    }
  }

  if (letras.indexOf(tecla) == -1 && !tecla_especial)
    return false;
}


function cedula(){
	 document.getElementById('busqueda').value="";
	 $("#busqueda").attr('maxlength','9');
}
function telefono(){
	 document.getElementById('busqueda').value="";
	 $("#busqueda").attr('maxlength','8');
}
function codigo(){
	if( $("#bBusqueda").length > 0 ){
	document.getElementById('bBusqueda').value="";
	}else{
		if( $("#busqueda").length > 0 ){
		document.getElementById('busqueda').value="";
	}	
	}
}

function nombre(){
	if($("#busqueda").length > 0 ){
     document.getElementById('busqueda').value="";
	$("#busqueda").attr("maxlength", 60);
	}else{
		if( $("#bBusqueda").length > 0 ){
			document.getElementById('bBusqueda').value="";
		}
	}
}






