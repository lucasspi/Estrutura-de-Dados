/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtores;

/**
 *
 * @author lucasspirandeli
 */
public class Construtores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta(100230); 
//o construtor é chamado toda vez que eu instancio uma classe
        
        conta.imprime();
        
    }
    
}
