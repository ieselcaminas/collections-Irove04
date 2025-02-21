import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {
        System.out.println();
    }
        public static Boolean esUnNum(String cadena) {
            return Character.isDigit(cadena.charAt(0));
        }

        public static int calcular(String expresion) {
            String[] cadena = expresion.split(" ");
            Integer numero;
            Integer num1;
            Integer num2;
            Stack<Integer> pila = new Stack<>();

            for (int i = 0; i < cadena.length; i++) {
                if (esUnNum(cadena[i])) {
                    numero = Integer.valueOf(cadena[i]);
                    pila.push(numero);
                }else {
                    num2 = pila.pop();
                    num1 = pila.pop();
                    if (cadena[i].equals("+")){
                        pila.push(num1 + num2);
                    } else if (cadena[i].equals("-")) {
                        pila.push(num1 - num2);
                    } else if (cadena[i].equals("*")) {
                        pila.push(num1 * num2);
                    }else{
                        pila.push(num1 / num2);
                    }

                }
            }
            return pila.pop();
        }
    }
