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
public class Lista<T> extends Object {
    
    private NohLista inicio;
    private NohLista fim;
    
    private int buffer;
    private int tamMax, qtdeElementos;
    
     public Lista(int tamMax){
        inicio = null;
        fim = null;
        buffer = 0;
        this.tamMax = tamMax;

    }
     
     public boolean listaVazia(){
         return inicio == null;
     }

     
     public void inserir(T e) {
        NohLista novo = new NohLista(e);
        if (listaVazia()) {
            inicio = fim = novo;
            novo.setProximo(novo);
            novo.setAnterior(novo);
            buffer = 1;
        } else {
            if (buffer >= tamMax) {
                fim.setProximo(novo);
                fim.setAnterior(novo);
                fim = novo;
                inicio = inicio.getProximo();
                novo.setProximo(inicio);
                inicio.setAnterior(fim);
            } else {
                fim.setProximo(novo);
                inicio.setAnterior(novo);
                novo.setProximo(inicio);
                novo.setAnterior(fim);
                fim = novo;
                buffer++;
            }
        }
    }
     public NohLista getInicio() {
        return inicio;
    }
     
     
     
    public T removeData(String sorteado, int N) {
        NohLista corrente = encontra(sorteado);
        if (N == 0) {
            T dado = (T) corrente.getDado();
            corrente.getAnterior().setProximo(corrente.getProximo());
            corrente.getProximo().setAnterior(corrente.getAnterior());
            inicio = corrente.getProximo();
            buffer--;
            return dado;
        } else if (N > 0) {
            for (int i = 1; i <= N; i++) {
                corrente = corrente.getProximo();
            }
            if (!listaVazia()) {
                T t = (T) corrente.getDado();
                corrente.getAnterior().setProximo(corrente.getProximo());
                corrente.getProximo().setAnterior(corrente.getAnterior());
                buffer--;
                return t;
            } else {
                System.out.println("Lista Vazia!");
                return null;
            }
        } else {
            for (int i = -1; i >= N; i--) {
                corrente = corrente.getAnterior();
            }
            if (!listaVazia()) {
                T t = (T) corrente.getDado();
                corrente.getAnterior().setProximo(corrente.getProximo());
                corrente.getProximo().setAnterior(corrente.getAnterior());
                buffer--;
                return t;
            } else {
                System.out.println("Lista Vazia!");
                return null;
            }
        }
    }
     
     
     public void imprime(){
          if(listaVazia()){
            System.out.println("Lista Vazia");
        }else {
            NohLista temp = inicio;
            
            do{
                    System.out.print(temp.getDado()+ " ");
                    temp = temp.getProximo();
            }while(temp != inicio); 
            
                System.out.println();
            
        }
              
          }
         
     public NohLista encontra(String e){
        int aux = 0;
        NohLista encontrar = inicio;
        
        while(aux != contaElementos() && !encontrar.getDado().equals(e))
        {
            aux++;
            encontrar = encontrar.getProximo();
        }
        
        return encontrar;
    }
     public int contaElementos() {
//        System.out.println("A lista tem " + buffer + " elementos.");
        return buffer;
    }
     
       
        public void getElemento(){
            
            System.out.println("");
            System.out.println("A lista tem: "+ qtdeElementos + " elementos :)");
        }
   }