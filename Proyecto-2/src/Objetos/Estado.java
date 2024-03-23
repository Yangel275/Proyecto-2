/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author yangel/orozco/vivolo
 */
public class Estado {
    private int Num_hab;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Genero;
    private String Celular;
    private Date Llegada;

    public Estado(int Num_hab, String Nombre, String Apellido, String Email, String Genero, String Celular, Date Llegada) {
        this.Num_hab = Num_hab;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Genero = Genero;
        this.Celular = Celular;
        this.Llegada = Llegada;
    }

    
    
    // Número de Habitación
    public int getNum_hab() {
        return Num_hab;
    }
    
    public void setNum_hab(int Num_hab) {
        this.Num_hab = Num_hab;
    }

    
    
    
    // Usuario
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    
    // Apellido
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
    public String getGenero() {
        return Genero;
    }
 
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }




    //Celular
    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    
    
    //Llegada
    public Date getLlegada() {
        return Llegada;
    }

    public void setLlegada(Date Llegada) {
        this.Llegada = Llegada;
    }
}


    