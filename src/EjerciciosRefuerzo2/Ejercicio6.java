package EjerciciosRefuerzo2;

public class Ejercicio6 {
    public static boolean Hyperpar(int numeros){
        char numero;
        String num = String.valueOf(numeros);
        int digito;
        for (int i = 0; i < num.length(); i++) {
            numero = num.charAt(i);
            digito = Integer.parseInt("" + numero);
            if (digito == numero) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
    int numeros = 2408;
    System.out.println(Hyperpar(numeros));
    }
}
