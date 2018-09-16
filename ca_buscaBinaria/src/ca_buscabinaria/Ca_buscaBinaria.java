
package ca_buscabinaria;

import java.util.Scanner;

public class Ca_buscaBinaria {

   
    public static void main(String[] args) {
        BuscaBinariaRecursiva b = new BuscaBinariaRecursiva();
        int tam= 6;
        int procurado = 3;
        int[] vet = new int[tam];
//        for (int i = 0; i < tam; i++) {
//            System.out.println("Digite o vetor "+(i+1)+" a ser acrescentado: ");
//            Scanner s = new Scanner(System.in);
//            vet[i] = s.nextInt();
//        }
//        System.out.print("Seu vetor é: ");
//        for (int i = 0; i < tam; i++) {
//            System.out.print(vet[i]+" ");
//            
//        }
        vet[0] = 1;
        vet[1] = 2;
        vet[2] = 3;
        vet[3] = 4;
        vet[4] = 5;
        vet[5] = 6;
        int i = b.buscaBinaria(vet, procurado);
        if (i !=-1) {
            System.out.println(procurado + " encontrado na posicao "+ i);
        }else{
            System.out.println("Nao encontrado");
        }
        
        
     
    }
    
    
}
