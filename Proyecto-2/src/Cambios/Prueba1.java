package Cambios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



import Cambios.Arbol;

/**
 *
 * @author yangel
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] lista = new int[8];
        lista[0] = 8;
        lista[1] = 1;
        lista[2] = 3;
        lista[3] = 7;
        lista[4] = 6;
        lista[5] = 5;
        lista[6] = 2;
        lista[7] = 4;
        
        
        
        Orden1 prueba = new Orden1(lista);
        int[] nuevo = prueba.men_may();
        for(int i = 0; i < nuevo.length; i++ ){
            System.out.println(nuevo[i]);
        }
        
        nuevo = prueba.ordenar();
        
        Arbol Arb = new Arbol();
        
        for(int i = 0; i < nuevo.length; i++ ){
            Arb.insertar(nuevo[i]);
        }
        
        Arb.disparadorInorden();
           
        
       
    }
    
}
