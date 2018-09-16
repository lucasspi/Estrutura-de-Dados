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
public class Lista {
    
    private NohLista inicio;
    private NohLista fim;
    private int qtdeElementos;
    
    
     public Lista(){
        inicio = null;
        fim = null;
        qtdeElementos = 0;
        
        
    }
     
     public boolean listaVazia(){
         return inicio == null;
     }
     
     public void insereInicio(int e){
         
        NohLista novo = new NohLista(e);
        
        if(listaVazia()){
            inicio = fim = novo;
        }else{
            inicio.setAnterior(novo);
            novo.setProximo(inicio);
            inicio = novo;
        }
        qtdeElementos++;
         
     }
     public void insereFim(int e){
         
         NohLista novo = new NohLista(e);
         if(listaVazia()){
            inicio = fim = novo;
         }else{
             fim.setProximo(novo);
             novo.setAnterior(fim);
             fim = novo;
             
         }
         qtdeElementos++;
         
            
     }
     public int removeData(String sorteado, int N) {
        NohLista corrente = encontraSoldado(sorteado);
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
     
     public void imprimeDireita(){
          if(listaVazia()){
              System.out.println("Lista Vazia");
          }else{
              System.out.println("");
              NohLista corrente = inicio;
              while(corrente !=null){
                  System.out.print(corrente.getDado()+" ");
                  corrente = corrente.getProximo();
              }
              
          }
         
     }
     
        public void imprimeEsquerda(){
            if(listaVazia()){
                 System.out.println("Lista Vazia");
             }else{
                System.out.println("");
                 NohLista corrente = fim;
                 while(corrente !=null){
                     System.out.print(corrente.getDado()+" ");
                     corrente = corrente.getAnterior();
            }
           }

       }
        public void getElemento(){
            
            System.out.println("");
            System.out.println("A lista tem: "+ qtdeElementos + " elementos :)");
        }
   }