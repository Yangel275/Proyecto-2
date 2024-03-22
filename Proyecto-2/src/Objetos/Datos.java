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
    private Reservación[] Reservaciones;
    private Habitación[] Habitaciones;
    private Estado[] Estado;
    private Historial[] Historial;
    
    private static  Datos datos = new Datos();

    /**
     * @return the simulacion
     */
    public static Datos getDatos() {
        return datos;
    }

    /**
     * @param simulacion1
     */
    public static void setDatos(Datos datos1) {
        datos = datos1;
    }

    /**
     * @return the Reservaciones
     */
    public Reservación[] getReservaciones() {
        return Reservaciones;
    }

    /**
     * @param Reservaciones the Reservaciones to set
     */
    public void setReservaciones(Reservación[] Reservaciones) {
        this.Reservaciones = Reservaciones;
    }

    /**
     * @return the Habitaciones
     */
    public Habitación[] getHabitaciones() {
        return Habitaciones;
    }

    /**
     * @param Habitaciones the Habitaciones to set
     */
    public void setHabitaciones(Habitación[] Habitaciones) {
        this.Habitaciones = Habitaciones;
    }

    /**
     * @return the Estado
     */
    public Estado[] getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(Estado[] Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Historial
     */
    public Historial[] getHistorial() {
        return Historial;
    }

    /**
     * @param Historial the Historial to set
     */
    public void setHistorial(Historial[] Historial) {
        this.Historial = Historial;
    }
    
}
