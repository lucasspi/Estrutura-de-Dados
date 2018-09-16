/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorprova02;

/**
 *
 * @author lucasspirandeli
 */
public class NohPilha <T> extends Object {
    T dado;
    NohPilha proximo;
    
    public NohPilha(){
        proximo = null;
    }
    
    public NohPilha getProximo() {
        
        return proximo;
    }
    
    public void setProximo(NohPilha prox){
        this.proximo = prox;
    }
    
    public T getDado(){
        return dado;
    }
    public void setDado(T dado){
        this.dado = dado;
        
    }
    
}
