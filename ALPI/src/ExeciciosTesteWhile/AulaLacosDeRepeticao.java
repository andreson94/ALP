package ExeciciosTesteWhile;

import java.util.Scanner;

public class AulaLacosDeRepeticao {
    public static void main(String[] args) {
        int x, soma= 0,i = 0;
        Scanner l = new Scanner(System.in);
        
        for (i = 0; i < 10; i++){
            System.out.println("Digite o item " + i);
            x = l.nextInt();
            soma = soma + x;
        }
        System.out.println("Total: " + soma);
            
        i = 0;
        
        while ( i < 10){
                System.out.println("linha" + i);
                i = ++i;
        }
        while (i <10){
        x = l.nextInt();
        if (x < 0){
            System.err.println("numero invalido");
            break;
        }
            soma = soma + x;
            i = i + 1;
        }
    }
}
