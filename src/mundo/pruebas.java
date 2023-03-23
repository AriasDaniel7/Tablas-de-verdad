/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.regex.Pattern;

/**
 *
 * @author Daniel Arias
 */
public class pruebas {

    public static void main(String args[]) {
        //String cadena = "(((p∨q)∨r)∧¬((p∨q)∧r))";
        String cadena = "(((p∨q)∨r)∧((p∨q)∧r))";
        System.out.println(validarCadena(cadena));
    }

    public static boolean validarCadena(String cadena) {
        int izq = 0;
        int der = 0;
        char u = cadena.charAt(cadena.length() - 1);
        char p = cadena.charAt(0);
        boolean a = Pattern.matches("[∨ → ∧ ¬ ↔]", Character.toString(u));
        boolean b = Pattern.matches("[∨ → ∧ ↔]", Character.toString(p));

        //Validar primero y ultimo
        if (a || b) {
            return false;
        }

        //Validar Parentesis
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                izq++;
            }
            if (cadena.charAt(i) == ')') {
                der++;
            }
        }

        if (izq != der) {
            return false;
        }

        /**
         * Validar cuando este entre parentesis
         */
        for (int i = 0; i < cadena.length() - 2; i++) {
            char char1 = cadena.charAt(i);
            char char2 = cadena.charAt(i + 1);
            char char3 = cadena.charAt(i + 2);
            boolean entre1 = char3 == ')' && Pattern.matches("[∨ → ¬ ∧ ↔]", Character.toString(char2));
            boolean entre2 = (char1 == '(' && Pattern.matches("[∨ → ¬ ∧ ↔]", Character.toString(char2)) && char3 == ')');
            boolean entre3 = (char1 == '(' && Pattern.matches("[∨ → ∧ ↔]", Character.toString(char2)) && Character.isLetter(char3));
            if (entre1 || entre2 || entre3) {
                return false;
            }
        }

        for (int i = 0; i < cadena.length() - 1; i++) {
            char char1 = cadena.charAt(i);
            char char2 = cadena.charAt(i + 1);
            boolean entre1 = (char1 == char2) && !(char1 == '(' || char1 == ')') && !(char2 == '(' || char2 == ')');
            boolean entre2 = Character.isLetter(char1) && Character.isLetter(char2);
            boolean entre3 = Pattern.matches("[∨ → ∧ ↔]", Character.toString(char1)) && Pattern.matches("[∨ → ∧ ↔]", Character.toString(char2));
            boolean entre4 = Character.isLetter(char1) && char2 == '¬';
            if (entre1 || entre2 || entre3 || entre4) {
                return false;
            }
        }

        return true;
    }
}
