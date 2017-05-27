package Vetor_Matriz;

import java.util.Scanner;
public class teste2 {
    static Scanner imput = new Scanner(System.in);
     
    static int entradadeDados (int n){
       System.out.println("Digite um numero: ");

       n = imput.nextInt();

       return n;
   }
    static int[] criaVetor (int n){
        
        int[] v = new int[n];
        
       return v; 
    
}
    static int[] preencheVetor (int[] v){
        System.out.println("preenchimento do vetor");
        int n = entradadeDados(0);
        for (int i = 0; i < v.length; i++){
            System.out.print("Digite um numero: ");
            v[i] = imput.nextInt();
            
        }
       return v;
    }
    static int maior (int[] v){
        int maior = 0;
        
        for (int i = 0; i < v.length; i++){
            if(v[i]> maior){
                maior = v[i];
            }
        }
        return maior;
    } 
      static int somaN (int[] v){
        int soma = 0;
               
        for (int i = 0; i < v.length; i++){
            soma = soma + v[i];
            
        }
        return soma;
    } 
        static int menorM (int[] v){
        int menor = 0;
        
        for (int i = 0; i < v.length; i++){
            
            if (v[i] < menor){
                menor = v[i];
            }
        }
        return menor;
    } 
         
    static void fim (int[] v,int menor,int maior,int soma){
     
        
              for (int i = 0; i < v.length; i++){
                System.out.print("v[" + i + "]: " + v[i]);
            
                
                if (v[i] == menor)
                    System.out.print(" <-- menor");
                else if (v[i] == maior)
                    System.out.print(" <-- maior"); 
                    System.out.println(" ");
                
            }
            System.out.println("A soma é: " + soma);
    } 
          
    public static void main(String[] args) {
        
     
            
    }
}



