/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTA;
//<T> parametro cualquiera
/**
 *
 * @author gabrielorozco
 */
class NodeHash {
    String clave; // La clave compuesta de nombre y apellido
    EstadoNode cabeza; // El inicio de una lista enlazada de registros Estado
    NodeHash siguiente; // Para manejar colisiones en la tabla hash

    public NodeHash(String clave, Estado registroInicial) {
        this.clave = clave;
        this.cabeza = new EstadoNode(registroInicial); // Inserta el primer registro en la lista
        this.siguiente = null;
    }

    // Método para añadir un registro a la lista enlazada dentro de este nodo hash
    public void añadirRegistro(Estado registro) {
        EstadoNode nuevoRegistro = new EstadoNode(registro);
        nuevoRegistro.siguiente = cabeza;
        cabeza = nuevoRegistro;
    }
}


