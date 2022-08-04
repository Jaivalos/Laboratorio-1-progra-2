/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1.relacion.uno.muchos;

public class Curso {
    
    private String idCurso;
    private int tamanio;
    private Alumno alumnos[];
    
    //Constructor
    public Curso(String idCurso, int tamanio){
        this.idCurso = idCurso;
        this.tamanio = tamanio;
        this.alumnos = new Alumno[tamanio];
    }
    
    //Get Set
    public String getIdCurso(){
        return idCurso;
    }
    public void setIdCurso(String idCurso){
        this.idCurso = idCurso;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    public void setTamanio(int tamanio){
        this.tamanio = tamanio;
    }
    
    public Alumno[] getAlumnos(){
        return alumnos;
    }
    public void setAlumnos(Alumno[] alumnos){
        this.alumnos = alumnos;
    }
    
}
