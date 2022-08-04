/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1.relacion.uno.muchos;

public class Alumno {
    
    private String nombre; 
    private int edad;
    
    //Constructor
    public Alumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Get Set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
}
