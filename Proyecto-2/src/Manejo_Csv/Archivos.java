/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejo_Csv;


import Arboles.Habitaciones;
import Arboles.Ord_Hab;
import Objetos.Estado;
import Objetos.Habitación;
import Objetos.Historial;
import Objetos.Reservación;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author yangel
 */
public class Archivos {
    
    

        /*Descargar Histótico y enlazarlo en forma de un ABB, además de concectar 
        * con la respectiva  habitación
        */

        //Guardar Histórico ABB
    
    
        //Descargar Estados y enlazarlos a un Hash Table

        //Guardar Estados Hash Table

        //Descargar Reservaciones y enlazar cada objeto en forma de un ABB

        //Guardar Reservaciones ABB

    //Descargar Habitaciones y enlazarlo en forma de un ABB
    public void Down_Hab(){
        Habitación[] nueva = null;
        Habitación[] vieja = null;
        Habitación habitacion;
        String[] new_hab;
        int indice = 0;
        int inicio = 0;
        
        try (Scanner scFile = new Scanner(new File("./Booking_hotel - habitaciones.csv"))){
            
            while(scFile.hasNextLine()){
                if(inicio == 0){
                    new_hab = scFile.nextLine().split(",");
                    inicio = 1; 
                }else{
                    new_hab = scFile.nextLine().split(",");
                    indice += 1;
                    habitacion = new Habitación(Integer.parseInt(new_hab[0]), new_hab[1],Integer.parseInt(new_hab[2]));
                    nueva = new Habitación[indice];
                    if(indice > 1){
                        for(int i = 0; i < vieja.length; i++)
                            nueva[i] = vieja [i];
                    }
                    nueva[indice-1] = habitacion;
                    vieja = nueva;
                }
            }
            
        } catch(Exception e){
            System.out.println("Error");
        }
        
        Ord_Hab orden = new Ord_Hab(nueva) ;
        nueva = orden.ordenar();
        
        Habitaciones arbol = new Habitaciones();
        
        for (int i = 0; i < nueva.length; i++) {
            arbol.insertar(nueva[i]);
            
        }
        
        arbol.lim_may(arbol.getInicial());
        arbol.lim_men(arbol.getInicial());
        
        
            
    }    

    
    //Guardar Habitaciones ABB
    public static void main(String[] args){
        
        
        
        Archivos nuevo = new Archivos();
        nuevo.Down_Hab();
        Habitaciones arbol = new Habitaciones();
        
        System.out.println(arbol.getInicial().toCSV());
        System.out.println(arbol.disparador_busqueda(144).toCSV());
        File f = new File("./Proyecto2 - habitaciones.csv");
        try(FileWriter fw = new FileWriter(f);){
            fw.write("num_hab,tipo_hab,piso\n");
            for(int i = arbol.getMenor(); i <= arbol.getMayor(); i++){
                Habitación buscado = arbol.disparador_busqueda(i);
                fw.write( buscado.toCSV()+  "\n");
            } 
        }catch(Exception e){
            System.out.println("Se a producido un error");
        }
    }
     
}
