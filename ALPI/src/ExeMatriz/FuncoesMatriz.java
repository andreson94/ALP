package ExeMatriz;

import java.util.Scanner;

public class FuncoesMatriz {
    static Scanner input = new Scanner(System.in);
    static  int tamanho(){
        int t;
        System.out.println("Tamanho");
        System.out.println("Linhas/Colunas");
        t = input.nextInt();
        return t;
    }
    static int[][] criaMatriz(int linhas, int colunas){
            System.out.println("criar matriz");
            int [][] matriz = new int [linhas][colunas];
            return matriz;
}
    static int [][]populaMatriz(int[][] matriz){
        System.out.println(" Popula matriz");
        for (int i = 0;i<matriz.length;i++){
            for(int j = 0;j<matriz[i].length;j++){
                System.out.printf("Matriz [%d][%d]:",i,j);
                matriz[i][j] = input.nextInt();
                System.out.println("\n");
            }
        }
        return matriz;
    }
    static void imprimi(int [][]matriz){
        for(int i = 0;i < matriz.length;i++){
        for(int j=0;j<matriz[i].length;j++){
            System.out.printf("[%d][%d]: %d\n",i,j,matriz[i][j]);
        }
    }
    }
    public static void main(String[] args) {
        int linhas = tamanho();
        int colunas = tamanho();
        int [][] matriz = criaMatriz(linhas, colunas);
        matriz = populaMatriz(matriz);
        imprimi(matriz);
        
    }
}

