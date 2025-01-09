import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static ArrayList<Double> leerAlturas(ArrayList<Double> alturas, int numAlumnos) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numAlumnos; i++) {
            alturas.add(sc.nextDouble());
        }
        return alturas;
    }

    public static Double CalcularMedia(ArrayList<Double> alturas) {
        double media = 0;
        for (int i = 0; i < alturas.size(); i++) {
            media += alturas.get(i);
        }
        media = media / alturas.size();
        return media;
    }

    public static int CalcularAlumnosAlturaSuperior(ArrayList<Double> alturas, ArrayList<Double> calcularMedia) {
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > calcularMedia.get(i)) {
                contador++;
            }
        }
        return contador;
    }

    public static int CalcularAlumnosAlturaInferior(ArrayList<Double> alturas, ArrayList<Double> calcularMedia) {
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < calcularMedia.get(i)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de alumnos: ");
        int numalumnos = numeroAlumnos();
        double media;
        System.out.println("La altura de los alumnos es:");
        ArrayList<Double> alturas = new ArrayList<>();
        leerAlturas(alturas, numalumnos);
        System.out.println("Media: " + (CalcularMedia(alturas)));
    }
}
