/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoQuiz;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author andreson.csilva
 */
public class TIshow {
    static boolean continua = false;
    static int contador = 0;
    static String resposta = null;
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
        
       JOptionPane.showMessageDialog(null,"\n Bem vindos ao Quiz do T.I SHOW \n"
               + " Regras: siga as instruções e não aperte nenhum número ou \n"
                + " caracter que não apareça no jogo! \n"
                 +" se isso acontecer o jogo terminar! \n");
    }
    
    // Inicio das Perguntas //
    static String pergunta(){
        JOptionPane.showMessageDialog(null,"Pergunta 1\n Qual o Valor de P.I?\n"
                + "1 - 3,14\n2 - 5,55\n3 - 3,134\n4 - 2,14" + resposta);
        
        resposta = leitor.nextLine();
        
        return resposta;
    }
    
    static String pergunta2(){
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
        resposta = leitor.nextLine();
        
        
        
        return resposta;
    }
    
    static String alternativa(String a){
          
        switch (resposta.toUpperCase()){
            
            case "a":
                JOptionPane.showMessageDialog(null,"\n*** Resposta correta! *** \n");
                pontos = pontos + 30; 
                break;
            case "b":
            case "c":
            case "d":    
                JOptionPane.showMessageDialog(null,"\n*** Resposta errada *** \n");
                pontos = pontos - 30;
                chances = chances -1; 
                break;
        }        
        return resposta;        
    }
    
    static String opcao2(String a){
          
            switch (resposta.toUpperCase()){

                case "A":
                    JOptionPane.showMessageDialog(null,"\n*** Resposta correta! *** \n");
                    pontos = pontos + 30; 
                    break;
                case "B":
                case "C":
                case "D":
                    JOptionPane.showMessageDialog(null,"\n*** Resposta errada *** \n");
                    pontos = pontos - 30;
                    chances = chances -1;
            }        
        return resposta;        
    }
    
    // zera a resposta para receber um novo valor//
    static String zeraResposta(){
        resposta = null;
        return resposta;        
    }
    
    // zera todas variaveis globais para o valor inicial//
    static void zeraTudo(){
     contador = 0;
     resposta = null;
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
                
                String a,b;
                a = pergunta();
                b = alternativa(a);
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
    static int jogarNovamente(){
        int jogarDeNovo = 0;
            
           int novamente = 1; 
           while(novamente < 10){
               try{
                System.out.println("");
                System.out.println("// Deseja jogar novamente? //");
                System.out.println("");
                System.out.println("Sim aperte 1");
                System.out.println("Não aperte 2");
                int a = leitor.nextInt();

                if(a == 1){
                    jogarDeNovo = a;
                    continua = true;
                }
                else if(a == 2){
                    jogarDeNovo = a;
                    continua = continua;
                }else{
                
                    System.out.println("Número invalido");
                }
               
                novamente = 11;
                 a = 0;
                
                }catch(Exception error){

                         // colocar tratamento de erro//
                        System.out.println("Número inválido!!! erro: "+error);

                }
           }
            
        return jogarDeNovo;
    }
        
        
        
}

/*import javax.swing.JOptionPane;
02.
 
03.
public class CaixaComComboBox {
04.
public static void main(String[] args) {
05.
Object[] opcoes = { "sim", "não" };
06.
Object resposta;
07.
do {
08.
resposta = JOptionPane.showInputDialog(null,
09.
"Deseja finalizar o programa?",
10.
"Finalização",
11.
JOptionPane.PLAIN_MESSAGE,
12.
null,
13.
opcoes,
14.
"não");
15.
} while (resposta == null || resposta.equals("não"));
16.
}
17.
}
No exemplo acima, criamos uma lista com dois objetos: "sim" e "não". E já definimos "não" como opção pré-selecionada. Removemos qualquer ícone com as opções PLAIN_MESSAGE e ícone null. Criamos um laço (loop) com while que sempre irá repetir a mesma caixa enquanto o botão Cancel ou a opção "não" forem selecionados.

Abaixo está um exemplo mais funcional, divertido e simples de fazer e entender. Trata-se de um jogo de adivinhar onde um número é escolhido e temos que adivinhar qual número foi sorteado. No exemplo, serão usados elementos já estudados no site como a classe Math e Integer.

01.
import javax.swing.JOptionPane;
02.
 
03.
public class JogoDeAdivinhar {
04.
public static void main(String[] args) {
05.
// define um número qualquer entre 0 e 10
06.
int rndNr = (int) Math.ceil(Math.random() * 10);
07.
// lista de opções para o combo box da caixa de diálogo
08.
Object[] opcoes = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
09.
// string onde será retornado o resultado
10.
String resposta;
11.
while (true) {
12.
// loop para evitar que o jogo feche depois da primeira resposta
13.
resposta = (String) JOptionPane.showInputDialog(null,
14.
"Em que número estou pensando?", "Jogo de Advinhar",
15.
JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
16.
if (resposta == null) {
17.
/*
18.
* se clicar no botão Cancel, mostrar uma mensagem de Game Over
19.
* e sair do loop para finalizar o programa
20.
*//*
21.
JOptionPane.showMessageDialog(null,
22.
"Game Over!\nVocê desistiu do jogo!");
23.
break;
24.
}
25.
if (Integer.valueOf(resposta) > rndNr) {
26.
/*
27.
* Interpreta string como inteiro e compara com o número sorteado
28.
* para ver se é maior
29.
*//*
30.
JOptionPane.showMessageDialog(null,
31.
"Errado!\nO número que eu pensei é menor.");
32.
} else if (Integer.valueOf(resposta) < rndNr) {
33.
/*
34.
* Interpreta string como inteiro e compara com o número sorteado
35.
* para ver se é maior
36.
*//*
37.
JOptionPane.showMessageDialog(null,
38.
"Errado!\nO número que eu pensei é maior.");
39.
} else {
40.
/*
41.
* se não for nem maior e nem menor, então é igual.
42.
* Finaliza o jogo saindo do loop
43.
*//*
44.
JOptionPane.showMessageDialog(null,
45.
"Parabéns\nVocê adivinhou!\n"
46.
+ "Eu realmente pensei no número " + rndNr);
47.
break;
48.
}
49.
}
50.
}
51.
}
*/
/*public class CaixasDeInput {
04.
public static void main(String[] args) {
05.
String nome = null;
06.
while (nome == null || nome.equals("")) {
07.
nome = JOptionPane.showInputDialog("Qual o seu nome?");
08.
if (nome == null || nome.equals("")) {
09.
JOptionPane.showMessageDialog(null,
10.
"Você não respondeu a pergunta.");
11.
}
12.
}
13.
JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
14.
}
15.
}*/