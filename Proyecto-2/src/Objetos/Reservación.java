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
    private String Ci;
    private String Nombre;
    private String Apellido;
    private String Email;
    private String Género;
    private String TipoHab;
    private String Celular;
    private String Llegada;
    private String Salida;
    private Reservación ant_res;
    private Reservación sig_res;
    
    // Constructor de Reservación
    public Reservación(String Ci, String Nombre, String Apellido, String Email, String Genero, String TipoHab, String Celular, String Llegada, String Salida) {
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

    
    
    /*  Ubciar en esta  "Raíz" las hojas ya sea ant res o sig res en caso de ser 
        vacías, en caso de no ser asi, buscará en las hojas ant_res o sig_res aquellas
        si tiene o no hojas para ubicarlas en dicho espacio
    
        Su posición se verá reflejada también por la cédula, si es más grande o más pequeña
    
    */
    public void insertar(Reservación nuevo){
        if(nuevo.Ci_Str_int() < this.Ci_Str_int()){
            //Insertar habitación conectada en forma de su hoja en el lado izquierdo
            if(this.getAnt_res() == null){
                this.ant_res = nuevo;
            }else{
                this.ant_res.insertar(nuevo);    
            }
        }else{
            //Insertar habitación conectada en forma de su hoja en el lado derecho
            if(this.getSig_res() == null){
                this.sig_res = nuevo;
            }else{
                this.sig_res.insertar(nuevo);    
            }
        }
    }
    
    
    /*
        Método para revisar si una Reservación contiene o no, ant_res y sig_res 
    */
    public String Hojas() {
        String Escritura = "";
        
        Escritura = "Habitación: " + this.Ci + "\n";
        
        if(this.ant_res == null){
            Escritura += "Anterior Habitación: No Tiene \n";
        }else{
            Escritura += "Anterior Habitación: " + this.getAnt_res().Ci+ " \n";
        }
        
        
        if(this.sig_res == null){
            Escritura += "Siguiente Habitación: No Tiene \n";
        }else{
            Escritura += "Siguiente Habitación: " + this.getSig_res().Ci+ " \n";
        }
        return Escritura;
    }

    
    
    /*
       Permite colocar los datos de manera que se puede subir al csv 
    */
    public String toCSV(){
        return this.getCi()+","+this.getNombre()+","+this.getApellido()+","+this.getEmail()+","+this.getGénero()+","+this.getTipoHab()+","+this.getCelular()+","+this.getLlegada()+","+this.getSalida();
    }
    
    
    /*
        Método de revisión para el funcionamiento del árbol
    */
    public String prueba(){
        return "Cédula: "+this.getCi()+" "+"Nombre y Apellido: "+this.getNombre()+" "+this.getApellido()+"\n";
    }
    
    
    /*
        Permite usar el atributo ci o cédula de manera que se convierta en int 
        pueda comprar dos objetos mediante este atributo
    */
    public int Ci_Str_int(){
        String[] numero1 = this.getCi().split("\\.");
        int ci = Integer.parseInt(numero1[0])*1000000 + Integer.parseInt(numero1[1])*1000 + Integer.parseInt(numero1[2]);
        return ci;
    }

    
    
    //Se encuentra los Get y Setter de los atributos del objeto
    
    
    //Cédula
    public String getCi() {
        return Ci;
    }

    public void setCi(String Ci) {
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
    public String getLlegada() {
        return Llegada;
    }

    public void setLlegada(String Llegada) {
        this.Llegada = Llegada;
    }

    

    //Fecha de Salida
    public String getSalida() {
        return Salida;
    }

    public void setSalida(String Salida) {
        this.Salida = Salida;
    }

    /**
     * @return the ant_res
     */
    public Reservación getAnt_res() {
        return ant_res;
    }

    /**
     * @param ant_res the ant_res to set
     */
    public void setAnt_res(Reservación ant_res) {
        this.ant_res = ant_res;
    }

    /**
     * @return the sig_res
     */
    public Reservación getSig_res() {
        return sig_res;
    }

    /**
     * @param sig_res the sig_res to set
     */
    public void setSig_res(Reservación sig_res) {
        this.sig_res = sig_res;
    }
    
    
    
}

