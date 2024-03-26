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
    private int Tamaño;
    private Histórico pFirst;
    private Habitación ant_hab;
    private Habitación sig_hab;
    private String Escritura;

    public Habitación(int numHab, String tipoHab, int piso) {
        this.numHab = numHab;
        this.tipoHab = tipoHab;
        this.piso = piso;
        this.Tamaño = 0;
        this.pFirst = null;
        this.ant_hab = null;
        this.sig_hab = null;
        this.Escritura = null;
    }
    
    //Agregar nueva información al historial de la habitación
    public void agg_hist(Histórico nuevo){
        if(this.getTamaño() == 0){
            this.setpFirst(nuevo);
            this.setTamaño(this.getTamaño() + 1);
        }else{
            Histórico aux = this.getpFirst();
            nuevo.setNext(aux);
            this.setpFirst(nuevo);
            this.setTamaño(this.getTamaño()+1);
                        
        }
    }
    
    // Insertar las Habitaciones que estarán conectado dentro del árbol binario equilibrado
    public void insertar(Habitación nuevo){
        if(nuevo.getNumHab() < this.getNumHab()){
            //Insertar habitación conectada en forma de su hoja en el lado izquierdo
            if(this.getAnt_hab() == null){
                this.ant_hab = nuevo;
            }else{
                this.ant_hab.insertar(nuevo);    
            }
        }else{
            //Insertar habitación conectada en forma de su hoja en el lado derecho
            if(this.getSig_hab() == null){
                this.sig_hab = nuevo;
            }else{
                this.sig_hab.insertar(nuevo);    
            }
        }
    }
    
    
    public String toCSV(){
        return this.getNumHab()+","+this.getTipoHab()+","+this.getPiso();
        
    }

    
    public String Hojas() {
        String Escritura = "";
        
        Escritura = "Habitación: " + this.numHab+ "\n";
        
        if(this.ant_hab == null){
            Escritura += "Anterior Habitación: No Tiene \n";
        }else{
            Escritura += "Anterior Habitación: " + this.getAnt_hab().numHab+ " \n";
        }
        
        
        if(this.sig_hab == null){
            Escritura += "Siguiente Habitación: No Tiene \n";
        }else{
            Escritura += "Siguiente Habitación: " + this.getSig_hab().numHab+ " \n";
        }
        return Escritura;
    }
    
    public void disparador_Imp(){
        if(this.getpFirst() != null){
            Histórico iniciar = this.getpFirst();
            this.Imprimir(iniciar);
        }else{
            return;
        }
    }
    
    public void Imprimir(Histórico historial){

        this.setEscritura(this.getEscritura() + historial.toImpimir());
        if(historial.getNext() != null){
            this.Imprimir(historial.getNext());
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

    

    // Indicar tamaño del Historial
    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    
    
    //Indicar el primer elemento del historial
    public Histórico getpFirst() {
        return pFirst;
    }

    public void setpFirst(Histórico pFirst) {
        this.pFirst = pFirst;
    }

    
    
    //Cambiar a la información Anterior de la habitación
    public Habitación getAnt_hab() {
        return ant_hab;
    }
    

    //Cambiar a la información de la Siguiente habitación
    public Habitación getSig_hab() {
        return sig_hab;
    }    

    /**
     * @return the Escritura
     */
    public String getEscritura() {
        return Escritura;
    }

    /**
     * @param Escritura the Escritura to set
     */
    public void setEscritura(String Escritura) {
        this.Escritura = Escritura;
    }
    
}