/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undoredo;

/**
 *
 * @author Work
 */
public class COMANDO { //issso é uma classe
    
    private static int contador = 0;
    private int indice;
    
    public COMANDO() { //metodo construtor
        
        contador++;
        indice = contador;
    }
    
    public String toString(){
        return String.format("Comando %d", indice);
    }
    
    public void executar(){
        
        System.out.println("Comando "+indice+" executado");
    }
    
    public void desfazer(){
        System.out.println("Comando "+indice+" desfeito");
    }
    
    
    
}
