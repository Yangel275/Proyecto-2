/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejo_Csv;

/**
 *
 * @author yangel
 */
public class Hoja {
    private int raiz;
    private Hoja izq;
    private Hoja  der;

    public Hoja(int raiz) {
        this.raiz = raiz;
        this.izq = null;
        this.der = null;
    }

    
    // Raiz
    public int getRaiz() {
        return raiz;
    }
   
    public void setRaiz(int raiz) {
        this.raiz = raiz;
    }


    
    //Hoja iquierda
    public Hoja getIzq() {
        return izq;
    }

    // Hoja derecha
    public Hoja getDer() {
        return der;
    }

    public void insertar(int valor){
        if(valor < this.raiz){
            if(this.izq == null){
                this.izq = new Hoja(valor);
            }else{
                this.izq.insertar(valor);
            }
        }else{
            if(this.der == null){
                this.der = new Hoja(valor);
            }else{
                this.der.insertar(valor);
            }
        }
    
    }
    
    public void imprimir(Hoja nodo){
      String Escritura = "Hoja "+ nodo.getRaiz() + " : \n";
      if(nodo.getIzq()== null){
        Escritura += "Hoja izquierda: No tiene \n";
      }else{
        Escritura += "Hoja izquierda: "+ nodo.getIzq().raiz + "\n";
      }
      
      if(nodo.getDer() == null){
        Escritura += "Hoja izquierda: No tiene \n";
      }else{
        Escritura += "Hoja derecho: "+ nodo.getDer().raiz + "\n";
      }
      System.out.println(Escritura);
    }
    
}

