package Lista3;

import static Lista3.Exe3.imput;
import java.util.Scanner;

public class Exe4 {
    /*Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n primeiros
números positivos pela soma dos n primeiros números positivos.
Em outras palavras, você deve dividir o fatorial pela somatoria do número. Obrigatório utilizar as
funções elaboradas nos exercícios 2 e 3*/
    
    static Scanner imput = new Scanner(System.in); 
static int entradadeDados (int n){
    System.out.print("Digite um numero: ");

    n = imput.nextInt();
       
    return n;
}
    static int somatoria(int n){
    int somaN = 0;
        
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
    static int fatorial (int n){
    
       int fatorialN = 1;
   
    if (n >= 0){
        for (int i = 1; i <= n;i = i++){
        fatorialN = fatorialN * i;
        i = i+1;
    }
    }
    return fatorialN;
    
}    
 static int divisao(int fatorialN,int somaN){
        
    int resultado = fatorialN/somaN;
    
    return resultado;
    
     
 }
 static void imprimir(int resultado){
     System.out.println("resultado: " + resultado);
 }
    public static void main(String[] args) {
        int n = entradadeDados(0);
        int somaN = somatoria(n);
        int fatorialN = fatorial(n);
        int resultado = divisao(fatorialN, somaN);
        System.out.println("fatorialde numeros positivos " + fatorialN);
        System.out.println("soma de positivos " + somaN);
        imprimir(resultado);
    }
}
