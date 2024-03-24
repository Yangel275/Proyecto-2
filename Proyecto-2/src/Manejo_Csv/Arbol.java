/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejo_Csv;

/**
 *
 * @author yangel
 */
public class Arbol {
  Hoja inicial;
  
  public Arbol(Hoja inicial){
      this.inicial = inicial;
  }
  
  public void insertar (int valor){
      if(this.inicial == null){
        this.inicial = new Hoja(valor);   
      }else{
          this.inicial.insertar(valor);
      }
  }
  
  public void disparadorInorden(){
      this.inorden(this.inicial);
  }
  
  public void inorden(Hoja nodo){
      if(nodo == null){
          return;
      }else{
          inorden(nodo.getIzq());
          nodo.imprimir(nodo);
          inorden(nodo.getDer());
      }
  }
  
}
