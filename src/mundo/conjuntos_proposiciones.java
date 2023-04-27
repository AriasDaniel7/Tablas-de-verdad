/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.ArrayList;

/**
 *
 * @author Daniel Arias
 */
public class conjuntos_proposiciones {

    private String cadenaEntrada;
    private ArrayList<String> lista;
    private ArrayList<String> cop;
    private int rep;

    public conjuntos_proposiciones(String cadena) {
        lista = new ArrayList<>();
        cop = new ArrayList<>();
        rep = 0;
        this.cadenaEntrada = cadena;
    }

    public String convertir() {
        String resultado = "";
        for (int i = 0; i < cadenaEntrada.length(); i++) {
            switch (cadenaEntrada.charAt(i)) {
                case '∪':
                    pasarUnion();
                    break;
                case '∩':
                    pasarInterseccion();
                    break;
                case 'C':
                    pasarComplemento(i);
                    break;
                case '/':
                    pasarDiferencia();
                    break;
                default:
                    Character carac = cadenaEntrada.charAt(i);
                    String res = carac.toString();
                    lista.add(res);
            }
        }
        if (buscarDiferenciaSimetrica()) {
            calcularDiferenciaSimetrica();
        }
        for (int i = 0; i < lista.size(); i++) {
            resultado += lista.get(i);
        }
        return resultado;
    }

    public void pasarUnion() {
        lista.add("∨");
    }

    public void pasarInterseccion() {
        lista.add("∧");
    }

    public void pasarComplemento(int index) {
        lista.add(lista.size() - 1, "¬");
    }

    public void pasarDiferencia() {
        lista.add("∧");
        lista.add("¬");
    }

    public boolean buscarDiferenciaSimetrica() {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).intern() == "Δ") {
                return true;
            }
        }
        return false;
    }

    public void calcularDiferenciaSimetrica() {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).intern() == "Δ") {
                pasarDiferenciaSimetrica(i);
                i = 0;
            }
        }

        ArrayList<Integer> paren = contarParentesis(lista);
        if (paren.get(0) < paren.get(1)) {
            int cont = paren.get(1) - paren.get(0);
            for (int i = 1; i <= cont; i++) {
                lista.add(0, "(");
            }
        } else {
            int cont = paren.get(0) - paren.get(1);
            for (int i = 1; i <= cont; i++) {
                lista.add(")");
            }
        }
    }

    public ArrayList<Integer> contarParentesis() {
        int conDer = 0, conIzq = 0;
        for (int i = 0; i < cop.size(); i++) {
            if (cop.get(i).intern() == "(") {
                conIzq++;
            }
            if (cop.get(i).intern() == ")") {
                conDer++;
            }
        }
        ArrayList<Integer> paren = new ArrayList<>();
        paren.add(conIzq);
        paren.add(conDer);

        return paren;
    }

    public ArrayList<Integer> contarParentesis(ArrayList<String> lista) {
        int conDer = 0, conIzq = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).intern() == "(") {
                conIzq++;
            }
            if (lista.get(i).intern() == ")") {
                conDer++;
            }
        }
        ArrayList<Integer> paren = new ArrayList<>();
        paren.add(conIzq);
        paren.add(conDer);

        return paren;
    }

    public void pasarDiferenciaSimetrica(int index) {
        ArrayList<String> antes = new ArrayList<>();
        ArrayList<String> despues = new ArrayList<>();
        ArrayList<Integer> paren = contarParentesis();
        int con = 0;
        int index1 = index - 1;
        for (int i = index1; i >= 0; i--) {
            antes.add(0, lista.get(i));
            index1 = i;
            if (lista.get(i).intern() == "(") {
                if (con == paren.get(0) || rep > 1) {
                    i = -1;
                }
            }
            con++;
        }
        int index2 = index + 1;
        for (int i = index2; i < lista.size(); i++) {
            despues.add(lista.get(i));
            index2 = i;
            con++;
            if (lista.get(i).intern() == ")") {
                i = lista.size() + 1;
            }
        }
        cop = new ArrayList<>(antes);

        cop.add(0, "(");
        cop.add(0, "(");
        cop.add("∨");
        cop.addAll(despues);
        cop.add(")");
        cop.add("∧");
        cop.add("¬");
        cop.add("(");
        cop.addAll(antes);
        cop.add("∧");
        cop.addAll(despues);
        cop.add(")");
        cop.add(")");
        for (int i = index1; i <= index2; i++) {
            lista.remove(index1);
        }
        rep++;

        lista.addAll(index1, cop);

    }

    public String lista() {
        return lista.toString();
    }
}
