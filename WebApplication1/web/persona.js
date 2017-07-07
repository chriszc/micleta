$(document).ready(function(){
    DeleteForm = $('#delete');
    
    $.ajax({
        url:"./persona.do?action=getAll",
        type:"post",
        data:{},
        success:function(response){
            var obj = JSON.parse(response);
            console.log(obj);
        }
    });
    
});

function deletePersona(){
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