/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undoredo;

import java.util.Scanner;
/**
 *
 * @author Work
 */
public class UndoRedo {

    Scanner s =  new Scanner(System.in);
    
    Pilha undo;// só estou declarando uma variavel pilha
    Pilha redo;
    
    public UndoRedo(){ //aqui estou criando duas pilhas
        undo = new Pilha();
        redo = new Pilha();
    }
    /**
     * @param args the command line arguments
     */
     public void menu(){
        System.out.println("Digite [0] para Empilhar em UNDO");
        System.out.println("Digite [1] para Desempilhar de UNDO");
        System.out.println("Digite [2] para Empilhar em REDO");
        System.out.println("Digite [3] para Imprimir");
        System.out.println("Digite [4] para Sair");
    }
    public static void main(String[] args) {
        UndoRedo app = new UndoRedo();
        
        while(true) {
            app.menu();
            int opcao = app.s.nextInt();
            switch(opcao){
                case 0:
                    app.executarEmpilhar();
                    break;
                
                case 1:
                    app.desfazerDesempilhar();
                    break;
                
                case 2:
                    app.refazerEmpilhar();
                    break;
                
                case 3:
                System.out.println("Pilha undo: ");
                        app.undo.imprime();
                System.out.println("Pilha Redo: ");
                        app.redo.imprime();
                break;
                
                case 4:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opção invalida!");
                    break;
                
             }    
        }
        
    }
    public void executarEmpilhar(){
       COMANDO p = new COMANDO();
       p.executar();
       undo.push(p);
       
    } 
    
    public void desfazerDesempilhar(){
        COMANDO c = undo.pop();
        c.desfazer();
        redo.push(c);
        
    }
    public void refazerEmpilhar(){
        COMANDO z = redo.pop();
        z.executar();
        undo.push(z);
        
    }
        // TODO code application logic here
    }
    

