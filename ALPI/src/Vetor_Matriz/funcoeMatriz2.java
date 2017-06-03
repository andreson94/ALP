package Vetor_Matriz;

import java.util.Scanner;

public class funcoeMatriz2 {
    static Scanner input = new Scanner(System.in);
    static int entradadeDados (){
        System.out.println("Digite o numero");
        int n = input.nextInt();
        return n;

    }
    static int [][] tamanho (int n){
        int [][] m = new int [n][n];
        return m;
    }
    static int[][] populaMatriz(int[][] m,int n){
        for (int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if (i==j)
                    m[i][j]=0;
                else if ((i+j == (n-1)))
                    m[i][j] = 1;
                else
                    m[i][j] = 2;
            }
        }
        return m;
    }
    static void imprimi(int [][]m,int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[i][j] +" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n =entradadeDados() ;
        int[][] m = tamanho(n);
        m = populaMatriz(m, n);
        imprimi(m, n);
    }
}
