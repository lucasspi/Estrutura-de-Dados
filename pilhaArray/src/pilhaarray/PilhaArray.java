/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaarray;

import java.util.Arrays;

/**
 *public
 * private
 * static
 * void significa um metodo que nao vai retorno
 * ENUM = 
 * @author Work
 */
public class PilhaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       
       PilhaDupla p = new PilhaDupla();
       
       p.empilha(PilhaDupla.Pilha.INFERIOR,1);
       p.empilha(PilhaDupla.Pilha.SUPERIOR,10);
       p.empilha(PilhaDupla.Pilha.SUPERIOR,9);
       p.empilha(PilhaDupla.Pilha.SUPERIOR,4);
        System.out.println(p.desempilha(PilhaDupla.Pilha.SUPERIOR));
        System.out.println(p.desempilha(PilhaDupla.Pilha.SUPERIOR));
       System.out.println(Arrays.toString(p.A));
    }
    
}
