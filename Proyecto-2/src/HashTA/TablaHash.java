/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTA;

/**
 *
 * @author gabrielorozco
 */
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class TablaHash {
    private NodeHash[] tabla;
    private int capacidad;

    public TablaHash(int capacidad) {
        this.capacidad = capacidad;
        tabla = new NodeHash[capacidad];
    }

    private int hash(String clave) {
        int hash = 0;
        for (int i = 0; i < clave.length(); i++) {
            hash = 31 * hash + clave.charAt(i);
        }
        return Math.abs(hash) % capacidad;
    }

    public void insertar(Estado registro) {
        String clave = (registro.primerNombre + " " + registro.apellido).trim().toLowerCase();
        int indice = hash(clave);
        NodeHash nuevoNodo = new NodeHash(clave, registro);
        if (tabla[indice] == null) {
            tabla[indice] = nuevoNodo;
        } else {
            nuevoNodo.siguiente = tabla[indice]; // Asegura que enlaces correctamente la lista existente
            tabla[indice] = nuevoNodo;
        }
    }
    public void imprimirTablaHash() {
        System.out.println("Contenido de la Tabla Hash:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Índice " + i + ": ");
            NodeHash nodo = tabla[i];
            if (nodo == null) {
                System.out.println("vacío");
                continue;
            }
            while (nodo != null) {
                System.out.print("Clave: " + nodo.clave + " -> Registros: ");
                EstadoNode registroActual = nodo.cabeza;
                while (registroActual != null) {
                    System.out.print(registroActual.registro + " ");
                    registroActual = registroActual.siguiente;
                }
                nodo = nodo.siguiente;
                System.out.println(); // Salto de línea para separar los nodos en el mismo índice
            }
            System.out.println(); // Salto de línea después de imprimir todos los nodos en este índice
        }
    }
    public Estado buscar(String primerNombre, String apellido) {
        String clave = (primerNombre + " " + apellido).trim().toLowerCase();
        int indice = hash(clave);
        System.out.println("Buscando clave: " + clave + " en índice: " + indice); // Diagnóstico
        NodeHash nodo = tabla[indice];
        while (nodo != null) {
            System.out.println("Revisando nodo con clave: " + nodo.clave); // Diagnóstico
            if (nodo.clave.equals(clave)) {
                EstadoNode registroActual = nodo.cabeza;
                while (registroActual != null) {
                    System.out.println("Registro encontrado."); // Diagnóstico
                    return registroActual.registro; // Retorna el Estado encontrado
                    // registroActual = registroActual.siguiente;
                }
            }
            nodo = nodo.siguiente; // Sigue buscando en el siguiente NodoHash en caso de colisiones
        }
        System.out.println("Registro no encontrado."); // Diagnóstico
        return null; // No encontrado
    }
    public void actualizarArchivoCSV() {
    String nombreArchivo = "Booking_hotel - estado.csv"; // Nombre directo del archivo
    File archivo = new File(nombreArchivo);

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false))) { // false para sobrescribir el archivo
        // bw.write("num_hab,primerNombre,apellido,email,genero,celular,llegada\n");
        
        for (int i = 0; i < tabla.length; i++) {
            NodeHash nodo = tabla[i];
            while (nodo != null) {
                EstadoNode registroActual = nodo.cabeza;
                while (registroActual != null) {
                    bw.write(registroActual.registro.toString());
                    bw.newLine();
                    registroActual = registroActual.siguiente;
                }
                nodo = nodo.siguiente;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    }
    public boolean eliminar(String primerNombre, String apellido) {
    String clave = (primerNombre.trim().toLowerCase() + " " + apellido.trim().toLowerCase());
    int indice = hash(clave);
    NodeHash nodoActual = tabla[indice];
    NodeHash nodoPrevio = null;
    
    while (nodoActual != null) {
        if (nodoActual.clave.equals(clave)) {
            if (nodoPrevio == null) { // Es el primer nodo en la lista para este índice
                tabla[indice] = nodoActual.siguiente;
            } else {
                nodoPrevio.siguiente = nodoActual.siguiente; // Bypass del nodoActual
            }
            return true; // Registro eliminado
        }
        nodoPrevio = nodoActual;
        nodoActual = nodoActual.siguiente;
    }
    return false; // No se encontró el registro para eliminar
}

}

    


