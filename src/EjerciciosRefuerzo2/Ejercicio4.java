/*
Dado un conjunto, o distribución,
de valores se define la moda como
el valor (o valores) que más
se repite en dicho conjunto.
En este problema te pedimos
que calcules la moda de
un conjunto de números.

 */

package EjerciciosRefuerzo2;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static int moda (int[] numeros) {
        int moda = 0;
        int max = 0;
        int clave;
        Integer veces;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numeros.length; i++) {
            map.put(numeros[i], map.getOrDefault(numeros[i], 0) + 1);
        }

        /*
            Devuelve los campos de un mapa.
            Y por cada campo (entry) luego obtiene el value y el key.
            En key tienes el número y en value el número de veces
            que se repite. como en las bases de datos hay un valor y una clave
            La moda es el número que se presenta con más frecuencia en un conjunto de datos.
            La moda es cuanto se repite el mismo num en un conjunto de nums

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                moda = entry.getKey();
            }
        }

            otra forma mas de hacer

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                clave = entry.getKey();
                veces = entry.getValue();
                if(veces > max){
                max = veces;
                moda = clave;
           }
        }

        */

        //otra forma:

        for (int i = 0; i < numeros.length; i++) {
            veces = map.get(numeros[i]);
            if (veces == null) {
                map.put(numeros[i], 1);
            }else {
                map.put(numeros[i], veces + 1);
            }
        }
        return moda;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(moda(numeros));
    }
}
