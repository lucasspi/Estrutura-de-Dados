/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_fila2;

/**
 *
 * @author Work
 */
public class NohFila {
    
    private int dado;
    private NohFila proximo;

    public NohFila() { //metodo construtor
        dado = 0;
        proximo = null;
    }

    public NohFila(int dado) { //metodo construtor
        this.dado = dado;
        this.proximo = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NohFila getProximo() {
        return proximo;
    }

    public void setProximo(NohFila proximo) {
        this.proximo = proximo;
    }
    
    
    
}
