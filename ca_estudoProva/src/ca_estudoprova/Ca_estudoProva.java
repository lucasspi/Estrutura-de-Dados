/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_estudoprova;

/**
 *
 * @author lucasspirandeli
 */
public class Ca_estudoProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pilha<Integer> i = new Pilha(10);
        
        i.push(1);
        i.push(1);
        i.push(2);
        i.push(3);
        i.imprime();
        i.pop();
        i.imprime();
        // TODO code application logic here
    }
    
}
