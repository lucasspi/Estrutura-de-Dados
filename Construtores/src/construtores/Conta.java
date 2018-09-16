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
public class Conta {
    
    private int numeroConta;
    private double saldo;
    //A ideia do construtor é deixar a classe pronta para ser usada
    
    public Conta( int nConta){
        
        System.out.println("Contrutor Invocado");
        this.numeroConta = nConta;
        
    }
    public void imprime(){
        System.out.println(this.numeroConta);
    }
    
}
