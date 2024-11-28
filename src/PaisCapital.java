/*Declara un HashMap que almacene el país y la capital de varios países Europeos. Luego realiza un programa que
pida un País al usuario y muestre su capital.
 */


import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class PaisCapital {
    public static String Paises(String pais) {
        Map<String, String> Pais = new HashMap<>();
        Pais.put("España", "Madrid");
        Pais.put("Francia", "Paris");
        Pais.put("Belgica", "Bruselas");

        return Pais.get(pais);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un pais: (España, Francia, Belgica)");
        String pais = sc.nextLine();
        String capital = Paises(pais);

        if (capital != null) {
            System.out.println(capital);
        }else{
            System.out.println("No existe el pais " + pais);
        }
    }
}




/*
SIN METODO
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un pais: (España, Francia, Belgica)");
       String pais = sc.nextLine();
        Map<String, String> Pais = new HashMap<>();
        Pais.put("España", "Madrid");
        Pais.put("Francia", "Paris");
        Pais.put("Belgica", "Bruselas");

        if (Pais.containsKey(pais)) {
            System.out.println(Pais.get(pais));
        } else {
            System.out.println("No existe ese pais");
        }
       //MANERA RESUMIDA DE HACER EL IF:  System.out.println(Pais.getOrDefault(pais, "No existe ese pais"));
    }
}
*/

