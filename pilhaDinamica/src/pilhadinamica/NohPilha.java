/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhadinamica;

/**
 *
 * @author Work
 */
public class NohPilha <T> extends Object {
    
    NohPilha prox;
    T dado;
    
    public NohPilha(){ //    metodoconstrutor
        
        prox = null; 
    
    }

    public NohPilha getProx() {
        return prox;
    }

    public void setProx(NohPilha prox) {
        this.prox = prox;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }
    
    
}
