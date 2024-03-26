/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB_LE;


import Objetos.Habitación;
import Objetos.Histórico;

/**
 *
 * @author yangel
 */
public class Habitaciones {
    private static Habitación inicial;
    private static int menor;
    private static int mayor;
  
    public void agg_hab(Histórico agregar){
        int buscar = agregar.getnum_hab();
        Habitación hab_bus = this.buscador(this.getInicial(), buscar);
        hab_bus.agg_hist(agregar);
    }
    
    public void insertar(Habitación hab){
        if(this.getInicial() == null){
            this.setInicial(hab);   
        }else{
            this.getInicial().insertar(hab);
        }
    }

    public void disparadorInorden(){
        this.inorden(this.getInicial());
    }

    public void inorden(Habitación hab){
        if(hab == null){
            return;
        }else{
            System.out.println(hab.Hojas());
            inorden(hab.getAnt_hab());
            inorden(hab.getSig_hab());
        }
    }
    
    public Habitación disparador_busqueda( int numero){
        Habitación habitación = this.getInicial();
        Habitación buscado = this.buscador(habitación, numero);
        return buscado;
        
    }
    
    public Habitación buscador(Habitación habitacion,  int numero){
        Habitación buscado = null;
        if(habitacion.getNumHab() == numero){
            buscado = habitacion;
        }
        
        if(habitacion.getNumHab() > numero){
            if(habitacion.getAnt_hab() == null){
                buscado = null;
            }else{
                buscado = this.buscador(habitacion.getAnt_hab(), numero);
            }
        }
        
        if(habitacion.getNumHab() < numero){
           if(habitacion.getSig_hab() == null){
                buscado = null;
            }else{
                buscado = this.buscador(habitacion.getSig_hab(), numero);
            } 
        }
           
        return buscado;
    }

      
    public Habitación getInicial() {
          return inicial;
      }

     
    public void setInicial(Habitación inicial) {
          this.inicial = inicial;
    }

    
    public void lim_men(Habitación inicial){
        int menor;
        if(inicial.getAnt_hab() == null){
            menor = inicial.getNumHab();
            this.menor = menor;
        }else{
            this.lim_men(inicial.getAnt_hab());
        }
        
        
    }
    
    public void lim_may(Habitación inicial){
        int mayor;
        if(inicial.getSig_hab() == null){
            mayor = inicial.getNumHab();
            this.mayor = mayor;
        }else{
            this.lim_may(inicial.getSig_hab());
        }
    }
      
    public int getMenor() {
        return menor;
    }
    
    public int getMayor() {
        return mayor;
    }
}
