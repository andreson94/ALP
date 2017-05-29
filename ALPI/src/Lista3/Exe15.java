package Lista3;

import java.util.Scanner;

public class Exe15 {
    static Scanner imput = new Scanner(System.in);
static int dados(){
    System.out.println("DIGITE: ");
    int n = imput.nextInt();
    return n;
}
static int calculo(int x,int z){
        int r = x^z;
        return r;
}
static void imprimir(int r){
    System.out.println(r);
}
    public static void main(String[] args) {
        int i,r;
        int x= dados();
        int z = dados();
        r = calculo(x, z);
        imprimir(r);
        
    }
}
