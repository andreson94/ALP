package ExeciciosTesteWhile;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        String nome = null,maiorNome = null;
        int idade,sexo,maiorIdade = 0,maiorSexo;
        int contH = 0,contM = 0,somaH = 0,somaM = 0;
        
        for (int i = 1;i<=3;i++){
        System.out.print("nome: ");
        nome = leia.next();
        System.out.print("idade: ");
        idade = leia.nextInt();
        System.out.print("sexo: ");
        sexo = leia.nextInt();
        if (idade > maiorIdade){
            maiorNome = nome;
            maiorIdade = idade;
            maiorSexo = sexo;
            
        }
        if(sexo == 1){
            somaH = somaH + idade;
            contH = contH + 1;
        }else if(sexo == 0){
                somaM = somaM + idade;
                contM = contM + 1;    
            }
        }
        float mediaH = somaH/ (float)contH;
        float mediaM = somaM/ (float)contM;
        System.out.println("Aluno mais Velho: "+maiorNome);
        System.out.println("Idade: "+maiorIdade);
        System.out.println("Média masculino:"+mediaH);
        System.out.println("Média Feminino; "+mediaM);
        
    }
    
}
