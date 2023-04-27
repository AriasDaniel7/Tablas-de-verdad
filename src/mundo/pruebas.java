/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Daniel Arias
 */
public class pruebas {

    public static void main(String args[]) {
        /*
        String cadena = "(((p∨q)∨r)∧¬((p∨q)∧r))";
        tablas t = new tablas(cadena);
        
        t.crearTabla();
        t.imprimirMatriz();
        t.imprimirMatrizBase();
        */
        
        /*
        conjuntos cj = new conjuntos();
        cj.agregarDatosListaUniverso('a');
        cj.agregarDatosListaUniverso('b');
        cj.agregarDatosListaUniverso('c');
        
        cj.agregarDatosListaA('a');
        cj.agregarDatosListaA('b');
        
        cj.agregarDatosListaB('c');
        
        cj.calcularUnion();
        cj.calcularInterseccion();
        System.out.println(cj.ListaUnion());
        System.out.println(cj.ListaInterseccion());
        
        */
        
        conjuntos_proposiciones cp = new conjuntos_proposiciones("AΔB");
        String n1 = cp.convertir();
        cp = new conjuntos_proposiciones("BΔA");
        String n2 = cp.convertir();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1 + "Δ" + n2);
        //(A∨B)∧¬(A∧B)Δ(B∨A)∧¬(B∧A)
        cp = new conjuntos_proposiciones("((A∨B)∧¬(A∧B))Δ((B∨A)∧¬(B∧A)))");
        System.out.println(cp.convertir());
        //((A∨B)∧¬((A∧B)∨(B∨A))∧¬((A∧B)∧(B∨A))∧¬(B∧A))
    }
}
