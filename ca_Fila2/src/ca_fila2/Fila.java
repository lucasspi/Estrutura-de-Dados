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
public class Fila {
    
    private NohFila inicio;
    private NohFila fim;
    
    public Fila(){
        inicio = null;
        fim = null;
    }
    
    public boolean filaVazia(){
        return inicio == null && fim==null;
    }
    
    public void insere(int dado){ //o valor de dado sera atribuido lá no main
        NohFila novoNo = new NohFila(dado);
        if(filaVazia()){
            inicio = novoNo;
            fim = novoNo;
        }else{
            fim.setProximo(novoNo);//colocando valor
            fim = novoNo; //colocando posicao
           
        }
    }
    public void imprime(){
        if(filaVazia()){
            System.out.println(" Fila Vazia! ");
        }else{
            NohFila temp = inicio;
            while(temp != null){
                System.out.println(temp.getDado());
                temp = temp.getProximo();
            }
        }
    }
    public int remove(){
        
        if(filaVazia()){
            System.out.println("Fila Vazia");
        }else{
        int removido = inicio.getDado();
        inicio = inicio.getProximo();
        return removido;
       
        }
        return (0);
        
        
   
        
        
        
    }

}
