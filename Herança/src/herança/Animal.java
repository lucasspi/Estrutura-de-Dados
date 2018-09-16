/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author lucasspirandeli
 */
public class Animal {
    private String tamanho;
    private double peso;
    private String cor;
    
    public void correr(){
        System.out.println("Correr como animal");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
}
