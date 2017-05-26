package ExerciciosFuncao;



import java.util.Scanner;

public class Exe1 {
     static Scanner input = new Scanner (System.in);
     static int menu(){
         int opcao;
         System.out.println("**Menu**");
         System.out.println("1-adição");
         System.out.println("2-subtração");
         System.out.println("3-multiplicação");
         System.out.println("4-divisão");
         System.out.println("Opção: ");
         opcao = input.nextInt();
         return opcao;
    }
     static int add(int x, int y){
         System.out.println("**add**");
         int resultado = x+y;
         return resultado;
     }
     
     static int entradedeDados(){
         System.out.println("**entrada**");
         int n = input.nextInt();
         return n;
     }
     static void imprimir(double n){
         System.out.println("**imprimir**");
         System.out.println("resultado: "+ n);
     }
     static double controle(int opcao, int x, int y){
         System.out.println("**controle**");
         double r=0;
         switch(opcao){
             case 1:
                 r = add(x,y);
                 //continuar o codigo
         }
         return r;
     }
     public static void main(String[] args) {
        int opcao = menu();
        int x = entradedeDados();
        int y = entradedeDados();
        double r = controle(opcao, x, y);
         imprimir(r);
    }
}