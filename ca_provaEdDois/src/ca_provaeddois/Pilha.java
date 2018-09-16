x/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_provaeddois;

/**
 *
 * @author lucasspirandeli
 */
public class Pilha <T> extends Object {
    
    NohPilha topo;
    int i = 0;
    
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
        
        
        this.setI(this.getI()+1);//incrementa o getI() fazendo um contador de de quantos ele mentos
                // a variavel i foi declarada no inicio da classe
    }

    public int getI() { //geet e set que auxilia na contagem dos elementos da pilha
        return i;
    }

    public void setI(int i) {
        this.i = i;
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

