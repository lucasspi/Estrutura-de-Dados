/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_filacircular;

import java.util.Scanner;

/**
 *
 * @author lucasspirandeli
 */
public class Ca_filaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fila f = new Fila(5);
        
        Scanner s = new Scanner(System.in);
        int opcao = 0;
        int elemento = 0;
        
        while(opcao !=  3){
            System.out.println("Escolha uma opçao: ");
            System.out.println("1 - Produzir. ");
            System.out.println("2 - Consumir. ");
            System.out.println("3 - Sair. ");
            
            opcao = s.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("Fila Atual");
                    f.insere(elemento++);
                    f.imprime();
                    break;
                case 2:
                    System.out.println("Elemento " +f.remove()+" removido com sucesso" );
                    System.out.println("Fila Atual");
                    f.insere(elemento++);
                    
                    break;
            }
            
        }
        
    }
    
}
