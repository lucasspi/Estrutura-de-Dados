
package jaPilhaTemplate;

public class Pilha <TAD> extends Object{
    
    public TAD[] pilha;
    public int topo;
    
    public Pilha(int tam){ // METODO CONSTRUTOR
        topo = -1;
        pilha = (TAD[]) new Object[tam];
    }
    
    public boolean pilhaVazia(){
        return topo == -1;
    }
    public void push(TAD valor){
        //implementar push
        if(topo == pilha.length){
            System.out.println("Pilha Cheia!");
        }
        pilha[++topo] = valor;
        }
    
     public TAD pop(){
        if (pilhaVazia()) {
            System.out.println("Pilha Vazia!");
            return null;
           
        } else {
            return pilha[topo--];
        }
    }
     
    public void imprime(){
        if(pilhaVazia()){
            System.out.println("Pilha Vazia");
            
        } else{
            for(int i = topo; i>=0; i--){
                System.out.println(pilha[i]);
        }
        }
        
            
        }
    }

