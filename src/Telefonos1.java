import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class Telefonos1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un contacto: (Jordi, Julio");
        String nombre = sc.nextLine();
        Map<String, Integer> numero = new HashMap<>();
        numero.put("Jordi", 1);
        numero.put("Julio", 2);

            if (nombre.equals("Jordi")) {
                System.out.println(numero.get("Jordi"));
            }else if (nombre.equals("Julio")) {
                System.out.println(numero.get("Julio"));
            }else{
                System.out.println("No hay ningun numero asociado a ese nombre");
            }
    }
}
