/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_estudospilhadinamica;

/**
 *
 * @author lucasspirandeli
 */
public class Pilha <T> extends Object {
    
    NohPilha topo;
    
    public Pilha(){
        
        topo = null;
        
    }
    public boolean pilhaVazia(){
        return topo == null;
    }
    public void push(T valor){
        NohPilha novo = new NohPilha();
        novo.setDado(valor);
        novo.setProximo(topo);
        topo = novo;
                
    }
    public T pop(){
        T desempilha;
        if(pilhaVazia()){
            System.out.println("Pilha vazia");
        }else{
            desempilha = (T) topo.getDado();
            topo = topo.getProximo();
        }
        return null;
    }
    
    public void imprime(){
        
       if(pilhaVazia()){
           System.out.println("Pilha Vazia");
           
       }else{
           NohPilha n = topo;
           while(n!=null){
               System.out.println(n.getDado().toString());
               n = n.getProximo();
           }
       }
    }
            
    
}
