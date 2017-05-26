package Lista3;

import java.util.Scanner;

public class Exe3 {
/*Fazer uma função chamada fatorial que tem como parâmetro de entrada um número inteiro positivo n
e fornece como saída o fatorial desse número.
Exemplo:​ se N for 5, a função deve retornar 120, que é a multiplicação de 1 * 2 * 3 * 4 * 5
*/
static Scanner imput = new Scanner (System.in);
    static int fatorial (int n){
    int fatorialN = 1;
    System.out.print("Digite um numero: ");
    n = imput.nextInt();
    if (n >= 0){
        for (int i = 1; i <= n;i = i++){
        fatorialN = fatorialN * i;
        i = i+1;
    }
    }
    return fatorialN;
    
}    
    public static void main(String[] args) {
        int fatorialN = fatorial(0);
        System.out.println(fatorialN);
    }
}
