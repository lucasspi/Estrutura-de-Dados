/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_torrehanoi;

import java.util.Scanner;

/**
 *
 * @author lucasspirandeli
 */
public class Ca_torreHanoi {

  
   
    public static void main(String[] args) {
        
     
       Scanner s = new Scanner(System.in);
        System.out.println("Digite quantos discos");
       int a = s.nextInt();
       Recursão.HanoiMove(a,"PosicaoUm","PosicaoDois","PosiçaoTres");
       
    }
    
    
    
}
