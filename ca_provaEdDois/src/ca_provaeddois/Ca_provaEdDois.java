/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca_provaeddois;

/**
 *
 * @author lucasspirandeli
 */


public class Ca_provaEdDois {
    
    

//    public int pilhaInvertida(Pilha <Integer> i){
//        
//	char pilha[]= new char[palavra.lentgh()]
//	for(int i=0; i<palavra.length(); i++){	
//		pilha[i]= palavra.charAt(palavra.length()-i);//faz a inversão da ordem dos caracteres
//	}
//	String palavraInvertida= new String(pilha);
//	return palavraInvertida;
//}
//    
    public Pilha pilhaInvertida(Pilha <Integer> pilha){ //METODO invertendo a pilha
      
      Pilha <Integer> invertida = new Pilha();  
     
      if(!pilha.pilhaVazia()){
         pilhaInvertida(pilha);// fazendo por recursao
         return invertida;
      }else{
      invertida.push(pilha.pop());
      return invertida;
      }
      
    }
    
    
      

    
    public static void main(String[] args) {
        Pilha <Integer> pilhaUm = new Pilha();
        Pilha <Integer> pInvertida = new Pilha();
        Ca_provaEdDois x = new Ca_provaEdDois();
        pilhaUm.push(1);
        pilhaUm.push(3);
        pilhaUm.push(4);
        pilhaUm.push(5);
        System.out.println("Os elementos de sua pilha são: ");
        pilhaUm.imprime();//imprime a pilha 
        
        System.out.println("Voce tem: "+ pilhaUm.getI()+" elementos em sua pilha"); // conta quantos elementos tem na pilha
        
        pInvertida = x.pilhaInvertida(pilhaUm);// imprime a pilha invertida
        
      
        pInvertida.imprime();
        
       
        
    }

    
    
    
}
