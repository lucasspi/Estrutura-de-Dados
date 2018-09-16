package ca_problemajosephus;

import java.util.Scanner;

public class Ca_problemaJosephus {

    public static void main(String[] args) {
       Lista<String> soldados = new Lista(10);
        
        Scanner s = new Scanner(System.in);
       
        soldados.inserir("Albert");
        soldados.inserir("Barney ");
        soldados.inserir("Claudio");
        soldados.inserir("Diego");
        soldados.inserir("Eduardo");
        soldados.inserir("Fabio");
        soldados.inserir("Gustavo");
        soldados.inserir("Higor");
        soldados.inserir("Iago");
        soldados.inserir("Joao");
        
         System.out.print("Soldados: ");
        soldados.imprime();
        while (soldados.contaElementos() > 1) {
            System.out.println("Insira um numero de -9 a 9:");
            System.out.println("O soldado removido foi: " + soldados.removeData("Albert",s.nextInt()));
            System.out.print("Soldados restantes: ");
            soldados.imprime();
        }
        System.out.println("\nO soldado sobrevivente foi: " + soldados.getInicio().getDado());
       
       
       
       
    }
    
}
