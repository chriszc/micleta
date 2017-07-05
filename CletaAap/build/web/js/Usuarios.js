    /* 
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
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

