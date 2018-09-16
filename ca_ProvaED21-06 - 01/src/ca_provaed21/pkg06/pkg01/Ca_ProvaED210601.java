/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_provaed21.pkg06.pkg01;

import java.util.Scanner;

/**
 *
 * @author lucasspirandeli
 */
public class Ca_ProvaED210601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista<Integer> elemento = new Lista(10);
        
        Scanner i =  new Scanner(System.in);
        
        int numero = 0;
                
        while(numero != 4){
        System.out.println("[1] Crie uma lista crescente (voce pode inserir um maximo de 8 elementos) ");
        System.out.println("[2] Remover um elemento em uma posição específica");
        System.out.println("[3] Para imprimir a lista");
        System.out.println("[4] Sair");
        
        numero = i.nextInt();
        
        switch(numero){
            case 1:
                for (int j = 0; j < 8; j++) {
                 System.out.println("Digite o numero a ser inserido na posição "+ (j+1));
                  Scanner s = new Scanner(System.in);
                   
                  int x = s.nextInt();;
                  elemento.inserir(x);
                }
                break;
            case 2:
                   System.out.println("Digite o a posição do elemento"); 
                    Scanner v = new Scanner(System.in);
                     
                   elemento.removeData("", v.nextInt());
                    break;
            case 3:
                  System.out.println("Sua lista é: " );
                  elemento.imprime();
                  break;
            case 4:
                break;
            default:
                System.out.println("Digite uma oção de 1 a 4");
        }
        }
        
        
        
        
        
       
        
        
        
        
    }
    
}
