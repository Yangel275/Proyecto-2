/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author yangel
 * @param <T>
 */
public class List <T> {
    Node <T> pFirst;
    Node <T> pLast;
    int size;
    
    public List () {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public boolean isEmpty () {
        return this.pFirst == null;
    }
    
    public void append (T elem) {
        Node <T> pNew = new Node(elem);
        if (this.isEmpty()) {
            this.pFirst = pNew;
            this.pLast = pNew;
        } else {
            this.pLast.pNext = pNew;
            this.pLast =  pNew;
        }
        this.size++;
    }
    
    public T elementAt (int index) {
        int i = -1;
        for (Node <T> pAux = this.pFirst; pAux != null; pAux = pAux.pNext) {
            i++;
            if (i == index) {
                return pAux.info;
            }
        }
        return null;
    }
}
