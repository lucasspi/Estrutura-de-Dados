/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhaarray;

/**
 *
 * @author Work
 */
public class PilhaDupla {

    private final int SIZE = 10; //VARIAVEL SEMPRE CTE

    int A[] = new int[SIZE];  //instanciando um novo array A Ccom o tamnho de size
    private int topoSuperior = 10;
    private int topoInferior = -1;

    public enum Pilha {
        SUPERIOR, INFERIOR
    };// NAO É REFERENTE A CLASSE PILHA

    void empilha(Pilha p, int e) throws Exception {

        if (topoInferior >= topoSuperior - 1) {
            throw new Exception("Pilha cheia");
        }

        if (p == Pilha.SUPERIOR) {
            topoSuperior--;
            A[topoSuperior] = e;
        } else {
            topoInferior++;
            A[topoInferior] = e;
        }

    }

    int desempilha(Pilha p) throws Exception {
        if (p == Pilha.SUPERIOR) {
            if (topoSuperior >= SIZE) {
                throw new Exception("Pilha Vazia");
            }

            int elemento = A[topoSuperior];
            A[topoSuperior] = 0;
            topoSuperior++;
            return elemento;
        } else {
            if (topoInferior < 0) {
                throw new Exception("Pilha Vazia");
            }
            int elemento = A[topoInferior];
            A[topoInferior] = 0;
            topoInferior--;
            return elemento;
        }
    }

}
