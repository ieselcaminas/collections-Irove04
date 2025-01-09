package flujos;

/*
Ejercicio 2 (F)

(ra2.d, ra2.h, ra3.b, ra3.f, ra5.c, ra6.b, ra6.e, ra6.c, ra6.d)

Recibes una lista de Personas.
Imprime cuántas personas tienen
un primer apellido que empiece por A
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Person> listaPersonas = new ArrayList<>();
        Person p = new Person("Manu", "Alorens", 2000);
        Person p2 = new Person("Gracia", "Torres", 1979);
        Person p3 = new Person("Maria", "Bleda",  1954);
        //añadimos estas personas a la lista que hemos creado
        listaPersonas.add(p);
        listaPersonas.add(p2);
        listaPersonas.add(p3);

        long cuantasPersonas = listaPersonas.stream()
                //esto es un booleano
                .filter(n -> n.getLastName().startsWith("A"))
                //contamos cuantas personas hay
                .count();
        System.out.println(cuantasPersonas);
    }
}
