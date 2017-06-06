package EstruturaDeRepeticao;

import java.util.Scanner;

public class CalculoPi {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n = 1,soma = 0;
        int sinal = 1;
        for (int i = 1; i <= 100000; i++) {
            soma =  soma + sinal * 1/n;
            n = n+2;
            sinal = - sinal;
        }
        System.out.println("resultado: " + (4*soma));
    }
}
