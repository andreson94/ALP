package Lista3;

import java.util.Scanner;


public class Exe7 {
    static Scanner imput = new Scanner (System.in);
    static float r (){
        System.out.println("digite um numero:");
        float raio = imput.nextFloat();
        return raio;
    }
    static float v (float raio){
       float volume = (float) ((4/3)* Math.PI *(Math.pow(raio, 3)));
        return volume;
    }
    public static void main(String[] args) {
        System.out.println("Volume do Circulo");
        float raio = r();
        float volume = v(raio);
        System.out.println(volume);
    }
}