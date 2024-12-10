import java.util.Stack;

public class Parentesis {
    public static boolean parentesis(String cadena) {
        boolean balanceados;
        char caracter;
        char ultimo;
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < cadena.length(); i++) {
            //si son de apertura los alamacena en la pila
            caracter = cadena.charAt(i);
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(cadena.charAt(i));
            }else if (caracter == ')') {
                if (pila.empty()) {
                    return false;
                }
                //comprueba si es abierto ([{ si no lo es, false
                ultimo = pila.pop();
                if (ultimo != '(') {
                    return false;
                }else if (caracter == ']') {
                    //comprueba si es abierto ([{ si no lo es, false
                    ultimo = pila.pop();
                    if (ultimo != '[') {
                        return false;
                    }else if (caracter == '}') {
                        //comprueba si es abierto ([{ si no lo es, false
                        ultimo = pila.pop();
                        if (ultimo != '{') {
                            return false;
                        }
                    }
                }
            }
        }
        return pila.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(parentesis("{([()])}"));
    }
}
