/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Work
 */
public class Pilha<T> extends Object {
    
    NohPilha topo;
    
    public Pilha(){
        topo = null; //criei a pilha mas nao coloco nada
    }
    
    public boolean pilhaVazia(){
        return topo == null; //isso verifica se a puilha esta vazia
    }
    
    public void push(T valor){
        NohPilha novo = new NohPilha(); //novo elekmento nohpilha
        novo.setDado(valor); // valor é o valor que foi colocado no push da classe principal
        novo.setProx(topo); //encadeamento entre os nós da pilha
        topo = novo;
    }
    
     public T pop(){
         T desempilhado;
        if (pilhaVazia()) {
            System.out.println("Pilha Vazia!");
            return null;
           
        }
        else {
            desempilhado = (T) topo.getDado(); 
            topo = topo.getProx();
            
            
        }
        return null;
     }
    
    
    public String imprime(){
        String strPilha;
        strPilha = "";
        if(pilhaVazia()){
            System.out.println("A pilha esta vazia!");
            strPilha = "A pilha esta vazia!";
            
        }else{
            NohPilha n = topo;
            while(n!=null){
             //   System.out.println(n.getDado().toString());
             strPilha += n.getDado()+ "\n";
                n=n.getProx();
                
            }
            
        }
        return strPilha;
    }
}
