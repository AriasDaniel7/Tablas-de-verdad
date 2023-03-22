package mundo;

import java.util.ArrayList;

/**
 *
 * @author Daniel Arias
 */
public class tablas {

    private boolean[][] matrizBase;
    private ShuntingYard sy;
    private String cadena;
    private ArrayList<Character> pila;
    private boolean[][] table;

    public tablas(String infija) {
        cadena = infija;
        iniciarMatrizBase();
        iniciarTabla();
        sy = new ShuntingYard();
        pila = new ArrayList<>();
    }

    public void imprimirMatrizBase() {
        for (int i = 0; i < matrizBase.length; i++) {
            System.out.printf(" %2s ", i);
            for (int j = 0; j < matrizBase[i].length; j++) {
                System.out.printf("|  %5s  ", matrizBase[i][j]);
            }
            System.out.println(" ");
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < table.length; i++) {
            System.out.printf(" %2s ", i);
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("|  %5s  ", table[i][j]);
            }
            System.out.println(" ");
        }
    }

    public boolean validarRepiticion(ArrayList<Character> lista, char letra) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == letra) {
                return true;
            }
        }
        return false;
    }

    public int contarPreposiciones() {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (Character.isLetter(letra) && !validarRepiticion(list, letra)) {
                list.add(letra);
            }
        }

        return list.size();
    }

    public ArrayList<Character> Preposiciones() {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (Character.isLetter(letra) && !validarRepiticion(list, letra)) {
                list.add(letra);
            }
        }

        return list;
    }

    public int[] filasColumnas() {
        int[] parametrosMatriz = new int[2];
        int filas = (int) Math.pow(2, contarPreposiciones());
        int columnas = contarPreposiciones();

        parametrosMatriz[0] = filas;
        parametrosMatriz[1] = columnas;

        return parametrosMatriz;
    }

    public void iniciarValoresTabla() {
        int potencia = (int) Math.pow(2, contarPreposiciones()) / 2;
        int aux = potencia;
        for (int j = 0; j < contarPreposiciones(); j++) {
            int temp = aux * 2;
            for (int i = 0; i < matrizBase.length; i++) {
                if (i < potencia) {
                    matrizBase[i][j] = true;
                } else {
                    i += (aux - 1);
                    potencia += temp;
                }
            }
            potencia = aux;
            aux = potencia / 2;
            potencia = potencia / 2;
        }
    }

    public String postfija() {
        ArrayList<Character> arreglo = new ArrayList<>();
        String salida = "";
        sy = new ShuntingYard();

        for (int i = 0; i < cadena.length(); i++) {
            arreglo.add(cadena.charAt(i));
        }

        arreglo = sy.convertirEI_EP(arreglo);

        for (int i = 0; i < arreglo.size(); i++) {
            salida += arreglo.get(i);
        }

        return salida;
    }

    public void crearTabla() {
        iniciarValoresTabla();
        llenarValoresLetras();
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case '∨':
                    pila.add(cadena.charAt(i));
                    disyuncion(i, cadena.charAt(i));
                    break;
                case '→':
                    pila.add(cadena.charAt(i));
                    condicional(i, cadena.charAt(i));
                    break;
                case '∧':
                    pila.add(cadena.charAt(i));
                    conjuncion(i, cadena.charAt(i));
                    break;
                case '¬':
                    pila.add(cadena.charAt(i));
                    negacion(i, cadena.charAt(i));
                    break;
                case '↔':
                    pila.add(cadena.charAt(i));
                    bicondicional(i, cadena.charAt(i));
                    break;
                default:
                    pila.add(cadena.charAt(i));
            }
        }
        pila.clear();
    }

    public void iniciarTabla() {
        int filas = (int) Math.pow(2, contarPreposiciones());
        int columnas = postfija().length();
        table = new boolean[filas][columnas];
    }

    public void iniciarMatrizBase() {
        int filas = filasColumnas()[0];
        int columnas = filasColumnas()[1];
        matrizBase = new boolean[filas][columnas];
    }

    public int buscarLetraPreposiciones(char letra) {
        ArrayList<Character> letras = Preposiciones();
        for (int i = 0; i < letras.size(); i++) {
            if (letra == letras.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public int buscarSimbolo(char letra) {
        for (int i = 0; i < cadena.length(); i++) {
            if (letra == cadena.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    public char[] buscarDosAnteriores(char letra) {
        char x[] = new char[2];
        for (int i = 0; i < pila.size(); i++) {
            if (letra == pila.get(i) && !((i - 2) < 0)) {
                x[0] = pila.get(i - 2);
                x[1] = pila.get(i - 1);
                return x;
            }
        }
        return null;
    }

    public int buscarIndexPila(char letra) {
        for (int i = 0; i < pila.size(); i++) {
            if (pila.get(i) == letra) {
                return i;
            }
        }
        return -1;
    }

    public int buscarIndexPilaNegacion(char letra) {
        for (int i = pila.size() - 1; i >= 0; i--) {
            if (pila.get(i) == letra) {
                return i;
            }
        }
        return -1;
    }

    public void llenarValoresLetras() {
        cadena = postfija();
        for (int k = 0; k < cadena.length(); k++) {
            if (Character.isLetter(cadena.charAt(k))) {
                for (int j = 0; j < table[0].length; j++) {
                    for (int i = 0; i < table.length; i++) {
                        if (j == k) {
                            table[i][j] = matrizBase[i][buscarLetraPreposiciones(cadena.charAt(k))];
                        }
                    }
                }
            }
        }
    }

    public void negacion(int posicion, char letra) {
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion) {
                    boolean p = table[i][j - 1];
                    if (!p) {
                        table[i][j] = true;
                    }
                }
            }
        }
        pila.remove(buscarIndexPilaNegacion(letra) - 1);
    }

    public void disyuncion(int posicion, char letra) {
        char temp[] = buscarDosAnteriores(letra);
        ArrayList<Integer> iguales = null;
        if (temp[0] == temp[1]) {
            iguales = buscarIndexDosIguales(temp[0]);
        }
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion && iguales == null) {
                    boolean p = table[i][buscarSimbolo(temp[0])];
                    boolean q = table[i][buscarSimbolo(temp[1])];
                    if (p || q) {
                        table[i][j] = true;
                    }
                } else {
                    if ((j == posicion && iguales != null)) {
                        boolean p = table[i][iguales.get(0)];
                        boolean q = table[i][iguales.get(1)];
                        if (p || q) {
                            table[i][j] = true;
                        }
                    }
                }
            }
        }
        pila.remove(buscarIndexPila(temp[0]));
        pila.remove(buscarIndexPila(temp[1]));
    }

    public ArrayList<Integer> buscarIndexDosIguales(char letra) {
        ArrayList<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < cadena.length(); i++) {
            if (letra == cadena.charAt(i)) {
                posiciones.add(i);
                if (!(posiciones.size() < 2)) {
                    return posiciones;
                }
            }
        }
        return posiciones;
    }

    public void conjuncion(int posicion, char letra) {
        char temp[] = buscarDosAnteriores(letra);
        ArrayList<Integer> iguales = null;
        if (temp[0] == temp[1]) {
            iguales = buscarIndexDosIguales(temp[0]);
        }
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion && iguales == null) {
                    boolean p = table[i][buscarSimbolo(temp[0])];
                    boolean q = table[i][buscarSimbolo(temp[1])];
                    if (p && q) {
                        table[i][j] = true;
                    }
                } else {
                    if ((j == posicion && iguales != null)) {
                        boolean p = table[i][iguales.get(0)];
                        boolean q = table[i][iguales.get(1)];
                        if (p && q) {
                            table[i][j] = true;
                        }
                    }
                }
            }
        }
        pila.remove(buscarIndexPila(temp[0]));
        pila.remove(buscarIndexPila(temp[1]));
    }

    public void condicional(int posicion, char letra) {
        char temp[] = buscarDosAnteriores(letra);
        ArrayList<Integer> iguales = null;
        if (temp[0] == temp[1]) {
            iguales = buscarIndexDosIguales(temp[0]);
        }
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion && iguales == null) {
                    boolean p = table[i][buscarSimbolo(temp[0])];
                    boolean q = table[i][buscarSimbolo(temp[1])];
                    if ((p && q) || (!p && (!q || q))) {
                        table[i][j] = true;
                    }
                } else {
                    if ((j == posicion && iguales != null)) {
                        boolean p = table[i][iguales.get(0)];
                        boolean q = table[i][iguales.get(1)];
                        if ((p && q) || (!p && (!q || q))) {
                            table[i][j] = true;
                        }
                    }
                }
            }
        }
        pila.remove(buscarIndexPila(temp[0]));
        pila.remove(buscarIndexPila(temp[1]));
    }

    public void bicondicional(int posicion, char letra) {
        char temp[] = buscarDosAnteriores(letra);
        ArrayList<Integer> iguales = null;
        if (temp[0] == temp[1]) {
            iguales = buscarIndexDosIguales(temp[0]);
        }
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion && iguales == null) {
                    boolean p = table[i][buscarSimbolo(temp[0])];
                    boolean q = table[i][buscarSimbolo(temp[1])];
                    if ((p && q) || (!p && !q)) {
                        table[i][j] = true;
                    }
                } else {
                    if ((j == posicion && iguales != null)) {
                        boolean p = table[i][iguales.get(0)];
                        boolean q = table[i][iguales.get(1)];
                        if ((p && q) || (!p && !q)) {
                            table[i][j] = true;
                        }
                    }
                }
            }
        }
        pila.remove(buscarIndexPila(temp[0]));
        pila.remove(buscarIndexPila(temp[1]));
    }

    public boolean[][] getTable() {
        return table;
    }

}
