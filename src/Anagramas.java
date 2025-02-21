import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.io.*;

// 1 ordenar
// 2 Está ya en el mapa
// 3 Si no está añado la clave ordenada y en valor (palabra)
// 4 Sino, añado el valor

public class Anagramas {
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));

        String palabrasOrdenadas;
        String desordenada;

        Map<String, String> anagrama = new HashMap<>();
        ArrayList<String> valor = new ArrayList<>();

        int minGroupSize = 3;

        while ((palabrasOrdenadas = reader.readLine())!=null) {
            desordenada = alphabetize(palabrasOrdenadas);

            if (anagrama.containsKey(desordenada)) {
                valor.add(palabrasOrdenadas);
                anagrama.put(desordenada, anagrama.get(desordenada) + 1);
            } else {
                valor.add(palabrasOrdenadas);
            }
        }
        System.out.println(anagrama);

    }
}
