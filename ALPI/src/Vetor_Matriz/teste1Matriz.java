package Vetor_Matriz;

import java.util.Scanner;

public class teste1Matriz {
    static Scanner input = new Scanner(System.in);
    
    static int tamanhoMatriz(){
        int t;
        System.out.println("Tamanho da Matriz");
        t = input.nextInt();
        return t;
    }
    
    static int[][] criaMatriz(int linhas, int colunas){
        System.out.println("Cria Matriz");
        int[][] matriz = new int[linhas][colunas];
        return matriz;
    }
    
    static int[][] populaMatriz(int[][] matriz){
        System.out.println("Popula Matriz");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]: ", i,j);
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }
    
    static void imprimeMatriz(int[][] matriz){
        System.out.println("Imprime Matriz");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]: %d", i,j, matriz[i][j]);
                
            }
        }
    }
    
    public static void main(String args[]){
        int linhas = tamanhoMatriz();
        int colunas = tamanhoMatriz();
        int[][] matriz = criaMatriz(linhas, colunas);
        matriz = populaMatriz(matriz);
        imprimeMatriz(matriz);
    }
}

