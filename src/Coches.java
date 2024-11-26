import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String> marcas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String marca;

        do{
            marca = sc.nextLine();
            //.isEmpty es lo mismo que .equals("")
            if (!marca.isEmpty())
                marcas.add(marca);
        }while(marca.isEmpty());

        //ordenara por alfabetico
        Collections.sort(marcas);

        for (int i = 0; i < marcas.size(); i++) {
            System.out.print(marcas.get(i));
        }

    }
}
