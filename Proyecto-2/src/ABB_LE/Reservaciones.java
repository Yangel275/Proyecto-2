/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB_LE;

import Objetos.Reservación;

/**
 *
 * @author yangel
 */
public class Reservaciones {
    private static Reservación inicial;
    private static int tamaño;
    private static Reservación[] guardar;
    
  
    
    public void insertar(Reservación res){
        if(this.getInicial() == null){
            this.setInicial(res);   
        }else{
            this.getInicial().insertar(res);
        }
    }

    public void disparadorInorden(){
        this.inorden(this.getInicial());
    }

    public void inorden(Reservación res){
        if(res == null){
            return;
        }else{
            inorden(res.getAnt_res());
            System.out.println(res.Hojas());
            inorden(res.getSig_res());
        }
    }
    
    
    
    public Reservación disparador_busqueda(int numero){
        Reservación reserva = this.getInicial();
        Reservación buscado = this.buscador(reserva, numero);
        return buscado;
        
    }
    
    public Reservación buscador(Reservación reserva,  int numero){
        Reservación buscado = reserva;
        if(buscado.Ci_Str_int() == numero){
            buscado = buscado;
        }
        
        if(buscado.Ci_Str_int() > numero){
            if(buscado.getAnt_res() == null){
                buscado = null;
            }else{
                buscado = this.buscador(buscado.getAnt_res(), numero);
            }
        }
        
        if(buscado.Ci_Str_int() < numero){
           if(buscado.getSig_res() == null){
                buscado = null;
            }else{
                buscado = this.buscador(buscado.getSig_res(), numero);
            } 
        }
           
        return buscado;
    }
    
    public void def_lista(){
        Reservación[] lista = new Reservación[this.Tamaño()];
        this.setGuardar(lista);
        
    }
    
    public void disparador_list(){
        Reservación reserva = this.getInicial();
        this.obj_list(reserva);
        
    }
    
    public void obj_list(Reservación reserva) {
        if(reserva == null){
            return;
        }else{
            obj_list(reserva.getAnt_res());
            this.sum_list(reserva);
            obj_list(reserva.getSig_res());
        }
    }
    
    public void sum_list(Reservación reserva){
        int i = 0;
        while(i<this.getGuardar().length){
            if(this.getGuardar()[i] == null){
                this.getGuardar()[i] = reserva;
                break;
            }
            i++;
        }
    }
    
    public int Tamaño(){
        tamaño = 0;
        Contar(this.getInicial());
        return tamaño;
        
    }
    
    private void Contar(Reservación  aux){
        if(aux != null){
            if(aux.getAnt_res() == null && aux.getSig_res() == null)
                tamaño ++;
            Contar(aux.getAnt_res());
            Contar(aux.getSig_res());
            
        }
    }

      
    public  Reservación getInicial() {
          return inicial;
      }

     
    public void setInicial(Reservación inicial) {
          this.inicial = inicial;
    }

    /**
     * @return the guardar
     */
    public  Reservación[] getGuardar() {
        return guardar;
    }

    /**
     * @param aGuardar the guardar to set
     */
    public void setGuardar(Reservación[] aGuardar) {
        guardar = aGuardar;
    }

    
    
    

    

}
