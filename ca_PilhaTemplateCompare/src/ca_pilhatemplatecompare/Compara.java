/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_pilhatemplatecompare;

/**
 *
 * @author Work
 */
public class Compara {
    
    
    void compara( Pilha pInt1, Pilha pInt2, Pilha pBool){
        for(int i = pInt1.topo; i>=0;i--){
                if(pInt1.pilha[i].equals(pInt2.pilha[i])){
                    pBool.push(true);
                }else{
                    pBool.push(false);
                }
    }
    }
}

//pBool.push(pInt1.pilha[i].equals(pInt2.pilha[i])) poderia apenas usar isso que significa o mesmo
