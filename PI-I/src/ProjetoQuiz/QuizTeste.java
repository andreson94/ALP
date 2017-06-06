package ProjetoQuiz;

import java.awt.Component;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuizTeste {
    static boolean continua = false;
    static int contador = 0;
    static int resposta = 0;
    static int pontos = 90;
    static int chances = 2;
    static Scanner leitor = new Scanner(System.in);
    //static int [] jaRespondeu;
    
    public static void main(String[] args) {
       
        inicioJogo();
        
       do{ 
           zeraTudo();
           jogada();
           zeraResposta();
           gameover();
           ganhou();
           
           jogarNovamente();
       }
       while(continua);
        
       fimDeJogo();
        
    }
    
    
    static void inicioJogo(){
        System.out.printf("\n Bem vindos ao Quiz do T.I Show \n "
                + "\n Regras: siga as instruções e não aperte nenhum número ou \n"
                + " caracter que não apareça no jogo! \n"
                + " se isso acontecer o jogo terminar! \n");
    }
    
    // Inicio das Perguntas //
    static int pergunta(){
        int num = 1;
        System.out.println("");
        System.out.println("Pergunta 1");
        System.out.println("");
        System.out.println("Qual o valor de PI");
        System.out.println("");
        System.out.println("1 - 3,14");
        System.out.println("2 - 5,55");
        System.out.println("3 - 10,14");
        System.out.println("4 - 13,04");
        
        System.out.printf("\nResposta: ");
        resposta = leitor.nextInt();
        
        return resposta;
    }
    
    static int pergunta2(){
        int num = 2;       
        System.out.println("");
        System.out.println("Pergunta 2");
        System.out.println("");
        System.out.println("Quem descobriu o brasil");
        System.out.println("");
        System.out.println("1 - borba gato");
        System.out.println("2 - pedro alvares");
        System.out.println("3 - julio cesar");
        System.out.println("4 - colombo");
        
        System.out.printf("\nResposta: ");
        resposta = leitor.nextInt();
        
        
        
        return resposta;
    }
    
    static int opcao(int a){
          
        switch (resposta){
            
            case 1:
                System.out.printf("\n*** Resposta correta! *** \n");
                pontos = pontos + 30; 
                break;
            case 2:
            case 3:
            case 4:    
                System.out.printf("\n*** Resposta errada *** \n");
                pontos = pontos - 30;
                chances = chances -1;           
        }        
        return resposta;        
    }
    
    static int opcao2(int a){
          
            switch (resposta){

                case 2:
                    System.out.printf("\n*** Resposta correta! *** \n");
                    pontos = pontos + 30; 
                    break;
                case 1:
                case 3:
                case 4:
                    System.out.printf("\n*** Resposta errada *** \n");
                    pontos = pontos - 30;
                    chances = chances -1;
            }        
        return resposta;        
    }
    
    // zera a resposta para receber um novo valor//
    static int zeraResposta(){
        resposta = 0;
        return resposta;        
    }
    
    // zera todas variaveis globais para o valor inicial//
    static void zeraTudo(){
     contador = 0;
     resposta = 0;
     pontos = 90;
     chances = chances;
     continua = false; 
    }
    
    //imprime os pontos e as chances restantes//
    static void imprimiPontoEChances(){
        
        System.out.printf("\n-- Seus pontos: "+pontos + " --");
        System.out.println("");
        System.out.println("-- Suas chances: "+chances + " --");
        
    }
   
    static void jogada(){
       
         
            // verifica as jogadas e quando as chances forem zero sai do loop e da game over//
            while( contador  < chances && pontos < 120 ){
                
                int a,b;
                
                a = pergunta();
                b = opcao(a);
               imprimiPontoEChances();                       

                // pega a variavel b com o valor da resposta e zera para receber o novo valor
                // de resposta da proxima pergunta//
                b = zeraResposta();

                a = pergunta2();
                b = opcao2(a);
                imprimiPontoEChances();
            }       
               
    }
    
    // verifica se o jogador perdeu!!!//
    static void gameover(){
       
        if (pontos <= 0 || chances == 0){
            
                System.out.printf("\n*** GAME OVER!!! ***\n");
                chances = 2;          
        }
                
    }
    
    static void fimDeJogo(){
        System.out.println("");
        System.out.println("Fim de Jogo");
    }
    
    
    // verifica se o jogador ganhou!!!//
    static void ganhou(){
        
        if (pontos == 150){
            System.out.println("");
            System.out.println("**** Parabens você acertou todas as questões ****");
            System.out.println("");
        }
    }
    
    
    // Permite jogar novamente ou não//
    static int jogarNovamente(Component frame){
      /*  int jogarDeNovo = 0;
            
           int novamente = 1; 
           while(novamente < 10){
        */       try{
    JOptionPane.showConfirmDialog(frame,"escolha um", "escolha dois", JOptionPane.YES_NO_OPTION);
    if (resposta == JOptionPane.YES_OPTION) {
        continua = true;
      }
      else {
        continua = continua;
        System.exit(0);
      }
    System.exit(0);
  

          //      novamente = 11;
                
                }catch(Exception error){

                         // colocar tratamento de erro//
                        System.out.println("Número inválido!!! erro: "+error);

                }
         //  }
            
       // return jogarDeNovo;
    }
        
        
        
}