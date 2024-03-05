/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author yangel
 */
public class Datos {
    private static  simulacion = new La_simulacion();

    /**
     * @return the simulacion
     */
    public static La_simulacion getSimulacion() {
        return simulacion;
    }

    /**
     * @param simulacion1
     */
    public static void setSimulacion(La_simulacion simulacion1) {
        simulacion = simulacion1;
    }
}
