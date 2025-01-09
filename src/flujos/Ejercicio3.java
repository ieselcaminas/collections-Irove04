package flujos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Person> listaPersonas = new ArrayList<>();
        Person p1 = new Person("Raul", "Alicart",1979);
        Person p2 = new Person("John", "Doe", 1987);
        Person p3 = new Person("John", "Doe", 1987);
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
               .forEach(System.out::println);
    }
}
