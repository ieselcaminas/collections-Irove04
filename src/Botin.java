import java.util.HashMap;
import java.util.Map;

public class Botin {
    public static Map<Integer, String> repartir(int numPersonas, int[] billetes){
        Map<Integer, String> reparto = new HashMap<>();
        int tocaA; //a quien lo reparte
        String billete; //que billete reparte
        String botin;

        for (int i = 0; i < billetes.length; i++) {
            billete = String.valueOf(billetes[i]); //para que sea un reparto circular
            tocaA = i % numPersonas;
            botin = reparto.get(tocaA);
            if (botin == null) {
                reparto.put(tocaA, billete);
            }else {
                reparto.put(tocaA, botin + " " + billete);
            }
        }
        return reparto;
    }

    public static void main(String[] args) {
        Map<Integer, String> reparto = repartir(2, new int[]{10, 50, 20, 30, 60, 40, 100, 400});
        System.out.println(reparto);

    }
}
