$(document).ready(function(){
    
    $.ajax({
        url:"?action=getAll",
        type:"get",
        data:{},
        success:function(response){
            var tbody = $('#personas').clone();
            var str="";
            
            
        }
    });
    
});