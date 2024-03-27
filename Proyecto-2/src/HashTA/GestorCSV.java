/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTA;

/**
 *
 * @author gabrielorozco
 */
import Interfaz.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestorCSV {
    private static TablaHash miTabla = new TablaHash(300);
    public static void cargarDatos() {
        String linea;

        try {
            BufferedReader br = new BufferedReader(new FileReader("Booking_hotel - estado.csv"));
            br.readLine(); // Saltarse el encabezado si es necesario
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                // Usa un valor predeterminado si el campo está vacío o no es numérico
                String numHab = datos[0].trim().isEmpty() ? "No registrado" : datos[0].trim();

                Estado registro = new Estado(
                    datos[0].trim(),
                    datos[1].trim().toLowerCase(),
                    datos[2].trim().toLowerCase(),
                    datos[3].trim().toLowerCase(),
                    datos[4].trim().toLowerCase(),
                    datos[5].trim(),
                    datos[6].trim()
                );
                
                miTabla.insertar(registro);
               // miTabla.imprimirTablaHash();
               

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
    // Método estático para obtener la instancia desde cualquier lugar
    public static TablaHash getTablaHash() {
        return miTabla;
    }
}
