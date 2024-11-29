import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frecuencia {
   public static Map<String, Integer> frecuencia (String palabrasIngresadas){
       String[] palabras = palabrasIngresadas.split(" ");
       Map<String, Integer> map = new HashMap<>();

       Integer contadorPalabras = 0;

       //mira si la palabra esta, si no esta la añade map.put(palabra, 1);
       //si esta, la suma map.put(palabra, contadorPalabras + 1);
       for (String palabra : palabras) {
           contadorPalabras  = map.get(palabra);
           if (contadorPalabras == null) {
               map.put(palabra, 1);
           } else{
               map.put(palabra, contadorPalabras + 1);
           }
       }
        return map;
   }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una serie de palabras: (ejemplo: uno dos dos tres)");
        String palabrasIngresadas = sc.nextLine();


    }
}
