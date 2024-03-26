/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Date;

/**
 *
 * @author yangel
 */


public class Histórico {
    private String Cédula;
    private String Nombre;
    private String Apellido;
    private String Email; // Reconocer que es un email hacerlo mediante el "@" y el "." (Despues de que se consiga "@" busca que después haya un punto)
    private String Genero;
    private String Llegada;
    private int num_hab;
    private Histórico Next;

    public Histórico(String Cédula, String Nombre, String Apellido, String Email, String Genero, String Llegada, int num_hab) {
        this.Cédula = Cédula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Genero = Genero;
        this.Llegada = Llegada;
        this.num_hab = num_hab;
        this.Next = null;
    }
    
    public String toImpimir(){
        return this.getCédula()+" "+this.getNombre()+" " +this.getApellido()+" " +this.getEmail()+" " +this.getGenero()+" " +this.getLlegada()+" " +Integer.toString(this.getnum_hab());
    }
    
    public String toCSV(){
        return this.getCédula()+","+this.getNombre()+"," +this.getApellido()+","+this.getEmail()+","+this.getGenero()+","+this.getLlegada()+","+Integer.toString(this.getnum_hab());
    }
    
    public int Date_Str_int(){
        String[] numero1 = this.getLlegada().split("\\/");
        int sum2 = Integer.parseInt(numero1[1]);
        int ci = Integer.parseInt(numero1[0])*sum2 + Integer.parseInt(numero1[1])*sum2*sum2 + Integer.parseInt(numero1[2])*sum2;
        return ci;
    }
    
    
    //Cédula
    public String getCédula() {
        return Cédula;
    }

    public void setCédula(String Cédula) {
        this.Cédula = Cédula;
    }

    

    //Nombre
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    

    //Apellido
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    

    //Email
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    

    //Gérnero
    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    

    // Fecha de Llegada
    public String getLlegada() {
        return Llegada;
    }

    public void setLlegada(String Llegada) {
        this.Llegada = Llegada;
    }

    

    //Número de la Habitación
    public int getnum_hab() {
        return num_hab;
    }
    
    public void setHab(int num_hab) {
        this.num_hab = num_hab;
    }

    

    //Obtener siguiente Lista Enlazada
    public Histórico getNext() {
        return Next;
    }

    public void setNext(Histórico Next) {
        this.Next = Next;
    }

    

    
}