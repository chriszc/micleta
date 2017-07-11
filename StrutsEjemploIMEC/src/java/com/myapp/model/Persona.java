/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.model;

/**
 *
 * @author varogonz
 */
public class Persona {
 
    private String nombre;
    private String apellidos;
    private int edad;
    private int id;

    public Persona() {
        nombre = apellidos="";
        id=edad=0;
    }
    
    public Persona(int id, String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.id=id;
    }
    
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        id=-1;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{\"nombre\":\"" + nombre + "\", \"apellidos\":\"" + apellidos + "\", \"edad\":" + edad + ", \"id\":" + id + '}';
    }
    
}
