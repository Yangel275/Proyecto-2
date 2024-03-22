/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author yangel/vivolo/orozco
 */


public class Habitación {
    private int numHab;
    private String tipoHab;
    private int piso;
    //Constructor
    public Habitación(int numHab, String tipoHab, int piso){
        this.numHab = numHab;
        this.tipoHab = tipoHab;
        this.piso = piso;
    }
    
//Getters y Setters
    public int getNumHab() {
        return numHab;
    }
    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }
    public String getTipoHab() {
        return tipoHab;
    }
    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }
    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    
}
