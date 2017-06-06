package TratamentoDeErros;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        double temp = 0;
        
        boolean valido = false;
        do{
            try{
                System.out.print("Temperatura: ");
                temp = Double.parseDouble(console.nextLine());
                valido = true;
            } catch (NumberFormatException ex){
                System.out.println("Temperatura invalida!\nTente novamente...");
            }
            }while (!valido);
        System.out.println(temp);
        }
    }

