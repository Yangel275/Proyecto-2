/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;
import java.time.LocalDate;

/**
 *
 * @author yangel/orozco/vivolo
 */
public class Estado {
    private int numHab;
    private String primerNombre;
    private String apellido;
    private String email;
    private String genero;
    private String celular;
    private LocalDate llegada;
    
    // Constructor
    public Estado(int numHab, String primerNombre, String apellido, String email, String genero, String celular, LocalDate llegada){
    this.numHab = numHab;
    this.primerNombre = primerNombre;
    this.apellido = apellido;
    this.email = email;
    this.genero = genero;
    this.celular = celular;
    this.llegada = llegada;
    }
    
    public int getNumHab() {
        return numHab;
    }
    public void setNumHab(int numHab) {
        this.numHab = numHab;
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
}
