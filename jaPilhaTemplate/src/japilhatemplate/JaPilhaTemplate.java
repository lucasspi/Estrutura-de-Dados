/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japilhatemplate;

/**
 *
 * @author Work
 */
public class JaPilhaTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilha<Integer> pilhaInt = new Pilha(10);    
        Pilha<String> pilhaStr = new Pilha(10);
        
        pilhaInt.push(1);
        pilhaInt.push(2);
        pilhaInt.push(3);
        
        pilhaStr.push("valor1");
        pilhaStr.push("valor2");
        pilhaStr.push("valor3");
        
        pilhaInt.imprime();
        pilhaStr.imprime();
        
        pilhaInt.pop();
        pilhaInt.imprime();
    }
    
}
