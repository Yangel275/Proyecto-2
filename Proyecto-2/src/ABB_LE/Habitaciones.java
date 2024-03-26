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
  
        
        
    /* Insertar las Habitaciones que estarán conectado dentro del árbol binario equilibrado
    * Funciona de modo que las uniones son la mitad de la mitad, es decir, la raíz
    * es la mitad de 300, sin embargo, al haber mayor canditad de raíces de un lado que otro
    * la hoja izquierda debe contener más raíces que la derecha, por lo que se aumenta 1 a la mitad
    * es decir la raíz es 151 
    * 
    * En caso de no árbol, el primer valor que se coloqué será reconocido como raíz
    */     
    public void insertar(Habitación hab){
        if(this.getInicial() == null){
            this.setInicial(hab);   
        }else{
            this.getInicial().insertar(hab);
        }
    }

        
    public void disparador_agg_his(Histórico agregar){
        Habitación habitación = this.getInicial();
        this.agg_his(habitación, agregar);
    }
    
    public void agg_his(Habitación habitacion,  Histórico agregar){
        Habitación buscado = null;
        if(habitacion.getNumHab() == agregar.getnum_hab()){
            habitacion.agg_hist(agregar);
        }
        
        if(habitacion.getNumHab() > agregar.getnum_hab()){
            if(habitacion.getAnt_hab() == null){
                buscado = null;
            }else{
                this.agg_his(habitacion.getAnt_hab(), agregar);
            }
        }
        
        if(habitacion.getNumHab() < agregar.getnum_hab()){
           if(habitacion.getSig_hab() == null){
                buscado = null;
            }else{
                this.agg_his(habitacion.getSig_hab(), agregar);
            } 
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

    public void disparador_imp( int numero){
        Habitación hab = this.disparador_busqueda(numero);
        hab.disparador_Imp();
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
