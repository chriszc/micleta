$(document).ready(function(){
    DeleteForm = $('#delete');
    
    $.ajax({
        url:"./persona.do?action=getAll",
        type:"post",
        dataType:"json",
        success:function(response){
            
            var str="";
            console.log(response);
            for(var i = 0;i<response.length;i++){
                str+="<tr>"
                +"<td>"+response[i].id+"</td>"
                +"<td>"+response[i].nombre+"</td>"
                +"<td>"+response[i].apellidos+"</td>"
                +"<td>"+response[i].edad+"</td>"
                +"</tr>";
            }
            
            $('#personas').append(str);
        }
    });
    
});

function deletePersona(){
    console.log("hi");
    var id = DeleteForm.find('input[name=id]').val();
    $.ajax({
        url:"./persona.do?action=delete",
        type:"post",
        data:{id:id},
        success:function(response){
            if(response==="true"){
                alert("Success!!");
            }
            else{
                alert("Failure ):");
            }
        }
    });
}

  function OpcionesCiclo(tipo){
        if(tipo==2){
       document.getElementById('apellidos').style.display= "none";
       document.getElementById('LApellido').style.display = "none";
       document.getElementById('date').style.display = "none";
       document.getElementById('lfecha').style.display = "none";
        document.getElementById('lfecha').style.display = "none";
         document.getElementById('identificacion').style.display = "none";
        document.getElementById('LIdentificacion').style.display = "none";
        document.getElementById('diGenero').style.display = "none";
         document.getElementById('web').style.display = "inline";
        document.getElementById('lweb').style.display = "inline";



     }else{
            document.getElementById('apellidos').style.display= "inline";
       document.getElementById('LApellido').style.display = "inline";
       document.getElementById('date').style.display = "inline";
       document.getElementById('lfecha').style.display = "inline";
        document.getElementById('lfecha').style.display = "inline";
         document.getElementById('identificacion').style.display = "inline";
        document.getElementById('LIdentificacion').style.display = "inline";
        document.getElementById('diGenero').style.display = "inline";
            document.getElementById('web').style.display = "none";
        document.getElementById('lweb').style.display = "none";


     }

    }
