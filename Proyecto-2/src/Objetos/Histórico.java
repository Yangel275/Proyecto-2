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


/* Encargado de los objetos pertenecientes del csv de los historiales, sirve
   para guardar y crear objetos de ese archivo
   cada objeto pertenecerá a una habitación, indicado por el atributo de num_hab
   
    Dentro de cada habitación estará con un atribituo que formará una lizta enlazada
    de estos objetos de manera que esté ordenada de la estadía más reciente a la 
    más anitgua

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

    // Construtcor de de Histórico
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
    
    
    
    
    /* Está relacionado con:
        disparador_Imp()
        void Imprimir(Histórico historial)
    
        para que estos funciones requieren de un String, que conseguirán 
        mediante está funciona ya que lo devuelve
        
        Esto permite actualizar los datos del atributo Escritura de Habitación 
    
    */
    public String toImpimir(){
        return this.getCédula()+" "+this.getNombre()+" " +this.getApellido()+" " +this.getEmail()+" " +this.getGenero()+" " +this.getLlegada()+" " +Integer.toString(this.getnum_hab())+"\n";
    }
    
    
    
    
    /* Está función permite que a la hora de guardar la habitación en el csv
        se devuelva colocando los datos que recibe el csv y cada dato separado por 
        comas
    */
    public String toCSV(){
        return this.getCédula()+","+this.getNombre()+"," +this.getApellido()+","+this.getEmail()+","+this.getGenero()+","+this.getLlegada()+","+Integer.toString(this.getnum_hab());
    }
    
    
    
    
    /* 
        Esta función permite función permite la ordenación de los datos de la Lista Enlazada del atributo
        pFirst que este último pertenece
    
        Permite que los objetos sean capaces de compararse en forma de int
        siendo mayor alquel con fecha más actual
    */
    public int Date_Str_int(){
        String[] numero1 = this.getLlegada().split("\\/");
        int sum2 = Integer.parseInt(numero1[1]);
        int ci = Integer.parseInt(numero1[0]) + Integer.parseInt(numero1[1])*100 + Integer.parseInt(numero1[2])*10000;
        return ci;
    }
    
    
    /*
        De aquí en adelante se encuentre los Get y Stters de cada atributo de 
        este objeto
    */
    
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

    

    //Obtener siguiente objeto Histórico de la Lista Enlazada
    public Histórico getNext() {
        return Next;
    }

    public void setNext(Histórico Next) {
        this.Next = Next;
    }

    

    
}