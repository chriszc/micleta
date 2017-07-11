/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    getAll();
});

function getAll(){
    $.ajax({
        url:'./persona.do?action=getAll',
        type:'get',
        dataType:'json',
        data:{},
        success:function(response){
            var tbody = $('#personastable').clone();
            var str='';
            
            for(var i =0;i<response.length;i++){
                str+='<tr>'
                        +'<td>'+response[i].id+'</td>'
                        +'<td>'+response[i].nombre+'</td>'
                        +'<td>'+response[i].apellidos+'</td>'
                        +'<td>'+response[i].edad+'</td>'
                        +'<td data-id="'+response[i].id+'"><button onclick="Delete('+response[i].id+')">Eliminar</button></td>'
                +'</tr>';
            }
            tbody.append(str);
            $('#personastable').empty();
            $('#personastable').replaceWith(tbody);
        }
    });
}

function insert(){
    var form = $('#insertform');
    var nombre = form.find('input[name=nombre]').val();
    var apellidos = form.find('input[name=apellidos]').val();
    var edad = form.find('input[name=edad]').val();
    
    $.ajax({
        url:'./persona.do?action=insert',
        type:'post',
        dataType: 'json',
        data:{nombre:nombre,apellidos:apellidos,edad:edad},
        success:function(response){
            if(response.attempt){
                var str='<tr>'
                        +'<td>'+response.id+'</td>'
                        +'<td>'+nombre+'</td>'
                        +'<td>'+apellidos+'</td>'
                        +'<td>'+edad+'</td>'
                        +'<td data-id="'+response.id+'"><button onclick="Delete('+response.id+')">Eliminar</button></td>'
                +'</tr>';
                alert('Se insertó correctamente');
                $('#personastable').append(str);
            }
            else{alert('Ocurrió un error al intertar insertar');}
        }
    });
}

function Delete(id){
    
    $.ajax({
        url:'./persona.do?action=delete',
        type:'post',
        dataType:'json',
        data:{id:id},
        success:function(response){
            if(response){
                $('#personastable')
                        .find('td[data-id='+id+']')
                        .parent()
                        .fadeOut();
                alert('Se elimnó correctamente');
            }
            else{
                alert('Ocurrió un error');
            }
        }
    });
}

function update(){
    var form = $('#updateform');
    var id = form.find('input[name=id]').val();
    var nombre = form.find('input[name=nombre]').val();
    var apellidos = form.find('input[name=apellidos]').val();
    var edad = form.find('input[name=edad]').val();
    
    $.ajax({
        url:'./persona.do?action=update',
        type:'post',
        dataType:'json',
        data:{id:id,nombre:nombre,apellidos:apellidos,edad:edad},
        success:function(response){
            if(response){
                var str='<tr>'
                        +'<td>'+id+'</td>'
                        +'<td>'+nombre+'</td>'
                        +'<td>'+apellidos+'</td>'
                        +'<td>'+edad+'</td>'
                        +'<td data-id="'+id+'"><button onclick="Delete('+id+')">Eliminar</button></td>'
                +'</tr>';
        
                $('#personastable')
                        .find('td[data-id='+id+']')
                        .parent().replaceWith(str);
                alert('Se elimnó correctamente');
            }
            else{
                alert('Ocurrió un error');
            }
        }
    });
}