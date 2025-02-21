package EjerciciosRefuerzo2;

public class Ejercicio3 {
    public static String sumaDigitos(String digitos) {
        String res = "";
        int sum = 0;
        for (int i = 0; i < digitos.length(); i++) {
            sum += Integer.parseInt("" + digitos.charAt(i));
            //res += digitos.charAt(i)   + " + ";
            if(i < digitos.length()-1){
                res += digitos.charAt(i) + " + ";
            }else{
                res += digitos.charAt(i) + " = " + sum;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String digitos = "3433";
        System.out.println(sumaDigitos(digitos));
    }
}
