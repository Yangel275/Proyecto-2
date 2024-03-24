/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Manejo_Csv;

/**
 *
 * @author yangel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] lista = new int[7];
        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;
        lista[3] = 4;
        lista[4] = 5;
        lista[5] = 6;
        lista[6] = 7;
        
        
        
        Orden prueba = new Orden(lista);
        int[] nuevo = prueba.ordenar();
        
        Arbol Arb = new Arbol();
        
        for(int i = 0; i < nuevo.length; i++ ){
            Arb.insertar(nuevo[i]);
        }
        
        Arb.disparadorInorden();
           
        
       
    }
    
}
