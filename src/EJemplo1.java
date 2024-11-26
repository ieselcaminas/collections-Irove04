import java.util.ArrayList;
import java.util.Collection;


public class EJemplo1 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        coches.add("Seat");
        coches.add("Audi");
        coches.add("Honda");
        coches.add("BMW");

        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));

        }
        coches.remove(0);

        System.out.println("-----");

        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }

        if (coches.isEmpty()) {
            System.out.println("El arraylist esta vacio");
        }
    }
}
