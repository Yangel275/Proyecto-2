/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashTA;

/**
 *
 * @author gabrielorozco
 */
public class EstadoList {
    EstadoNode cabeza;
    
    public EstadoList(){
        this.cabeza = null;
    }
    public void add(Estado registro){
        if (cabeza == null){
            cabeza  = new EstadoNode(registro);
        }else{
            EstadoNode actual = cabeza;
            while (actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = new EstadoNode(registro);
        }
    }
    public Estado buscarPorNombre(String nombre) {
        EstadoNode actual = cabeza;
        while (actual != null) {
            if (actual.registro.primerNombre.equals(nombre)) {
                return actual.registro;
            }
            actual = actual.siguiente;
        }
        return null;
    }
}
