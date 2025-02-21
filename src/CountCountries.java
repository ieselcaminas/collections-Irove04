import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountCountries {
    public static Map<String, Integer> paises() throws IOException{
        Map<String, Integer> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
        String[] campos;
        String pais;
        String dato;
        String line;
        Integer contador;

        while ((line = reader.readLine())!=null) {
            campos = line.split(",");
            pais = campos[6];
            contador = map.get(pais);
            if (contador == null) {
                map.put(pais, 1);
            }else {
                map.put(pais, contador + 1);
            }
            reader.close();
        }
        return map;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(paises());
    }
}
