package Lista3;

import java.util.Scanner;

public class Exe1 {
    static Scanner imput = new Scanner (System.in);
    static int entradadeNumeros (int a,int b, int c){
        int menor = 1;
        System.out.println("Digite 3 Numeros");
        a = imput.nextInt();
        b = imput.nextInt();
        c = imput.nextInt();
        if (a < b && a< c){
            menor = a;
        }else if(b<a &&b<c ){
            menor = b;
        }else if(c<a && c<b){
            menor = c;
        }
        return menor;
        
    }
    public static void main(String[] args) {
        int menor = entradadeNumeros(0, 0, 0);
        System.out.println("Menor: "+menor);
    }
}
