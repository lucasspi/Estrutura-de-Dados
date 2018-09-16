/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_torrehanoi;

/**
 *
 * @author lucasspirandeli
 */
public class Recursão {
    
     public static void HanoiMove(int topo, String de, String aux, String para) {
    if (topo == 1){
      System.out.println("Disco 1 da " + de + " para " + para);
    }else {
      HanoiMove(topo - 1, de, para, aux);
      System.out.println("Disco " + topo + " de " + de + " to " + para);
      HanoiMove(topo - 1, aux, de, para);
    }
  }
    
}
