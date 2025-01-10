package flujos;

import java.util.ArrayList;
import java.util.List;

public class MainHuman {
    public static void main(String[] args) {
        //Te creas varios Human
        //Los añades de humanos
        //la ordenas y lo imprimes
        List<Human> humanos = new ArrayList<>();
        Human humano1 = new Human("Pedro", 1000);
        Human humano2 = new Human("Carlos", 2300);
        Human humano3 = new Human("Raul", 5000);
        Human humano4 = new Human("Manolo", 1200);

        humanos.add(humano1);
        humanos.add(humano2);
        humanos.add(humano3);
        humanos.add(humano4);

        humanos.stream()
            .sorted()
            .forEach(n -> System.out.println(n.getSalario()));
}
}
