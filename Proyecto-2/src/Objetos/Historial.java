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
import java.time.LocalDate;

public class Historial {
    private String Cédula;
    private String Nombre;
    private String Apellido;
    private String Email; // Reconocer que es un email hacerlo mediante el "@" y el "." (Despues de que se consiga "@" busca que después haya un punto)
    private String Genero;
    private Date Llegada;
    private int num_hab;
    private Historial Next;

    public Historial(String Cédula, String Nombre, String Apellido, String Email, String Genero, Date Llegada, int num_hab) {
        this.Cédula = Cédula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Genero = Genero;
        this.Llegada = Llegada;
        this.num_hab = num_hab;
        this.Next = null;
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
    public Date getLlegada() {
        return Llegada;
    }

    public void setLlegada(Date Llegada) {
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
    public Historial getNext() {
        return Next;
    }

    public void setNext(Historial Next) {
        this.Next = Next;
    }

    

    
}