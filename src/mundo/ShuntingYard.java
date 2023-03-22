package mundo;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Daniel Arias
 */
public class ShuntingYard {

    private ArrayList<Character> dEI;
    private ArrayList<Character> dEP;

    public ShuntingYard() {
        dEI = new ArrayList<>();
        dEP = new ArrayList<>();
    }

    public ArrayList<Character> convertirEI_EP(ArrayList<Character> MEI) {
        String MEP = new String(); //Crea una String donde se almacenará la expresión postfija MEP
        Stack<Character> pila = new Stack<>(); //Crea una pila donde se almacenarán temporalmente los operadores y paréntesis
        for (int i = 0; i < MEI.size(); i++) {
            Character token1 = MEI.get(i);
            if (Character.isLetter(token1)) { //Si el token1 es un digito,se adiciona a la cadena de salida
//                MEP+=token1;

                dEP.add(token1); // se agraga el digito el token al Array List

            } else if (token1 == '(') { //Si el token1 es un '(' se apila
                pila.push(token1);
            } else if (token1 == ')') {  //Si el token1 es ')' desapila los elementos que están en la cima siempre y cuando sean distintos de '('  
                while (!pila.isEmpty() && pila.peek() != '(') {
//                            MEP+=pila.pop();

                    dEP.add(pila.pop()); // se agraga el token al Array List

                }
                pila.pop(); // desapila '('
            } else {  //sólo queda Si el token1 es un operador, se compara la jerarquia de "token1" con la del elemento que está en la cima de la pila "pila.peek()", si es menor o igual, se desapila el elemento de la cima
                while (!pila.isEmpty() && jerarquia(token1) <= jerarquia(pila.peek())) {
//                                MEP+=pila.pop();

                    dEP.add(pila.pop()); // se agraga el token al Array List

                }
                pila.push(token1); //sino es de menor o igual jerarquia se apila el operador
            }
        }
        while (!pila.isEmpty()) { //Desapila los operadores que aún están en la pila y los adiciona a la cadena de salida.
//            MEP+=pila.pop();

            dEP.add(pila.pop()); // se agraga el token al Array List
        }

//        return MEP;
        return dEP;
    }

    public int jerarquia(Character ch) {
        int r = 0;
        if (ch.equals('∧') || ch.equals('∨')) {
            r = 1;
        } else if (ch.equals('→') || ch.equals('↔')) {
            r = 2;
        } else if (ch.equals('¬')) {
            r = 3;
        }
        return r;
    }

}
