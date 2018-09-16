/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_estudospilhadinamica;

/**
 *
 * @author lucasspirandeli
 */
public class Ca_estudosPilhaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Pilha <Integer> p = new Pilha();
       
        
        p.push(10);
        p.push(10);
        p.push(10);
        p.push(10);
        p.imprime();
        p.pop();
        System.out.println("");
        p.imprime();
    }
    
}
