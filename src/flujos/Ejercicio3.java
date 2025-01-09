package flujos;

/*
Ejercicio 3 (F)

(ra2.d, ra2.h, ra3.b, ra3.f, ra5.c, ra6.b, ra6.e, ra6.c, ra6.d)

Recibes una lista de Personas.
Imprime los nombres que son únicos
en orden alfabético
 */

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Person> listaPersonas = new ArrayList<>();
        Person p1 = new Person("Raul", "Alicart",1979);
        Person p2 = new Person("John", "Doe", 1987);
        Person p3 = new Person("Jonathan", "Mendoza", 1987);
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);

       listaPersonas.stream()
               //hacemos un mapa persona y cojemos el primero nombre
                .map(persona -> persona.getFirstName())
               //con distinct revisa los primeros nombres para no cojer dos veces el mismo, los "distinge"
                .distinct()
               //ordena los nombres de manera descendiente, en el caso de letras por orden alfabetico
                .sorted()
               //bucle para que revise todas las personas de la lista y no coja solo una
               .forEach(persona -> System.out.println(persona));
    }
}
