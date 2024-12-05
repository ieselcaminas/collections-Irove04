import java.util.HashMap;
import java.util.Map;

public class Frecuencia {
   public static Map<String, Integer> frecuencia (String[] palabrasIngresadas){
       Map<String, Integer> map = new HashMap<>();

       Integer contadorPalabras;

       //mira si la palabra esta, si no esta la añade map.put(palabra, 1);
       //si esta, la suma map.put(palabra, contadorPalabras + 1);
       for (String palabra : palabrasIngresadas) {
           contadorPalabras  = map.get(palabra);
           if (contadorPalabras == null) {
               map.put(palabra, 1);
           } else{
               map.put(palabra, contadorPalabras + 1);
           }
       }
        return map;
   }


    public static void main(String[] args) {
        System.out.println(frecuencia(new String[]{"uno", "dos", "dos", "tres", "tres"}));

    }
}
