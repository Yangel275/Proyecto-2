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
<<<<<<< HEAD
    String Cédula;
    String Nombre;
    String Appellido;
    String email; // Reconocer que es un email hacerlo mediante el "@" y el "." (Despues de que se consiga "@" busca que después haya un punto)
    String Genero;
    Date Llegada;
    int num_hab;
=======
    private String ci;
    private String primerNombre;
    private String apellido;
    private String email;
    private String genero;
    private LocalDate llegada;
    private int numHab;
    
    // Constructor, getters y setters
    public Historial(String ci, String primerNombre, String apellido, String email, String genero, LocalDate Llegada, int numHab){
        this.ci = ci;
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.llegada = Llegada;
        this.numHab = numHab;
    }
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getLlegada() {
        return llegada;
    }

    public void setLlegada(LocalDate llegada) {
        this.llegada = llegada;
    }

    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }
>>>>>>> 2c106c16bc3fbb6749303b04a263c6df753d32d1
}
