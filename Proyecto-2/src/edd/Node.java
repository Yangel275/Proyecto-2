/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author yangel
 */
public class Node <T> {
    protected T info;
    protected Node <T> pPrev;
    protected Node <T> pNext;
    
    public Node (T elem) {
        this.info = elem;
        this.pPrev = null;
        this.pPrev = null;
    }
}
