package Lista3;

import java.util.Scanner;

public class Exe2 {
/*Fazer uma função chamada somatoria que tem como parâmetro de entrada um número inteiro positivo
N e fornece como saída a soma de todos os números inteiros positivos menores ou iguais a N.
Exemplo: ​se N for 3, a função deve retornar 6, que é a soma de 1 + 2 + 3.
*/
static Scanner imput = new Scanner(System.in);    
static int somatoria (int n){
    int somaN = 0;
    System.out.print("Digite um numero: ");
    n = imput.nextInt();
    for( int i = 0; i <= n;i = i++){
    if (n > 0){
        somaN = n + i;
        i = i+1;
    }else{
        System.out.println("Numero Invalido");
    }
    }
    return somaN;
    
}    
    public static void main(String[] args) {
        int somaN = somatoria(0);
        System.out.println(somaN);
    }
}
