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
        String cadena = "(((p∨q)∨r)∧¬((p∨q)∧r))";
        tablas t = new tablas(cadena);
        t.crearTabla();
        t.imprimirMatriz();
    }
}
