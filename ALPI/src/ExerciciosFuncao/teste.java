
package ExerciciosFuncao;
public class teste{
     static String s (){
         String status = null;
         System.out.println("Aprovado");
         System.out.println("Reprovado");
    return status;
    }
    static void imprimirNota (double nota){
   
    if (nota >= 6){
       String status = s(); 
    }
    else {
      String s = s();
    }
    System.out.println(s());
    }
        public static void main (String [] args){
            imprimirNota(6.7);
            String status = s();
            System.out.println(status);
        
       }

    }
    
