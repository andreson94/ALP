
package Lista3;

import java.util.Scanner;

public class Exe8 {
    static Scanner imput = new Scanner (System.in);
    static int entradadeDados(){
        System.out.print("Digite:");
        int n = imput.nextInt();
        return n;
    }
    static boolean testePrimo(int n){
        boolean verdadeiro = true;
        for (int i = 0; i < n; i++){
            if(n%i==0){
                verdadeiro = false; 
                System.out.printf("numero, %d, não é primo ",n);
            }else{
                verdadeiro = true;
                System.out.printf("numero, %d,  é primo ",n);
        }
        }
        return verdadeiro;
    }
    public static void main(String[] args) {
        int n = entradadeDados();
        boolean verdadeiro = testePrimo(n);
    }
}
