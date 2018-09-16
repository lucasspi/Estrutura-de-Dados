/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_revisãodeprovaum;

import java.util.Scanner;

/**
 *
 * @author lucasspirandeli
 */
public class Ca_revisãodeProvaUm {

    /**
     * @param args the command line arguments
     */
    
    public void avaliar(String exp){
        
        Pilha<Character> pIni = new Pilha();
        Pilha<Character> pFim = new Pilha();
        
        for (int i = 0; exp.charAt(i) != 'C'; i++) {
            
            pIni.push(exp.charAt(i));
            
        }
        for (int j = exp.length() - 1; exp.charAt(j) != 'C'; j--) {
            
            pFim.push(exp.charAt(j));
            
        }
        while(!pIni.pilhaVazia() && !pFim.pilhaVazia()){
            if(pIni.pop() != pFim.pop()){
                System.out.println("String incorreta");
                System.exit(0);
                
            }
            
        }
        System.out.println("String correta");
        
    }
    public void executa(){
        
        String exp;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua expressao: ");
        exp = s.nextLine();


        Ca_revisãodeProvaUm c = new Ca_revisãodeProvaUm();
        c.avaliar(exp);
        
    }
    
    
    public static void main(String[] args) {
        
        Ca_revisãodeProvaUm e = new Ca_revisãodeProvaUm();
        int i;
        Scanner v = new Scanner(System.in);
        
        System.out.println("1 - AVALIAR UMA EXPRESSAO \n" +"2 - Para sair do programa");
        i = v.nextInt();
        if(i == 2){
            System.out.println("Voce saiu do programa");
        }else{
            
        
       while(i != 2 ){

            
            switch (i) {
                case 1: {
                    
                    e.executa();
                    
                    break;
                        }
                case 2: System.out.println("Voce saiu do programa :)");
                    
                    
                    break;

                    }

                }
        }

    
 
    }
}


