package ExeciciosTesteWhile;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LacosAninhadosTeste {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int h = 0,m = 0,s = 0,dia = 0,d=0,cont = 0;
        
        
       for (int c = 0;c <= cont ;c++){
        for (d= 0; d<=6;d++){
                System.out.println("Digite o dia");
                dia = console.nextInt();
               
                
            for (int hora = 0; hora <= h; hora++){
                System.out.println("Digite a hora");
                h = console.nextInt();    
                for (int min = 0; min <= m; min++){
                 System.out.println("Digite os minutos");
                    m = console.nextInt();   
                    for (int seg = 0; seg <= s; seg++){
                      System.out.println("digite os segundos");
                        s = console.nextInt();  
                        System.err.printf("\t\t\t%d:%d:%d \n",h,m,s);
                    
                         if (hora == h && min == m && seg == s){
                            JOptionPane.showMessageDialog(null,"Hora de dar Tchau!!!");
                            break;
                       }
                    }
                            if (hora == h && min == m){
                            break;                
            }
            }
                            if (hora == h){
                            break;            
            }
        }

        }
                     System.out.println("deseja continuar?");
                     cont = console.nextInt();        
           
       }
}
}


   

