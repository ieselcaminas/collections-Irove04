package flujos;

/*
Ejercicio 4 (F)

(ra2.d, ra3.b, ra3.f, ra5.c, ra6.b, ra6.e, ra6.c, ra6.d)

Escribe un programa que lea la entrada
del usuario. Cuando el usuario da un número negativo
como entrada, la lectura de entrada se detendrá.
Después de esto, imprime todos los números
que el usuario ha dado como entrada
que están entre 1 y 5 con el uso de streams
 */


import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(-4);
        numeros.add(-5);
        numeros.stream()

                //booleano si n mayor o igual a 1 y n menor o igual a 5
                .filter(n -> n >=1 && n <=5)
                //bucle para que coja todos y no se salte numeros
                .forEach(n -> System.out.println(n));
    }
}
