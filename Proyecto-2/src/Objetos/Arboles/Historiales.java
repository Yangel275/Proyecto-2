/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Arboles;

import Objetos.Habitación;
import Objetos.Historial;

/**
 *
 * @author yangel
 */
public class Historiales {
    Habitación pFirst;
    
    //Constructor de los historiales de las habitaciones
    public Historiales(){
        this.pFirst = null;
    }
    
    /*Se úsara las habitaciones que tiene registrado una lista enlazada de  
    * todos los usuarios que han residido en las habitaciones
    */
    public void insertar(Habitación nuevo){
        if(this.pFirst == null){
            this.pFirst = nuevo;
        }else{
            this.pFirst.insertar(nuevo);
        }
    }
    

    public void ejecutarorden(){
        this.inorden(this.pFirst);
    }
    
    public void inorden(Habitación nuevo){
        if(nuevo == null){
            return // Se encontró el valor
        }
    }
}

