package ProjetoQuiz;

import java.util.Random;
import java.util.Scanner;
public class testeAleatorio {
    public static void main(String[] args) {
        
    

     Scanner leitor = new Scanner (System.in);
             Random aleatorio = new Random (5);
             boolean resposta = false;
             int  pergunta = 0, questao =0, tentativas = 3 , pontos = 0 ;

             do{
             int n [] = new int[5];
             for (int i = 0; i< n.length; i++) {
                n[i]=-1;
             String alternativa = "";
             
             
            boolean achei = false;
          
                 
            questao = aleatorio.nextInt(5);
            
           while (achei == false ) {
                if (n[questao] == -1) {
                     n[questao] = 1;
                     achei = true;
                 } else {
                    questao = aleatorio.nextInt(5);
                 }
             }
           if(questao==1){
                  
                 
                System.out.println(" !!pergunta!! " + "\n");

                System.out.println("Qual o nome do primeiro avião de Santos Dumont? ");

                System.out.println("A- Bis ");
                System.out.println("B- verme ");
                System.out.println("C- avião do forró");
                System.out.println("D- seila");
                System.out.println("RESPOSTA !" );
                 
                 
               
                alternativa = leitor.next();

                switch(alternativa){

                  case "a":

                        resposta = true;
                        pontos = pontos + 30;
                        System.out.println("resposta correta ");
                        System.out.println("pontos: "+pontos);
                        break;
                  case "b":
                      System.out.println("Resposta .......... !!ERRADA!! ");
                                    tentativas = tentativas - 1;                        
                                    break;
                  case "c":
                      System.out.println("Resposta .......... !!ERRADA!! ");
                                    tentativas = tentativas - 1;                        
                                    break;
                  case "d":    
                        System.out.println("Resposta .......... !!ERRADA!! ");
                        tentativas = tentativas - 1;
                  break;                 

                  default:
                        System.out.println("Essa alternativa não existe "); 
                }
                
        
        }
             if(questao == 2){
                    System.out.println(" !!pergunta!! " + "\n");

                            System.out.println("Toronto é uma cidade de qual país? ");

                            System.out.println("A- China ");
                            System.out.println("B- Rússia ");
                            System.out.println("C- Canadá ");
                            System.out.println("D- Austrália");
                            System.out.println("RESPOSTA !" );

                            alternativa = leitor.next();

                            switch(alternativa){

                              case "a":
                                  System.out.println("Resposta .......... !!ERRADA!! ");
                                    tentativas = tentativas - 1;                        
                                    break;
                              case "b":
                                  System.out.println("Resposta .......... !!ERRADA!! ");
                                    tentativas = tentativas - 1;                        
                                    break;
                              case "c":
                                    resposta = true;
                                    pontos = pontos + 30;
                                    System.out.println("resposta correta ");
                                    System.out.println("pontos: "+pontos);
                                    break;
                              case "d":
                                    System.out.println("Resposta .......... !!ERRADA!! ");
                                    tentativas = tentativas - 1; 
                              break;                 

                              default:
                                    System.out.println("Essa alternativa não existe "); 
                            } }
             if(questao==3){
             System.out.println(" !!pergunta!! " + "\n");

                            System.out.println("As Olimpíadas de 1988 aconteceram em Seul, capital de que país? ");

                            System.out.println("A-  Países Baixos ");
                            System.out.println("B- Grécia ");
                            System.out.println("C- Coréia do Sul ");
                            System.out.println("D- Austrália");
                            System.out.println("RESPOSTA !" );

                            alternativa = leitor.next();

                            switch(alternativa){

                              case "a":
                                  System.out.println("Resposta .......... !!ERRADA!! ");
                                    tentativas = tentativas - 1;                        
                                    break;
                              case "b":
                                  System.out.println("Resposta .......... !!ERRADA!! ");
                                    tentativas = tentativas - 1;                        
                                    break;
                              case "c":
                                    resposta = true;
                                    pontos = pontos + 30;
                                    System.out.println("resposta correta ");
                                    System.out.println("pontos: "+pontos);
                                    break;
                              case "d":
                                    System.out.println("Resposta .......... !!ERRADA!! ");
                                    tentativas = tentativas - 1; 
                              break;                 

                              default:
                                    System.out.println("Essa alternativa não existe "); 
                            } }

    }
}while(tentativas > 0 && pontos == 90);
}
}