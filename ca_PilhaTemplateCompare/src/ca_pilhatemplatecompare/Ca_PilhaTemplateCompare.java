/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_pilhatemplatecompare;

/**
 *
 * @author Work
 */
public class Ca_PilhaTemplateCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Pilha<Integer> pInt1 = new Pilha(10);
        Pilha<Integer> pInt2 = new Pilha(10);
        Pilha<Boolean> pBool = new Pilha(10);
        
        Compara c = new Compara();
        
        pInt1.push(1);
        pInt1.push(2);
        pInt1.push(3);
        pInt1.push(4);
        
        pInt2.push(1);
        pInt2.push(2);
        pInt2.push(3);
        pInt2.push(4);
        
        c.compara(pInt1, pInt2, pBool);
        
        pInt1.imprime();
        pInt2.imprime();
        pBool.imprime();
        
    }
    
}
