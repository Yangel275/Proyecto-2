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
    private String ci;
    private String primerNombre;
    private String apellido;
    private String email;
    private String genero;
    private String tipoHab;
    private String celular;
    private LocalDate llegada;
    private LocalDate salida;
    
    // Constructor
    public Reservación(String ci, String primerNombre, String apellido, String email, String genero, String tipoHab, String celular, LocalDate llegada, LocalDate salida) {
        this.ci = ci;
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.tipoHab = tipoHab;
        this.celular = celular;
        this.llegada = llegada;
        this.salida = salida;
    }
    // getters y setters

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

    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getLlegada() {
        return llegada;
    }

    public void setLlegada(LocalDate llegada) {
        this.llegada = llegada;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }
}

