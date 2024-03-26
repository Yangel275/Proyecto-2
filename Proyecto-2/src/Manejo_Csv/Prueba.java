/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejo_Csv;


/**
 *
 * @author yangel
 */
public class Prueba {
    public static void main(String[] args){
        String palabra1 = "30.880.914";
        String palabra2 = "30.136.063";
        String palabra3 = "7.952.219";
        String palabra4 = "5.971.537";
        String palabra5 = "30.880.914";
        
        String[] numero1 = palabra1.split("\\.");
        int nuevonumero1 = Integer.parseInt(numero1[0])*1000000 + Integer.parseInt(numero1[1])*1000 + Integer.parseInt(numero1[2]);
        System.out.println(nuevonumero1);
        
        String[] numero2 = palabra2.split("\\.");
        int nuevonumero2 = Integer.parseInt(numero2[0])*1000000 + Integer.parseInt(numero2[1])*1000 + Integer.parseInt(numero2[2]);
        System.out.println(nuevonumero2);
        
        if(nuevonumero1 < nuevonumero2){
            System.out.println(palabra2+" es mayor que "+palabra1);
        }else{
            if(nuevonumero1 > nuevonumero2){
                System.out.println(palabra1+" es mayor que "+palabra2);
            }else{
                System.out.println(palabra1+" es igual a "+palabra2);
            }
        }
        
        numero2 = palabra3.split("\\.");
        nuevonumero2 = Integer.parseInt(numero2[0])*1000000 + Integer.parseInt(numero2[1])*1000 + Integer.parseInt(numero2[2]);
        System.out.println(nuevonumero2);
        
        if(nuevonumero1 < nuevonumero2){
            System.out.println(palabra3+" es mayor que "+palabra1);
        }else{
            if(nuevonumero1 > nuevonumero2){
                System.out.println(palabra1+" es mayor que "+palabra3);
            }else{
                System.out.println(palabra1+" es igual a "+palabra3);
            }
        }
        
        numero2 = palabra4.split("\\.");
        nuevonumero2 = Integer.parseInt(numero2[0])*1000000 + Integer.parseInt(numero2[1])*1000 + Integer.parseInt(numero2[2]);
        System.out.println(nuevonumero2);
        
        if(nuevonumero1 < nuevonumero2){
            System.out.println(palabra4+" es mayor que "+palabra1);
        }else{
            if(nuevonumero1 > nuevonumero2){
                System.out.println(palabra1+" es mayor que "+palabra4);
            }else{
                System.out.println(palabra1+" es igual a "+palabra4);
            }
        }
        
        numero2 = palabra5.split("\\.");
        nuevonumero2 = Integer.parseInt(numero2[0])*1000000 + Integer.parseInt(numero2[1])*1000 + Integer.parseInt(numero2[2]);
        System.out.println(nuevonumero2);
        if(nuevonumero1 < nuevonumero2){
            System.out.println(palabra5+" es mayor que "+palabra1);
        }else{
            if(nuevonumero1 > nuevonumero2){
                System.out.println(palabra1+" es mayor que "+palabra5);
            }else{
                System.out.println(palabra1+" es igual a "+palabra5);
            }
        }
    }
    
    
    
}
