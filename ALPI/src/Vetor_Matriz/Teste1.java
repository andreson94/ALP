
package Vetor_Matriz;

import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int n = 10;
        int[] v = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            v[i] = imput.nextInt();
            
        }
        
        int soma = 0;
        int menor = 0;
        int maior = 0;
        
        for (int i = 0; i < n; i++){
            soma = soma + v[i];
            
            if (v[i] < menor){
                menor = v[i];
            }
            if(v[i]> maior){
                maior = v[i];
            }
        }
            for (int i = 0; i < n; i++){
                System.out.print("v[" + i + "]: " + v[i]);
                
                if (v[i] == menor)
                    System.out.print(" <-- menor");
                else if (v[i] == maior)
                    System.out.print(" <-- maior"); 
                    System.out.println(" ");
                
            }
            System.out.println("A soma é: " + soma);
    }
}

