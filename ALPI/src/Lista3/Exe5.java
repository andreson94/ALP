package Lista3;

import java.util.Scanner;

public class Exe5 {
    /*Fazer uma função que tem como parâmetros de entrada três números reais a, b, c e fornece como saída a
maior raiz​ da equação do 2º grau:
ax^2 + bx + c
Nesta questão, você deverá utilizar a fórmula de Báskara​. Se não houver raízes reais, a função deve
retornar o número −1.*/
    static Scanner imput = new Scanner(System.in);
    static float entradaA(float a){
        System.out.print("Digite o valor de a:");
        a = imput.nextFloat();
        return a;
    }
    static float entradaB(float b){
        System.out.print("Digite o valor de b:");
        b = imput.nextFloat();
        return b;
    }
    static float entradaC(float c){
        System.out.print("Digite o valor de c:");
        c = imput.nextFloat();
        return c;
    }
    static float equacao2Grau (float a,float b,float c){
        float raiz = 0,x1,x2,delta;
        delta = ((b*b)-(4*a*c));
        if (delta>= 0){
        x1 = (float) ((-b + (Math.sqrt (delta)))/( 2*a ));
        x2 = (float) (( -b - (Math.sqrt (delta)))/( 2*a ));
        
        if (x1 > x2)
            raiz = x1;
        else
            raiz = x2;
        }
        return raiz;
    }
    
    public static void main(String[] args) {
        System.out.println("\n\t\t***Equação do 2º***\t\n");
        System.out.println("ax2 + bx + c = 0");
        float raiz,a = 0,b = 0,c = 0;
        a=entradaA(a);
        b = entradaB(b);
        c= entradaC(c);
        
        raiz = equacao2Grau(a, b, c);
        
        System.out.println("Maior raiz = "+raiz);
    }
}
