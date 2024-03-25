/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejo_Csv;


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
    
        //Descargar Estados y enlazarlos a un Hash Table

        //Guardar Estados Hash Table

        //Descargar Reservaciones y enlazar cada objeto en forma de un ABB

        //Guardar Reservaciones ABB

    //Descargar Habitaciones y enlazarlo en forma de un ABB
    public static void main(String[] args){
        Habitación[] Habitaciones = new Habitación[5];
        Habitación nuevo = new Habitación(1,"simple",1);
        Habitaciones[0] = nuevo; 
        Habitación habitacion;
        String[] new_hab;
        int indice = 0;
        
        try (Scanner scFile = new Scanner(new File("./Proyecto2 - habitaciones.csv"))){
            while(scFile.hasNextLine()){
                indice += 1;
            }
            
            Habitaciones = new Habitación[indice];
            
            indice = 0;
            
            while(scFile.hasNextLine()){
                new_hab = scFile.nextLine().split(",");
                habitacion = new Habitación(Integer.parseInt(new_hab[0]), new_hab[1],Integer.parseInt(new_hab[2]));
                Habitaciones[indice] = habitacion;
                indice += 1;
            }
        } catch(Exception e){
            System.out.println("Error");
        }
        
        for(int i = 0; i < Habitaciones.length; i++){
            System.out.println(Habitaciones[i].toCSV());
        }
            
    }    

    //Guardar Habitaciones ABB
        
        
        
    public void Up_Hab(){
        Habitación[] Habitaciones = new Habitación[3];
        
        Habitación nuevo = new Habitación(1,"simple",1);
        Habitaciones[0] = nuevo;
        nuevo = new Habitación(2,"simple",1);
        Habitaciones[1] = nuevo;
        nuevo = new Habitación(3,"simple",1);
        Habitaciones[2] = nuevo;
        
        
        File f = new File("./Proyecto2 - habitaciones.csv");
        try(FileWriter fw = new FileWriter(f);){
            for(int i = 0; i < Habitaciones.length; i++){
                fw.write(Habitaciones[i].toCSV() +  "\n");
            } 
        }catch(Exception e){
            System.out.println("Se a producido un error");
        }

        /*Descargar Histótico y enlazarlo en forma de un ABB, además de concectar 
        * con la respectiva  habitación
        */

        //Guardar Histórico ABB
   }
}
