/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhadinamica;

/**
 *
 * @author Work
 */
public class PilhaDinamica {

  
    public static void main(String[] args) {
        Pilha<Integer> p = new Pilha(); //
        
        p.push(1);
        p.push(2);
        p.push(3);
        
        p.imprime();
        p.pop();
       
        
        p.imprime();
    }
    
}
