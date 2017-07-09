/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.model;


public class Persona{

    private int id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;
    private String correo;
    private String contra;

    public Persona() {
        id=telefono=0;
        nombre=apellidos=direccion=correo=contra="";
    }
    
    public Persona(int id, String nombre, String apellidos, String direccion, int telefono, String correo, String contra) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion= direccion;
        this.telefono= telefono;
        this.correo= correo;
        this.contra= contra;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

  
        public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion +
                ", telefono="+telefono+", correo="+correo+", contra="+contra+ '}';
    }
}
