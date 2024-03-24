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
  private Hoja inicial;
  
  public void insertar (int valor){
      if(this.getInicial() == null){
          this.setInicial(new Hoja(valor));   
      }else{
          this.getInicial().insertar(valor);
      }
  }
  
  public void disparadorInorden(){
      this.inorden(this.getInicial());
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

    /**
     * @return the inicial
     */
    public Hoja getInicial() {
        return inicial;
    }

    /**
     * @param inicial the inicial to set
     */
    public void setInicial(Hoja inicial) {
        this.inicial = inicial;
    }
  
}
