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
public class conjuntos {

    private ArrayList<Character> listaUniverso;
    private ArrayList<Character> listaA;
    private ArrayList<Character> listaB;
    private ArrayList<Character> listaUnion;
    private ArrayList<Character> listaInterseccion;
    private ArrayList<Character> listaA_complemento;
    private ArrayList<Character> listaB_complemento;
    private ArrayList<Character> listaA_menosB;
    private ArrayList<Character> listaB_menosA;
    private ArrayList<Character> listaDiferenciaSimetrica;
    private ArrayList<Character> listaConjuntosCalculados;

    public conjuntos() {
        listaUniverso = new ArrayList<>();
        listaA = new ArrayList<>();
        listaB = new ArrayList<>();
        listaUnion = new ArrayList<>();
        listaInterseccion = new ArrayList<>();
        listaA_complemento = new ArrayList<>();
        listaB_complemento = new ArrayList<>();
        listaA_menosB = new ArrayList<>();
        listaB_menosA = new ArrayList<>();
        listaDiferenciaSimetrica = new ArrayList<>();
        listaConjuntosCalculados = new ArrayList<>();
    }

    public boolean verificarRepetidos(ArrayList<Character> lista, char caracter) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == caracter) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarExistenciaUniverso(char caracter) {
        for (int i = 0; i < listaUniverso.size(); i++) {
            if (listaUniverso.get(i) == caracter) {
                return true;
            }
        }
        return false;
    }

    public boolean agregarDatosListaUniverso(char caracter) {
        boolean p = verificarRepetidos(listaUniverso, caracter);
        if (!p) {
            listaUniverso.add(caracter);
            return true;
        }
        return false;
    }

    public boolean agregarDatosListaA(char caracter) {
        boolean p = verificarRepetidos(listaA, caracter);
        if (!p) {
            listaA.add(caracter);
            return true;
        }
        return false;
    }

    public boolean agregarDatosListaB(char caracter) {
        boolean p = verificarRepetidos(listaB, caracter);
        if (!p) {
            listaB.add(caracter);
            return true;
        }
        return false;
    }

    public String ListaUniverso() {
        String cadena = listaUniverso.get(0).toString();
        for (int i = 1; i < listaUniverso.size(); i++) {
            cadena += ", " + listaUniverso.get(i);
        }
        return cadena;
    }

    public String ListaA() {
        String cadena = listaA.get(0).toString();
        for (int i = 1; i < listaA.size(); i++) {
            cadena += ", " + listaA.get(i);
        }
        return cadena;
    }

    public String ListaB() {
        String cadena = listaB.get(0).toString();
        for (int i = 1; i < listaB.size(); i++) {
            cadena += ", " + listaB.get(i);
        }
        return cadena;
    }

    public String ListaUnion() {
        if (listaUnion.size() > 0) {
            String cadena = listaUnion.get(0).toString();
            for (int i = 1; i < listaUnion.size(); i++) {
                cadena += ", " + listaUnion.get(i);
            }
            return cadena;
        }
        return "null";
    }

    public String ListaInterseccion() {
        if (listaInterseccion.size() > 0) {
            String cadena = listaInterseccion.get(0).toString();
            for (int i = 1; i < listaInterseccion.size(); i++) {
                cadena += ", " + listaInterseccion.get(i);
            }
            return cadena;
        }
        return "null";
    }

    public String ListaA_complemento() {
        if (listaA_complemento.size() > 0) {
            String cadena = listaA_complemento.get(0).toString();
            for (int i = 1; i < listaA_complemento.size(); i++) {
                cadena += ", " + listaA_complemento.get(i);
            }
            return cadena;
        }
        return "null";
    }

    public String ListaB_complemento() {
        if (listaB_complemento.size() > 0) {
            String cadena = listaB_complemento.get(0).toString();
            for (int i = 1; i < listaB_complemento.size(); i++) {
                cadena += ", " + listaB_complemento.get(i);
            }
            return cadena;
        }
        return "null";
    }

    public String ListaA_menosB() {
        if (listaA_menosB.size() > 0) {
            String cadena = listaA_menosB.get(0).toString();
            for (int i = 1; i < listaA_menosB.size(); i++) {
                cadena += ", " + listaA_menosB.get(i);
            }
            return cadena;
        }
        return "null";
    }

    public String ListaB_menosA() {
        if (listaB_menosA.size() > 0) {
            String cadena = listaB_menosA.get(0).toString();
            for (int i = 1; i < listaB_menosA.size(); i++) {
                cadena += ", " + listaB_menosA.get(i);
            }
            return cadena;
        }
        return "null";
    }

    public String ListaDiferenciaSimetrica() {
        if (listaDiferenciaSimetrica.size() > 0) {
            String cadena = listaDiferenciaSimetrica.get(0).toString();
            for (int i = 1; i < listaDiferenciaSimetrica.size(); i++) {
                cadena += ", " + listaDiferenciaSimetrica.get(i);
            }
            return cadena;
        }
        return "null";
    }
    
    public String ListaConjuntosCalculados() {
        if (listaConjuntosCalculados.size() > 0) {
            String cadena = listaConjuntosCalculados.get(0).toString();
            for (int i = 1; i < listaConjuntosCalculados.size(); i++) {
                cadena += ", " + listaConjuntosCalculados.get(i);
            }
            return cadena;
        }
        return "null";
    }

    public void calcularUnion() {
        listaUnion = new ArrayList<>();
        for (int i = 0; i < listaUniverso.size(); i++) {
            boolean p = listaA.contains(listaUniverso.get(i));
            boolean q = listaB.contains(listaUniverso.get(i));
            if (p || q) {
                listaUnion.add(listaUniverso.get(i));
            }
        }
    }

    public void calcularInterseccion() {
        listaInterseccion = new ArrayList<>();
        for (int i = 0; i < listaUniverso.size(); i++) {
            boolean p = listaA.contains(listaUniverso.get(i));
            boolean q = listaB.contains(listaUniverso.get(i));
            if (p && q) {
                listaInterseccion.add(listaUniverso.get(i));
            }
        }
    }

    public void calcularA_Complemento() {
        listaA_complemento = new ArrayList<>();
        for (int i = 0; i < listaUniverso.size(); i++) {
            boolean p = listaA.contains(listaUniverso.get(i));
            if (!p) {
                listaA_complemento.add(listaUniverso.get(i));
            }
        }
    }

    public void calcularB_Complemento() {
        listaB_complemento = new ArrayList<>();
        for (int i = 0; i < listaUniverso.size(); i++) {
            boolean p = listaB.contains(listaUniverso.get(i));
            if (!p) {
                listaB_complemento.add(listaUniverso.get(i));
            }
        }
    }

    public void calcularA_menosB() {
        listaA_menosB = new ArrayList<>();
        for (int i = 0; i < listaUniverso.size(); i++) {
            boolean p = listaA.contains(listaUniverso.get(i));
            boolean q = listaB.contains(listaUniverso.get(i));
            if (p && !q) {
                listaA_menosB.add(listaUniverso.get(i));
            }
        }
    }

    public void calcularB_menosA() {
        listaB_menosA = new ArrayList<>();
        for (int i = 0; i < listaUniverso.size(); i++) {
            boolean p = listaA.contains(listaUniverso.get(i));
            boolean q = listaB.contains(listaUniverso.get(i));
            if (!p && q) {
                listaB_menosA.add(listaUniverso.get(i));
            }
        }
    }

    public void calcularDiferenciSimetrica() {
        listaDiferenciaSimetrica = new ArrayList<>();
        for (int i = 0; i < listaUniverso.size(); i++) {
            boolean p = listaA.contains(listaUniverso.get(i));
            boolean q = listaB.contains(listaUniverso.get(i));
            if ((p || q) && !(p && q)) {
                listaDiferenciaSimetrica.add(listaUniverso.get(i));
            }
        }
    }

    public void calcularConjuntos(boolean[][] matriz, ArrayList<Character> proposiones) {
        listaConjuntosCalculados = new ArrayList<>();

        for (int k = 0; k < listaUniverso.size(); k++) {
            boolean p = listaA.contains(listaUniverso.get(k));
            boolean q = listaB.contains(listaUniverso.get(k));
            if (matriz[0].length > 1) {
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        if (p == matriz[i][j] && q == matriz[i][j + 1]) {
                            listaConjuntosCalculados.add(listaUniverso.get(k));
                        }
                        j++;
                    }
                }
            } else {
                boolean r = p == matriz[0][0];
                if (proposiones.get(0) == 'A' && r) {
                    listaConjuntosCalculados.add(listaUniverso.get(k));
                } else {
                    r = q == matriz[0][0];
                    if (proposiones.get(0) == 'B' && r) {
                        listaConjuntosCalculados.add(listaUniverso.get(k));
                    }
                }
            }
        }
    }
}
