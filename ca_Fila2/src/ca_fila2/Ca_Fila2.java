/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_fila2;

/**
 *
 * @author Work
 */
public class Ca_Fila2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fila f = new Fila();
        
        f.insere(1);
        f.insere(2);
        f.insere(3);
        f.insere(4);
        f.imprime();
      
        System.out.println("Elelmento removido: "+ f.remove());
    }
    
}
