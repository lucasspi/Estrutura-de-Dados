/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author lucasspirandeli
 */
public class Casa {
    // uma classe precisa ter :
    //Atributos
    int numeroConta;
    private double saldo =100; // ser privete coloca essa variavel apenas nessa clase
    
    //Comportamentos - Metodos
    public void depositar(double valorDepositar){
           this.saldo = this.saldo + valorDepositar;
           
    }
    public void sacar(double valorSacar){
        this.saldo = this.saldo - valorSacar;
    }
    //this. - é para referenciar a um metodo dentro desta classe
    
   
    
}
