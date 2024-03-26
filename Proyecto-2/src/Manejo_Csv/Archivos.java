/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejo_Csv;

import ABB_LE.Habitaciones;
import ABB_LE.Orden;
import ABB_LE.Reservaciones;

import Objetos.Habitación;
import Objetos.Histórico;
import Objetos.Reservación;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author yangel
 */
public class Archivos {

    /*
       Orden recomendado para el inicializador
        nuevo.Down_Hab();
        nuevo.Down_res();
        nuevo.Down_his();
        
        Orden recomendado para subir la informacion a los csv
        nuevo.Up_Hab();
        nuevo.Up_his();
        nuevo.Up_his();
    */ 
    /*Descargar Histórico y posicionar cada objeto en relación a cada habitación 
        de manera que el nodo inicial sea la última persona
        Se dará forma como una Lista enlazada
     */
    public void Down_his() {
        
        Histórico[] nueva = null;
        Histórico[] vieja = null;
        Histórico historial;
        String[] new_his;
        int indice = 0;
        int inicio = 0;

        try (Scanner scFile = new Scanner(new File("./Booking_hotel - Histórico.csv"))) {

            while (scFile.hasNextLine()) {
                if (inicio == 0) {
                    new_his = scFile.nextLine().split(",");
                    inicio = 1;
                } else {
                    new_his = scFile.nextLine().split(",");
                    indice += 1;
                    historial = new Histórico(new_his[0], new_his[1], new_his[2], new_his[3], new_his[4], new_his[5], Integer.parseInt(new_his[6]));
                    nueva = new Histórico[indice];
                    if (indice > 1) {
                        for (int i = 0; i < vieja.length; i++) {
                            nueva[i] = vieja[i];
                        }
                    }
                    nueva[indice - 1] = historial;
                    vieja = nueva;
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        Orden orden = new Orden();
        orden.setHis(nueva);

        nueva = orden.men_may_his();

        Archivos ajuste = new Archivos();
       
        
        
        Habitaciones hab = new Habitaciones();
        
        
        for(int i =0 ; i < nueva.length; i++ ){
            hab.disparador_agg_his(nueva[i]);
        }
    }

    //Guardar Histórico Lista enlazada
    public void Up_his(){

        Habitaciones arbol = new Habitaciones();

        File f = new File("./Booking_hotel - Histórico.csv");
        try (FileWriter fw = new FileWriter(f);) {
            fw.write("num_hab,tipo_hab,piso\n");
            for (int i = arbol.getMenor(); i <= arbol.getMayor(); i++) {
                Habitación buscado = arbol.disparador_busqueda(i);
                if(buscado.getTamaño()>0){
                    Histórico aux = buscado.getpFirst(); 
                    for(int j = 0; j<buscado.getTamaño(); j++){
                        fw.write(aux.toCSV() + "\n");
                        aux = aux.getNext();
                    }
                }
                    
            }
        } catch (Exception e) {
            System.out.println("Se a producido un error");
        }

    }
    
    
    
    //Descargar Reservaciones y enlazarlo en forma de un ABB
    public void Down_res() {
        Reservación[] nueva = null;
        Reservación[] vieja = null;
        Reservación reserva;
        String[] new_res;
        int indice = 0;
        int inicio = 0;

        try (Scanner scFile = new Scanner(new File("./Booking_hotel - reservas.csv"))) {

            while (scFile.hasNextLine()) {
                if (inicio == 0) {
                    new_res = scFile.nextLine().split(",");
                    inicio = 1;
                } else {
                    new_res = scFile.nextLine().split(",");
                    indice += 1;
                    reserva = new Reservación(new_res[0], new_res[1], new_res[2], new_res[3], new_res[4], new_res[5], new_res[6], new_res[7], new_res[8]);
                    nueva = new Reservación[indice];
                    if (indice > 1) {
                        for (int i = 0; i < vieja.length; i++) {
                            nueva[i] = vieja[i];
                        }
                    }
                    nueva[indice - 1] = reserva;
                    vieja = nueva;
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        Orden orden = new Orden();
        orden.setRes(nueva);

        nueva = orden.men_may_res();

        Reservaciones arbol = new Reservaciones();

        for (int i = 0; i < nueva.length; i++) {
            arbol.insertar(nueva[i]);

        }

        arbol.def_lista();
        arbol.disparador_list();

    }

    //Guardar Reservaciones ABB
    public void Up_res() {

        Reservaciones arbol = new Reservaciones();
        arbol.def_lista();
        arbol.disparador_list();

        Reservación[] guardar = arbol.getGuardar();

        File f = new File("./Booking_hotel - reservas.csv");
        try (FileWriter fw = new FileWriter(f);) {
            fw.write("ci,primer_nombre,segundo_nombre,email,genero,tipo_hab,celular,llegada,salida\n");
            for (int i = 0; i < guardar.length; i++) {
                Reservación buscado = guardar[i];
                fw.write(buscado.toCSV() + "\n");
            }
        } catch (Exception e) {
            System.out.println("Se a producido un error");
        }

    }

    //Descargar Habitaciones y enlazarlo en forma de un ABB
    public void Down_Hab(){
        Habitación[] nueva = null;
        Habitación[] vieja = null;
        Habitación habitacion;
        String[] new_hab;
        int indice = 0;
        int inicio = 0;

        
        
        try (Scanner scFile = new Scanner(new File("./Booking_hotel - habitaciones.csv"))) {
            while (scFile.hasNextLine()) {
                if (inicio == 0) {
                    new_hab = scFile.nextLine().split(",");
                    inicio = 1;
                }else{
                    new_hab = scFile.nextLine().split(",");
                    indice += 1;
                    habitacion = new Habitación(Integer.parseInt(new_hab[0]), new_hab[1], Integer.parseInt(new_hab[2]));
                    nueva = new Habitación[indice];
                    if (indice > 1) {
                        for (int i = 0; i < vieja.length; i++) {
                            nueva[i] = vieja[i];
                        }
                    }
                    nueva[indice - 1] = habitacion;
                    vieja = nueva;
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        Orden orden = new Orden();
        orden.setHab(nueva);

        nueva = orden.men_may_hab();

        Habitaciones arbol = new Habitaciones();

        for (int i = 0; i < nueva.length; i++) {
            arbol.insertar(nueva[i]);

        }

        arbol.lim_may(arbol.getInicial());
        arbol.lim_men(arbol.getInicial());
    }

    //Guardar Habitaciones ABB
    public void Up_Hab() {
        Habitaciones arbol = new Habitaciones();

        File f = new File("./Booking_hotel - habitaciones.csv");
        try (FileWriter fw = new FileWriter(f);) {
            fw.write("num_hab,tipo_hab,piso\n");
            for (int i = arbol.getMenor(); i <= arbol.getMayor(); i++) {
                Habitación buscado = arbol.disparador_busqueda(i);
                fw.write(buscado.toCSV() + "\n");
            }
        } catch (Exception e) {
            System.out.println("Se a producido un error");
        }

    }

}
