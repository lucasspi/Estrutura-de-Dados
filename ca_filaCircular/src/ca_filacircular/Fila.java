package ca_filacircular;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucasspirandeli
 */
public class Fila {
    
    private NohFila inicio;
    private NohFila fim;
    private int buffer;
    private int tamMax;
    
    public Fila(int tamMax){
        inicio = null;
        fim = null;
        buffer = 0;
        this.tamMax = tamMax;
    }
    
    public boolean filaVazia(){
        return inicio == null && fim == null;
    }
    
    public void insere(int dado){
        
        NohFila novo = new NohFila(dado);
        if(filaVazia()){
            inicio = novo;
            fim = novo;
            novo.setProximo(novo);
            buffer = 1;
        }else{
            if(buffer>=tamMax){
                fim.setProximo(novo);
                fim = novo;
                inicio = inicio.getProximo();
                novo.setProximo(inicio);
            }else{
            
            fim.setProximo(novo);
            fim = novo;
            novo.setProximo(inicio);
            buffer++;
            }
            
        }
        
        
    }
    public int remove(){
        if(filaVazia()){
            System.out.println("Fila Vazia");
            return 0; 
        }else{
            int removido = inicio.getDado();
            if(inicio ==fim){
                inicio =null;
                fim = null;
            }else{
                inicio = inicio.getProximo();
                fim.setProximo(inicio);
            }
            buffer--;
            return removido;
        }
        
        
    }
    public void imprime(){
        if(filaVazia()){
            System.out.println("Fila Vazia");
        }else {
            NohFila temp = inicio;
            
            do{
                    System.out.print(temp.getDado()+ " ");
                    temp = temp.getProximo();
            }while(temp != inicio); 
            
                System.out.println();
            
        }
            
    }
}
