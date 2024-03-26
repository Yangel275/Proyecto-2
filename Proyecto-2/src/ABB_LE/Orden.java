/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB_LE;

import Objetos.Habitación;
import Objetos.Histórico;
import Objetos.Reservación;

/**
 *
 * @author yangel
 */
public class Orden{
    private Habitación[] hab;
    private Reservación[] res;
    private Histórico[] his;
    
    
    
    public Histórico[] men_may_his(){
        Histórico[] lista = this.getHis();
        Histórico[] viejo = null;
        Histórico[] nuevo = null;
        
       
        for(int i=0; i < lista.length; i++){
            nuevo = new Histórico[i+1];
            if(0<i){
                for(int l = 0; l < viejo.length; l++){
                    nuevo[l] = viejo[l];
                }
                nuevo[i] = lista[i];
                for(int j = 0; j<nuevo.length; j++){
                    if(j != 0){
                        if(nuevo[j-1].getnum_hab() > nuevo[j].getnum_hab()){
                            Histórico numero = nuevo[j];
                            nuevo[j] = nuevo[j-1];
                            nuevo[j-1] = numero;
                        }
                        if(nuevo[j-1].getnum_hab() == nuevo[j].getnum_hab()){
                            if(nuevo[j-1].Date_Str_int() > nuevo[j].Date_Str_int()){
                                Histórico numero = nuevo[j];
                                nuevo[j] = nuevo[j-1];
                                nuevo[j-1] = numero;
                            }
                        }
                    }
                }
                viejo = nuevo;
                    
                    
            }else{
                nuevo[i] = lista[i];
                viejo = nuevo;
                
            }
            
        }
        
        Orden arreglo = new Orden();
        arreglo.setHis(nuevo);
        
        return nuevo;
    }
   


    public Reservación[] men_may_res(){
        Reservación[] lista = this.getRes();
        Reservación[] viejo = null;
        Reservación[] nuevo = null;
        
        int j = 0;
        for(int i=0; i < lista.length; i++){
            nuevo = new Reservación[i+1];
            j = i;
            if(0<i){
                for(int l = 0; l < viejo.length; l++){
                    nuevo[l] = viejo[l];
                }
                nuevo[i] = lista[i];
                
                while(nuevo[j-1].Ci_Str_int()>nuevo[j].Ci_Str_int()){
                    Reservación numero = nuevo[j];
                    nuevo[j] = nuevo[j-1];
                    nuevo[j-1] = numero;
                    
                    if(j-1 == 0){
                        break;
                    }
                    
                    j-=1;
                    
                }
                viejo = nuevo;
                    
                    
            }else{
                nuevo[i] = lista[i];
                viejo = nuevo;
                
            }
            
        }
        
        Orden arreglo = new Orden();
        arreglo.setRes(nuevo);
        
        nuevo = arreglo.ord_res();
        
        
        return nuevo;
    }
    
    public Reservación[] ord_res(){
        Reservación[] Lista = this.getRes();
        Reservación[] ordenada = new Reservación[Lista.length];
        
        if(Lista.length <= 3){
            
            if(Lista.length == 1){
                ordenada[0] = Lista[0];
                
        
            }
            
            if(Lista.length == 2){
                ordenada[0] = Lista[1];
                ordenada[1] = Lista[0];
                
            }
            
            if(Lista.length == 3){
                ordenada[0] = Lista[1];
                ordenada[1] = Lista[0];
                ordenada[2] = Lista[2];
                
            }

        }else{
            
            double mitad = Lista.length;
            mitad = mitad/2;
            mitad = Math.round(mitad);
            
            int primero = (int)mitad;
            int izq = primero; 
            int der = Lista.length - primero;
            
            if(izq == der){
                der -= 1;
                primero +=1;
            }else{
                izq -= 1;
            }
            

            Reservación[] lista1 = new Reservación[izq];
            Reservación[] lista2 = new Reservación[der];
            int j = 0;
            int k = 0;

            for(int i = 0; i < Lista.length; i++){
                if(i < primero -1){
                    lista1[j] = Lista[i];
                    j +=1;
                }
                
                if(i == primero - 1){
                    ordenada[0] = Lista[i];
                }
                
                if(i > primero - 1){
                    lista2[k] = Lista[i];
                    k +=1;
                }
            }
            
            
            
            
            Orden cambio_1 = new Orden();
            cambio_1.setRes(lista1);
            Reservación[] lista3 = cambio_1.ord_res();
            
            
            
            Orden cambio_2 = new Orden();
            cambio_2.setRes(lista2);
            Reservación[] lista4 = cambio_2.ord_res();
            
            
            j = ordenada.length - 1 ;
            int l = lista3.length - 1;
            int t = lista4.length - 1;
            
            while(j > 0){
                if(l > t){
                    ordenada[j] = lista3[l];
                    j -= 1;
                    l -= 1;
                }
                ordenada[j] = lista4[t];
                j -= 1;
                t -= 1;
                ordenada[j] = lista3[l];
                j -= 1;
                l -= 1;
            }

        }
        
        return ordenada;
    }
    
    
    
    
    public Habitación[] men_may_hab(){
        Habitación[] lista = this.gethab();
        Habitación[] viejo = null;
        Habitación[] nuevo = null;
        
        int j = 0;
        for(int i=0; i < lista.length; i++){
            nuevo = new Habitación[i+1];
            j = i;
            if(0<i){
                for(int l = 0; l < viejo.length; l++){
                    nuevo[l] = viejo[l];
                }
                nuevo[i] = lista[i];
                
                while(nuevo[j-1].getNumHab()>nuevo[j].getNumHab()){
                    Habitación numero = nuevo[j];
                    nuevo[j] = nuevo[j-1];
                    nuevo[j-1] = numero;
                    
                    if(j-1 == 0){
                        break;
                    }
                    
                    j-=1;
                    
                }
                viejo = nuevo;
                    
                    
            }else{
                nuevo[i] = lista[i];
                viejo = nuevo;
                
            }
            
        }
        Orden arreglo = new Orden();
        arreglo.setHab(nuevo);
        
        nuevo = arreglo.ord_hab();
        
        return nuevo;
    }
    
    public Habitación[] ord_hab(){
        Habitación[] Lista = this.gethab();
        Habitación[] ordenada = new Habitación[Lista.length];
        
        if(Lista.length <= 3){
            
            if(Lista.length == 1){
                ordenada[0] = Lista[0];
                
        
            }
            
            if(Lista.length == 2){
                ordenada[0] = Lista[1];
                ordenada[1] = Lista[0];
                
            }
            
            if(Lista.length == 3){
                ordenada[0] = Lista[1];
                ordenada[1] = Lista[0];
                ordenada[2] = Lista[2];
                
            }

        }else{
            
            double mitad = Lista.length;
            mitad = mitad/2;
            mitad = Math.round(mitad);
            
            int primero = (int)mitad;
            int izq = primero; 
            int der = Lista.length - primero;
            
            if(izq == der){
                der -= 1;
                primero +=1;
            }else{
                izq -= 1;
            }
            

            Habitación[] lista1 = new Habitación[izq];
            Habitación[] lista2 = new Habitación[der];
            int j = 0;
            int k = 0;

            for(int i = 0; i < Lista.length; i++){
                if(i < primero -1){
                    lista1[j] = Lista[i];
                    j +=1;
                }
                
                if(i == primero - 1){
                    ordenada[0] = Lista[i];
                }
                
                if(i > primero - 1){
                    lista2[k] = Lista[i];
                    k +=1;
                }
            }
            
            
            
            
            Orden cambio_1 = new Orden();
            cambio_1.setHab(lista1);
            Habitación[] lista3 = cambio_1.ord_hab();
            
            
            
            Orden cambio_2 = new Orden();
            cambio_2.setHab(lista2);
            Habitación[] lista4 = cambio_2.ord_hab();
            
            
            j = ordenada.length - 1 ;
            int l = lista3.length - 1;
            int t = lista4.length - 1;
            
            while(j > 0){
                if(l > t){
                    ordenada[j] = lista3[l];
                    j -= 1;
                    l -= 1;
                }
                ordenada[j] = lista4[t];
                j -= 1;
                t -= 1;
                ordenada[j] = lista3[l];
                j -= 1;
                l -= 1;
            }

        }
        
        return ordenada;
    }
    
    
    
    public Habitación[] gethab() {
        return hab;
    }

    public void setHab(Habitación[] hab) {
        this.hab = hab;
    }

    
    
    public Reservación[] getRes() {
        return res;
    }
    
    public void setRes(Reservación[] res) {
        this.res = res;
    }

    
    public Histórico[] getHis() {
        return his;
    }

    
    public void setHis(Histórico[] his) {
        this.his = his;
    }
    
    

    
    
    
    
    
    
}
