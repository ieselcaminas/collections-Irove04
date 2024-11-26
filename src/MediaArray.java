import java.util.ArrayList;
import java.util.Collections;

public class MediaArray {
    public static void main(String[] args) {
        double res = 0;
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(5.6);
        notas.add(4.0);

        //.size es como .length es la longitud de caracteres
        for (int i = 0; i < notas.size(); i++) {
            res += notas.get(i);
        }

        System.out.println(res);

        //ordenar un arrayList
        Collections.sort(notas);
    }
}
