/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTA;

/**
 *
 * @author gabrielorozco
 */
public class EstadoNode {
    Estado registro;
    EstadoNode siguiente;
    
    public EstadoNode(Estado registro){
        this.registro = registro;
        this.siguiente = null;
    }
}
