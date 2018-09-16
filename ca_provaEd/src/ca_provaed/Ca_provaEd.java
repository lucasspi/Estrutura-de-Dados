/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_provaed;

import java.util.Scanner;

public class Ca_provaEd {
    
    public void Manutencao(String expre, Pilha <String> peça){
        Pilha <String> manutencao = new Pilha(); // pilha usada parar armazer os elementos da outra enquanto esta sendo trocado
       
        if(expre != "lampada" && expre != "cupula" && expre != "helice" && expre != "suporte"){
            System.out.println("Voce digitou uma peça incorreta");
        }else{
            
            while(!peça.pop().equals(expre)){
            
            manutencao.push(peça.pop());
   
        }
        peça.push(expre);
        
        while(!manutencao.pilhaVazia()){
            peça.push(manutencao.pop());
        }
            
        }
        
        
            
        }
        
        

        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ca_provaEd x = new Ca_provaEd();
        
        Pilha <String> peça = new Pilha();

        
        String str1 = "cupula";
        String str2 = "lampada";
        String str3 = "helice";
        String str4 = "suporte";
        
        peça.push(str1);
        peça.push(str2);
        peça.push(str3);
        peça.push(str4);
        
        peça.imprime();
        
        System.out.println("Digite corretamente o nome da peça acima a ser substituida: ");
        Scanner s =new Scanner(System.in);
        String expre;
        expre = s.nextLine();
        x.Manutencao(expre, peça);
        
        
        
        
        
        
        
    }
    
}
