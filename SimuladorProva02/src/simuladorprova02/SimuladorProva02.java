/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorprova02;

import java.util.Scanner;


/**
 *
 * @author lucasspirandeli
 */
public class SimuladorProva02 {

    
    
    
    public static void main(String[] args) {
        
        Pilha <String> sedex = new Pilha(); 
        
        String txt;
        
        Scanner s = new Scanner(System.in);
        
        Scanner a = new Scanner(System.in);

        int j = 0;
        
        while(j !=6){
            
            System.out.println("Digite qual opção a seguir você deseja realizar: \n\n"
                +"1 - Inserir nova correspondencia\n"+
                "2 - Remover Correspondencia da sacola\n"+
                "3 - Verificar se a sacola esta cheia ou vazia\n"+
                "4 - Verificar as proximas correspondencias a serem entregas\n"+
                "5 - Informar quantas correspondecias existem na sacola\n"+
                "6 - Sair do programa\n");
      
                j = a.nextInt();
        
            switch(j){
                case 1: {
                    
                    System.out.println("Digite a correspondencia a ser empilhada:");
                    txt = s.nextLine();
                    sedex.push(txt);
                    System.out.println("Sua correspondencia foi adicionada com sucesso");
                    
                    break;
                }
                case 2: {
                    sedex.pop();
                    System.out.println("Sua correspondencia foi removida com sucesso");
                    break;

                }
                case 3: {
                    if(!sedex.pilhaVazia()){
                        System.out.println("Pilha contem termos = Pilha cheia");
                            
                        }else{
                        System.out.println("Pilha Vazia");
                    }
                   
                }
                case 4: {
                    System.out.println("A proxima correspondencia a ser entrega é: " + sedex.topo.dado);
                    break;
                }
                case 5: {
                    System.out.println("Voce tem: "+ sedex.getI()+" para entregar");
                    
                    
                    break;
                    }
                    
                    
                
                case 6:
                    System.out.println("Voce saiu do programa");
                    System.exit(0);
            }
        }
        
        
        
        
    }
    
}
