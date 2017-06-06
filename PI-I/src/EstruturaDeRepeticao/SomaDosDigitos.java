package EstruturaDeRepeticao;

public class SomaDosDigitos {
    public static void main(String[] args) {
  int n = 1,soma=0;
       
        for(int i = 1; i <= 10000; i++){
           soma = soma + n;
           n = n*i;
        }
            System.out.println("a Soma da Serie é = " + soma);

    }
   
}
