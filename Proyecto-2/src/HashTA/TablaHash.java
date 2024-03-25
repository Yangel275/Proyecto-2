/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTA;

/**
 *
 * @author gabrielorozco
 */
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
            hash += clave.charAt(i);
        }
        return hash % capacidad;
    }

    public void insertar(Estado registro) {
        String clave = registro.primerNombre + " " + registro.apellido;
        int indice = hash(clave);
        NodeHash nuevoNodo = new NodeHash(clave, registro);
        if (tabla[indice] == null) {
            tabla[indice] = nuevoNodo;
        } else {
            NodeHash temp = tabla[indice];
            temp.siguiente = nuevoNodo; // Insertar al principio para simplicidad
        }
    }

    public Integer buscar(String primerNombre, String apellido) {
        String clave = primerNombre + " " + apellido;
        int indice = hash(clave);
        NodeHash temp = tabla[indice];
        while (temp != null) {
            if (temp.clave.equals(clave)) {
                return temp.valor.numHab;
            }
            temp = temp.siguiente;
        }
        return null; // No encontrado
    }
}
