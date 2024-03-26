/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cambios;

/**
 *
 * @author yangel
 */
public class Orden1 {
    private int[] lista;

    public Orden1(int[] lista) {
        this.lista = lista;
    }

    public int[] men_may(){
        int[] lista = this.getLista();
        int[] viejo = null;
        int[] nuevo = null;
        
        int j = 0;
        for(int i=0; i < lista.length; i++){
            nuevo = new int[i+1];
            j = i;
            if(0<i){
                for(int l = 0; l < viejo.length; l++){
                    nuevo[l] = viejo[l];
                }
                nuevo[i] = lista[i];
                
                while(nuevo[j-1]>nuevo[j]){
                    int numero = nuevo[j];
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
        return nuevo;
    }
    
    
    public int[] ordenar(){
        int[] Lista = this.getLista();
        int[] ordenada = new int[Lista.length];
        
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
            

            int[] lista1 = new int[izq];
            int[] lista2 = new int[der];
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
            
            
            
            
            Orden1 cambio_1 = new Orden1(lista1); 
            int[] lista3 = cambio_1.ordenar();
            
            
            
            Orden1 cambio_2 = new Orden1(lista2); 
            int[] lista4 = cambio_2.ordenar();
            
            
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
    
    public int[] getLista() {
        return lista;
    }
    
}
