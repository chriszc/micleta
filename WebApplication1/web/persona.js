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