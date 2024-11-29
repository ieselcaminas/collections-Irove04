import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos2 {
    public static void main(String[] args) {
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("111");
        telefonos.add("222");

        HashMap<String, ArrayList<String>> agenda = new HashMap<>();

        agenda.put("pepe", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add("333");
        telefonos.add("444");

        agenda.put("juan", telefonos);
        telefonos = new ArrayList<>();
        telefonos.add("555");
        telefonos.add("666");

    }
}
