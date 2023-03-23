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
    private ArrayList<Integer> pilaIndex;
    private boolean[][] table;

    public tablas(String infija) {
        cadena = infija;
        iniciarMatrizBase();
        iniciarTabla();
        sy = new ShuntingYard();
        pilaIndex = new ArrayList<>();
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
                    pilaIndex.add(i);
                    disyuncion(i, cadena.charAt(i));
                    break;
                case '→':
                    pilaIndex.add(i);
                    condicional(i, cadena.charAt(i));
                    break;
                case '∧':
                    pilaIndex.add(i);
                    conjuncion(i, cadena.charAt(i));
                    break;
                case '¬':
                    pilaIndex.add(i);
                    negacion(i, cadena.charAt(i));
                    break;
                case '↔':
                    pilaIndex.add(i);
                    bicondicional(i, cadena.charAt(i));
                    break;
                default:
                    pilaIndex.add(i);
            }
        }
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

    public int buscarUbicacionPilaIndex(int dato) {
        for (int i = 0; i < pilaIndex.size(); i++) {
            if (pilaIndex.get(i) == dato) {
                return i;
            }
        }
        return -1;
    }

    public int buscarDatoPila(int dato) {
        for (int i = 0; i < pilaIndex.size(); i++) {
            if (i == dato) {
                return pilaIndex.get(i);
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
        int index = buscarUbicacionPilaIndex(posicion);
        int desp = buscarDatoPila(index - 1);
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion) {
                    boolean p = table[i][desp];
                    if (!p) {
                        table[i][j] = true;
                    }
                }
            }
        }
        pilaIndex.remove(buscarUbicacionPilaIndex(desp));
    }

    public void disyuncion(int posicion, char letra) {
        int index = buscarUbicacionPilaIndex(posicion);
        int ant = buscarDatoPila(index - 2);
        int desp = buscarDatoPila(index - 1);
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion) {
                    boolean p = table[i][ant];
                    boolean q = table[i][desp];
                    if (p || q) {
                        table[i][j] = true;
                    }
                }
            }
        }
        pilaIndex.remove(buscarUbicacionPilaIndex(ant));
        pilaIndex.remove(buscarUbicacionPilaIndex(desp));
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
        int index = buscarUbicacionPilaIndex(posicion);
        int ant = buscarDatoPila(index - 2);
        int desp = buscarDatoPila(index - 1);
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion) {
                    boolean p = table[i][ant];
                    boolean q = table[i][desp];
                    if (p && q) {
                        table[i][j] = true;
                    }
                }
            }
        }

        pilaIndex.remove(buscarUbicacionPilaIndex(ant));
        pilaIndex.remove(buscarUbicacionPilaIndex(desp));
    }

    public void condicional(int posicion, char letra) {
        int index = buscarUbicacionPilaIndex(posicion);
        int ant = buscarDatoPila(index - 2);
        int desp = buscarDatoPila(index - 1);
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion) {
                    boolean p = table[i][ant];
                    boolean q = table[i][desp];
                    if ((p && q) || (!p && (!q || q))) {
                        table[i][j] = true;
                    }
                }
            }
        }
        pilaIndex.remove(buscarUbicacionPilaIndex(ant));
        pilaIndex.remove(buscarUbicacionPilaIndex(desp));
    }

    public void bicondicional(int posicion, char letra) {
        int index = buscarUbicacionPilaIndex(posicion);
        int ant = buscarDatoPila(index - 2);
        int desp = buscarDatoPila(index - 1);
        for (int j = 0; j < table[0].length; j++) {
            for (int i = 0; i < table.length; i++) {
                if (j == posicion) {
                    boolean p = table[i][ant];
                    boolean q = table[i][desp];
                    if ((p && q) || (!p && !q)) {
                        table[i][j] = true;
                    }
                }
            }
        }
        pilaIndex.remove(buscarUbicacionPilaIndex(ant));
        pilaIndex.remove(buscarUbicacionPilaIndex(desp));
    }

    public boolean[][] getTable() {
        return table;
    }

}
