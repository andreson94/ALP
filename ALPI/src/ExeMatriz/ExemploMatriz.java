package ExeMatriz;

import java.util.Scanner;

public class ExemploMatriz {
  static Scanner input = new Scanner(System.in);
    static int[]tamanhoMatriz(){
        int[]vetorTamanho = new int [2];
        System.out.println("linhas: ");
        vetorTamanho[0] = input.nextInt();
        System.out.println("colunas: ");
        vetorTamanho[1] = input.nextInt();
        return vetorTamanho;
        
    }
    static int [][] criaMatriz(int[]vetorTamanho){
        System.out.println("cria matriz");
        int linhas = vetorTamanho[0];
        int colunas = vetorTamanho[1];
        int [][] matriz = new int [linhas][colunas];
        return matriz;
    }
    static int [][] populaMatriz(int [][] matriz){
        System.out.println("Popula Matriz");
        for (int i=0; i<matriz.length;i++){
            System.out.println("linha: "+i);
            for (int j=0; j<matriz[i].length;j++){
                System.out.println("Coluna:"+j);
                System.out.print("Elemento: ");
                matriz[i][j]= input.nextInt();
            }
        }
        return matriz;
    }
    static int contPares(int[][] matriz){
        int cont = 0;
        for(int i= 0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j]%2 == 0)
                    cont++;
            }
        }
      return cont;
    }
    static int[]vetorPares(int [][]matriz){
        System.out.println("imprime vetorPares()");
        int contador = contPares(matriz);
       //validação do numero positivo
        while (contador<=0){
            System.out.println("Número tem que ser maior que zero seu vacilão!!!");
            contador = input.nextInt();
        }
        int cont = 0;
        int[]vetorPares = new int[contador];
        for(int i= 0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if (matriz[i][j]%2 == 0){
                    vetorPares[cont] = matriz[i][j];
                cont++;
                }
            }
        }    
      return vetorPares;
    }
    static void imprimeVetorPares(int[] vetorPares){
        for(int i=0;i<vetorPares.length;i++){
            System.out.printf("vetor [%d]: %d\n",i,vetorPares[i]);
        }
    }
    public static void main(String[] args) {
        int [] vetor = tamanhoMatriz();
        int [][]Matriz = criaMatriz(vetor);
        Matriz = populaMatriz(Matriz);
        int []vetorPares =vetorPares(Matriz);
        imprimeVetorPares(vetorPares);
    }
}