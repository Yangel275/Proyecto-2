/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTA;

import java.util.Date;

/**
 *
 * @author gabrielorozco
 */
public class Estado {
    int numHab;
    String primerNombre;
    String apellido;
    String email;
    String genero;
    String celular;
    String llegada;

    public Estado(int numHab, String primerNombre, String apellido, String email, String genero, String celular, String llegada) {
        this.numHab = numHab;
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
        this.celular = celular;
        this.llegada = llegada;
    }