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
public class NodeHash {
    String clave;
    Estado valor;
    NodeHash siguiente;

    public NodeHash(String clave, Estado valor) {
        this.clave = clave;
        this.valor = valor;
        this.siguiente = null;
    }
}
