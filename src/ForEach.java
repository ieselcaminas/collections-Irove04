import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }


        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        ArrayList<String> cadena = new ArrayList<>();
        cadena.add("1");
        cadena.add("2");
        cadena.add("3");

        //control sobre el bucle
        for (int i = numeros.size(); i > 0; i--) {
            System.out.println(cadena.get(i));
        }
       //siempre abajo arriba / imprimir todos los datos
        int contador = 0;
        for (String numero : cadena) {
            System.out.println(contador);
        }

    }
}
