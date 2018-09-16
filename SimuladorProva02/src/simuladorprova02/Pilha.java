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
        
        
        this.setI(this.getI()+1);
                
    }

    public int getI() {
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
    
    public String imprime() { //agora ele retorna uma string
        String strPilha = ""; //string auxiliar para armazenar a pilha e mostrar na UI
        if (pilhaVazia())
            //System.out.println("A pilha esta vazia!");
            strPilha = "A pilha esta vazia!";
        else {
            NohPilha p = topo;
            while (p != null){
                //System.out.println(p.getDado().toString());
                strPilha += p.getDado() + "\n"; //vai adicionando na string e dando enter
                p = p.getProximo();
            }
        }
        return strPilha; //retorna a string com a pilha
    }
            
    
}
