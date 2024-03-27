/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTA;

/**
 *
 * @author gabrielorozco
 */
public class Estado {
    public String numHab;
    String primerNombre;
    String apellido;
    String email;
    String genero;
    String celular;
    String llegada;

    public Estado(String numHab, String primerNombre, String apellido, String email, String genero, String celular, String llegada) {
        this.numHab = numHab;
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.celular = celular;
        this.llegada = llegada;
    }
    public String getNumHab() {
        return numHab;
    }

    public void setNumHab(String numHab) {
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

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }
    @Override
    public String toString() {
        return numHab + "," +
               primerNombre + "," +
               apellido + "," +
               email + "," +
               genero + "," +
               celular + "," +
               llegada;
    }
}
