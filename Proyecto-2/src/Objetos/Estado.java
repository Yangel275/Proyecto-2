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
<<<<<<< HEAD
    
    private int num_hab;
    private String Nombre;
=======
    private int numHab;
    private String primerNombre;
>>>>>>> 2c106c16bc3fbb6749303b04a263c6df753d32d1
    private String apellido;
    private String email;
    private String genero;
    private String celular;
<<<<<<< HEAD
    private Date Llegada;

    /**
     * @return the num_hab
     */
    public int getNum_hab() {
        return num_hab;
    }

    /**
     * @param num_hab the num_hab to set
     */
    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the Llegada
     */
    public Date getLlegada() {
        return Llegada;
    }

    /**
     * @param Llegada the Llegada to set
     */
    public void setLlegada(Date Llegada) {
        this.Llegada = Llegada;
    }
    
=======
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
>>>>>>> 2c106c16bc3fbb6749303b04a263c6df753d32d1
}
