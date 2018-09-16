
package undoredo;

public class Pilha {
    public COMANDO[] pilha;
    
    public int posicaoPilha; //topo
    
    public Pilha(){
        posicaoPilha = -1;
        pilha = new COMANDO[10];
    }
    
    public boolean pilhaVazia(){
        return posicaoPilha == -1;
    }
    
    public int tamanhoPilha(){
        if (pilhaVazia()) {
            System.out.println("Pilha Vazia!");
            return posicaoPilha;
            //return 0;
        }
        return posicaoPilha + 1;
    }
    
    public void push(COMANDO comando){
        if (posicaoPilha < pilha.length - 1) {
            pilha[++posicaoPilha] = comando;
//            posicaoPilha++;
//            pilha[posicaoPilha] = valor;
        } else {
            System.out.println("Pilha Cheia!");
        }
    }
    
    public COMANDO pop(){
        if (pilhaVazia()) {
            System.out.println("Pilha Vazia!");
            return null;
        } else {
            return pilha[posicaoPilha--];
        }
    }
    
    public void imprime(){
        int temp = posicaoPilha;
        while (temp >= 0) {
            System.out.println(pilha[temp--]);
        }
        
//        while(!pilhaVazia()){
//            System.out.println(pop());
//        }
//        for (int i = 0; i <= posicaoPilha; i++) {
//            System.out.println(pilha[i]);
//        }
    }
    
}
