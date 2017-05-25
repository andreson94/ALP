package Lista3;

import java.util.Scanner;

public class Exe4 {
    /*Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n primeiros
números positivos pela soma dos n primeiros números positivos.
Em outras palavras, você deve dividir o fatorial pela somatoria do número. Obrigatório utilizar as
funções elaboradas nos exercícios 2 e 3*/
    static Scanner imput = new Scanner(System.in); 
    static int entradadeDados (int x){
        System.out.print("Digite um numero: ");
        x = imput.nextInt();
        return x;
        
    }
static int somatoria (){
    int somaN = 0;
    x = imput.nextInt();
    for( int i = 0; i <= x;i = i++){
    if (x > 0){
        somaN = x + i;
        i = i+1;
    }else{
        System.out.println("Numero Invalido");
    }
    }
    return somaN;
    
}  
 static int fatorial (int y){
    int fatorialN = 0,mult=0,soma = 0;
    System.out.print("Digite um numero: ");
    int n = somatoria(y);
        y = n;
    if (y >= 0){
        for (int i = 1; i <= y;i = i++){
        mult = i*(y-1);
        soma = soma + mult;
        fatorialN = soma;
        i = i+1;
    }
    }
    return fatorialN;
    
} 
 static int divisao(int x,int y){
        int resultado = 0;
        resultado = x/y;
        return resultado;
    
     
 }
 static void imprimir(int resultado){
     System.out.println("resultado: " +resultado);
 }
    public static void main(String[] args) {
        int x = somatoria(0);
        int y = fatorial(x);
        int r = divisao(x, y);
        imprimir(r);
    }
}
