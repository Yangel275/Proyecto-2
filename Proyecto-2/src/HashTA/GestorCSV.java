/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTA;

/**
 *
 * @author gabrielorozco
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GestorCSV {
    public static void main(String[] args) {
        TablaHash miTabla = new TablaHash(500); // Asumiendo 500 como una capacidad adecuada
        String linea;

        try {
            BufferedReader br = new BufferedReader(new FileReader("Booking_hotel - estado.csv"));
            // Saltarse el encabezado si existe
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                // Crear un nuevo registro con todos los datos
                Estado estado = new Estado(
                    Integer.parseInt(datos[0]), // num_hab
                    datos[1], // primer_nombre
                    datos[2], // apellido
                    datos[3], // email
                    datos[4], // genero
                    datos[5], // celular
                    datos[6]  // llegada
                );
                miTabla.insertar(estado);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ejemplo de cómo realizar una búsqueda
        Integer numHab = miTabla.buscar("NombreBuscado", "ApellidoBuscado");
        if (numHab != null) {
            System.out.println("Número de habitación encontrado: " + numHab);
        } else {
            System.out.println("Registro no encontrado.");
        }
    }
}
