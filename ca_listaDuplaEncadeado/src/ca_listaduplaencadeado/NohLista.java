/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_listaduplaencadeado;

/**
 *
 * @author lucasspirandeli
 */
public class NohLista {
    
    private int dado;
    private NohLista proximo;
    private NohLista anterior;
    
    
    public NohLista( int dado){
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
    

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NohLista getProximo() {
        return proximo;
    }

    public void setProximo(NohLista proximo) {
        this.proximo = proximo;
    }

    public NohLista getAnterior() {
        return anterior;
    }

    public void setAnterior(NohLista anterior) {
        this.anterior = anterior;
    }
    
    
    
    
}
