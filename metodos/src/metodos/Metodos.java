//metodo void é usado quando não se quer retornar nada

package metodos;

public class Metodos {

    public static void main(String[] args) {
// este é um metodo especial, pois será executado primeiro
    int numero;
    numero = multiplicar(2,5);
    meuMetodo(numero);
    }
    
    public static void meuMetodo(int numero/*aqui é um lugar para passar parametros*/){
        System.out.println("Resultado da multiplicacao é: " + numero);
    }
    
    public static int multiplicar(int numero1, int numero2){
    int resultado = 0;
    resultado = numero1*numero2;
    return resultado;
    }
}
