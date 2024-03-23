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
    private Historial[] historiales;
    private Habitación ant_hab;
    private Habitación sig_hab;
    

    public Habitación(int numHab, String tipoHab, int piso) {
        this.numHab = numHab;
        this.tipoHab = tipoHab;
        this.piso = piso;
        this.historiales = null;
        this.ant_hab = null;
        this.sig_hab = null;
    }
    
    //Agregar nueva información al historial de la habitación
    public void agg_hist(Historial nuevo){
        if(this.historiales.length == 0 ){
            this.historiales = new Historial[1];
            this.historiales[0] = nuevo;
        }else{
            int indice = this.historiales.length;
            Historial[] nuevo_historial = new Historial[indice];
            for(int i = 0; i < this.historiales.length; i++){
                nuevo_historial[i] = this.historiales[i];    
            }
            nuevo_historial[indice - 1] = nuevo;
            this.historiales = nuevo_historial;
        }
    }
    


    
    
    
    
    //Número de habitación
    public int getNumHab() {
        return numHab;
    }

    public void setNumHab(int numHab) {
        this.numHab = numHab;
    }

    

    //Tipo de habitción
    public String getTipoHab() {
        return tipoHab;
    }
   
    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    

    //Piso 
    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    

    //Historial de la habitación
    public Historial[] getHistoriales() {
        return historiales;
    }

    public void setHistoriales(Historial[] historiales) {
        this.historiales = historiales;
    }
    


    // Anterior habitación
    public Habitación getAnt_hab() {
        return ant_hab;
    }

    public void setAnt_hab(Habitación ant_hab) {
        this.ant_hab = ant_hab;
    }

    

    //Siguiente Habitación
    public Habitación getSig_hab() {
        return sig_hab;
    }

    public void setSig_hab(Habitación sig_hab) {
        this.sig_hab = sig_hab;
    }
    
    
    
}