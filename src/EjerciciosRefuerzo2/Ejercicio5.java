package EjerciciosRefuerzo2;

import java.util.Arrays;

public class Ejercicio5 {
    public static double mediana(int numeros[]){
        double media = 0;
        double num1;
        double num2;

        Arrays.sort(numeros);

        if (numeros.length % 2 == 0){
            num1 = numeros[numeros.length / 2];
            num2 = numeros[numeros.length / 2 -1];
            media = (num1 + num2) / 2;
        }else {
            media = numeros[numeros.length / 2];
        }

        return media;
    }


    public static void main(String[] args) {
        int[] numeros = {1, 2, 6, 17, 18, 22, 35, 46, 109, 143, 200};
        System.out.println(mediana(numeros));
    }
}
