package TratamentoDeErros;

import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
 Scanner console = new Scanner(System.in);
        
        double temp1 = leiaTemperatura("Temperatura1: ") ;
        double temp2 = leiaTemperatura("Temperatura2: ");
        double temp = leiaTemperatura("Temperatura3: ");
        boolean valido = false;
        do{
            try{
                System.out.print("Temperatura: ");
                temp1 = Double.parseDouble(console.nextLine());
                valido = true;
            } catch (NumberFormatException ex){
                System.out.println("Temperatura invalida!\nTente novamente...");
            }
            }while (!valido);
        
        }
    public static double leiaTemperatura(String mensagem) {
        double temp1 = 0;
        boolean valido = false;
        do{
            try{
                System.out.print(mensagem);
                temp1 = Double.parseDouble(console.nextLine());
                valido = true;
            } catch (NumberFormatException ex){
                System.out.println("Temperatura invalida!\nTente novamente...");
            }
            }while (!valido);
       
        double temp2 = 0;
        boolean valido = false;
        do{
            try{
                System.out.print(mensagem);
                temp2 = Double.parseDouble(console.nextLine());
                valido = true;
            } catch (NumberFormatException ex){
                System.out.println("Temperatura invalida!\nTente novamente...");
            }
            }while (!valido);
        
        double temp = temp1 + temp2;
         System.out.println("Temperatura: " + temp1);
         System.out.println("Temperatura: " + temp2);
        
        }
        
    }

public static double soma(double t1,double t2){
        return temp1 + temp2;
        }
    
    }
}
}