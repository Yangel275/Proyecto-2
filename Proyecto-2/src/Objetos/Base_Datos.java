/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author yangel
 */
public class Base_Datos {
    private static  Datos datos = new Datos();

    /**
     * @return the simulacion
     */
    public static Datos getDatos() {
        return datos;
    }

    /**
     * @param datos1
     */
    public static void setDatos(Datos datos1) {
        datos = datos1;
    }
}
