/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author yangel/vivolo/orozco
 */

/* Es solo una habitación del cojunto que pertenece a Habitaciones
    ubicado en la carpeta ABB.LE, esto son obtenidos del csv de Habitaciones
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

    

    // Constructor de una habitación
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
    
    
    
    /*Agregar nueva información al historial de la habitación, esto
        ordenará los historiales de modo que estén enlazdas desde
        la última persona que se hospedo, hasta la primera que se hospedó
    */
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
    
    
    
    /* Esta función permite determinar si una objeto habitación puede ser o no 
        la hoja de esta habitación
    
        Si no tiene hoja izquierda (ant hab) o hoja derecha (sig ant) se le 
        esta habitación como la hoja de esa posición vacía, del no ser el caso
        se instará a seguir buscando. Para determinar su posición, se toma en cuenta
        el número de la habitación, si es mayor va a la ant hab, de lo contrario va a
        sig hab
    */
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
    
    
    /* Está función permite que a la hora de guardar la habitación en el csv
        se devuelva colocando los datos que recibe el csv y cada dato separado por 
        comas
    */
    public String toCSV(){
        return this.getNumHab()+","+this.getTipoHab()+","+this.getPiso();
        
    }

    /* Es solo una función comprobación, no es necesaria en el sistema pero  
    saber cuáles son las hojas que pertenece a esta habitación
    */
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
    
    
    /* Este disparador es para desarrollar la impresión del historial presente 
        en esta habitación que se vaya imprimir.

        Para imprimir solo debes crear:

        buscado es el objeto Habitacion 

        Habitación disparador_busqueda( int numero)
    
    
        buscado = disparador_busqueda( int numero)
        buscado.getEscritura -> devolverá un String 
    
        El numero es un int que hace referencia a la habitación
        El buscado es el objeto habitación de aquella habitación que buscamos 


        Está conectado con  Imprimir(Histórico historial), ya que está solo define
        como va iniciar Imprimir(Histórico historial)

        También se conecta con Imprimir() del objeto Histórico
    */
    public void disparador_Imp(){
        if(this.getpFirst() != null){
            Histórico iniciar = this.getpFirst();
            this.Imprimir(iniciar);
        }else{
            return;
        }
    }
    
    
    
    /* Permite guardar cada historial en forma de String. 
    
    Como el historial dentro de una habitación es una lista
    enlazada, tomará el nodo pFirst,  para ir agregando al String Escritura
    todos aquellos historiales de cada persona que se hospedado en esa habitación
    
    Se recomiendo usar disparador_Imp() para usar esta, de lo contrario puede no 
    conseguir el resultado
    */
    public void Imprimir(Histórico historial){
        this.setEscritura(this.getEscritura() + historial.toImpimir());
        if(historial.getNext() != null){
            this.Imprimir(historial.getNext());
        }
        
        
    }
    
    
    // Aquí adelante se encuentra los Get y Setter de los atributos del objeto
    
    // Número de habitación
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

    //Escritura
    public String getEscritura() {
        return Escritura;
    }

    public void setEscritura(String Escritura) {
        this.Escritura = Escritura;
    }
    
}