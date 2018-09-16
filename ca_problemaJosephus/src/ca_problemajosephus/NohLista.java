/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_problemajosephus;

/**
 *
 * @author lucasspirandeli
 */
public class NohLista <T> extends Object{
    private NohLista anterior;
    private T dado;
    private NohLista proximo;

    public NohLista(T dado){
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
    

    public NohLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NohLista anterior) {
        this.anterior = anterior;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NohLista getProximo() {
        return proximo;
    }

    public void setProximo(NohLista proximo) {
        this.proximo = proximo;
    }
    
}
