/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arboles;

import Objetos.Habitación;

/**
 *
 * @author yangel
 */
public class Ord_Hab {
    private Habitación[] lista;

    public Ord_Hab(Habitación[] lista) {
        this.lista = lista;
    }

    public Habitación[] men_may(){
        Habitación[] lista = this.getLista();
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
        Ord_Hab arreglo = new Ord_Hab(nuevo);
        
        for(int h = 0; h < nuevo.length; h++){
            System.out.println(nuevo[h].getNumHab());
        }
        nuevo = arreglo.ordenar();
        return nuevo;
    }
    
    public Habitación[] ordenar(){
        Habitación[] Lista = this.getLista();
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
            
            
            
            
            Ord_Hab cambio_1 = new Ord_Hab(lista1); 
            Habitación[] lista3 = cambio_1.ordenar();
            
            
            
            Ord_Hab cambio_2 = new Ord_Hab(lista2); 
            Habitación[] lista4 = cambio_2.ordenar();
            
            
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
    
    public Habitación[] getLista() {
        return lista;
    }

    
    
    
    
    
    
}
