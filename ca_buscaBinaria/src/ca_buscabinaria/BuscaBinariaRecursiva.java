/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_buscabinaria;

/**
 *
 * @author lucasspirandeli
 */
public class BuscaBinariaRecursiva {
    
    public int buscaBinaria(int[] vetor, int n){
        
        
        return binarySearch(vetor, n, 0, vetor.length - 1);
    }
    
    
    private int binarySearch(int[] vetor, int n, int inicio, int fim){
        int meio = (inicio+fim)/2;
        
        if (inicio>fim) {
            return -1;
            
        }
        
        if (vetor[meio] < n) {
            return binarySearch(vetor, n, meio+1, fim);
        }else if(vetor[meio]>n){
            return binarySearch(vetor, n, meio+1, meio-1);
        }else{
            return meio;
        }
    }
            
    
}
