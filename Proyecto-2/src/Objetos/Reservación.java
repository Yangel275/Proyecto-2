/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.time.LocalDate;

/**
 *
 * @author yangel
 */

import java.time.LocalDate;

public class Reservación {
    private int Ci;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Género;
    private String TipoHab;
    private String Celular;
    private LocalDate Llegada;
    private LocalDate Salida;
    
    // Constructor
    public Reservación(int Ci, String Nombre, String Apellido, String Email, String Genero, String TipoHab, String Celular, LocalDate Llegada, LocalDate Salida) {
        this.Ci = Ci;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Género = Género;
        this.TipoHab = TipoHab;
        this.Celular = Celular;
        this.Llegada = Llegada;
        this.Salida = Salida;
    }

    //Cédula
    public int getCi() {
        return Ci;
    }

    public void setCi(int Ci) {
        this.Ci = Ci;
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

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    

    //Género
    public String getGénero() {
        return Género;
    }

    
    public void setGénero(String Género) {
        this.Género = Género;
    }



    //Tipo de habitación
    public String getTipoHab() {
        return TipoHab;
    }

    public void setTipoHab(String TipoHab) {
        this.TipoHab = TipoHab;
    }

    
    
    //Número Celular
    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    

    //Fecha de llegada
    public LocalDate getLlegada() {
        return Llegada;
    }

    public void setLlegada(LocalDate Llegada) {
        this.Llegada = Llegada;
    }

    

    //Fecha de Salida
    public LocalDate getSalida() {
        return Salida;
    }

    public void setSalida(LocalDate Salida) {
        this.Salida = Salida;
    }
    
    
    
}

