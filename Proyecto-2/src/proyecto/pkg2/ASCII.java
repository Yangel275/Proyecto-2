/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;

import java.util.Scanner;

/**
 *
 * @author yangel
 */
public class ASCII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Conseguir el código de cada caracter
        System.out.println("Colocar Carácteres: ");
        Scanner codigo = new Scanner(System.in);
        String numero = codigo.next();
        int suma = 0;
        String definicion = "Los carácteres: " + numero + "\n" + "La suma de cada código de cada caracter: \n";
        for(int i = 0; i < numero.length() ; i++){
            char c = numero.charAt(i);
            int Ascii = (int) c;
            int nuevo = numero.length() - 1;
            switch(i){
                case 0:
                    definicion += Integer.toString(Ascii) + " ";
                default:
                    if(i == numero.length() - 1 ){
                        definicion += Integer.toString(Ascii);
                    }else{
                        definicion += "+ "+ Integer.toString(Ascii)+ " ";
                    }
                    
            }
            suma += Ascii;
        }
        
        
        System.out.println(definicion);
        System.out.println(suma);
                
    }

       
    
}
