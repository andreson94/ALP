package Lista3;

import java.util.Scanner;

public class Exe6 {
       static Scanner imput = new Scanner(System.in);
    static float entradaA(){
        System.out.print("Digite o valor de a:");
        float a = imput.nextFloat();
        return a;
    }
    static float entradaB(){
        System.out.print("Digite o valor de b:");
        float b = imput.nextFloat();
        return b;
    }
    static float entradaC(){
        System.out.print("Digite o valor de c:");
        float c = imput.nextFloat();
        return c;
    }
    static float equacao2Grau (float a,float b,float c){
        
        float x1,x2,delta,resultado = 0;
        
        delta = ((b*b)-(4*a*c));
        
        if (delta>= 0){
        
        x1 = (float) ((-b + (Math.sqrt (delta)))/( 2*a ));
        x2 = (float) (( -b - (Math.sqrt (delta)))/( 2*a ));
        
        if (resultado <= 0){
        
            resultado = -1;
        }else{
            
        if (x1 > x2)
            resultado = x1;
        else
            resultado = x2;
        
    }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        System.out.println("\n\t\t***Equação do 2º***\t\n");
        System.out.println("ax2 + bx + c = 0");
        float resultado,a,b,c;
        a=entradaA();
        b = entradaB();
        c= entradaC();
        
        resultado = equacao2Grau(a, b, c);
        
        System.out.println("Maior raiz = "+resultado);
    }
    
}



