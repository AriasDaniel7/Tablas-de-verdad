/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import mundo.tablas;

/**
 *
 * @author Daniel Arias
 */
public class tabla_conjuntos extends javax.swing.JFrame {

    private tablas t;
    private String cadena;
    private String TXTentrada;
    private JTable tabla;
    private JScrollPane scroll;

    public tabla_conjuntos(String infija) {
        this.cadena = infija;
        this.TXTentrada = infija;
        t = new tablas(infija);
        initComponents();
        detallesFrame();
        modeloTabla();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void detallesFrame() {
        setResizable(false);
        //setLocationRelativeTo(null);
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        setTitle("Tablas de Verdad");

    }

    private void modeloTabla() {
        scroll = new JScrollPane();
        tabla = new JTable();

        jPanel1.add(scroll);

        tabla = new JTable();
        tabla.setFont(new Font("Dialog", Font.BOLD, 12));
        tabla.setEnabled(false);

        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);

        DefaultTableCellRenderer centrar = new DefaultTableCellRenderer();
        centrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        int ancho = 0;
        cadena = t.postfija();
        ArrayList<Character> proposiciones = t.Preposiciones();
        for (int i = 0; i < proposiciones.size(); i++) {
            modelo.addColumn(proposiciones.get(i));
            ancho += 60;
        }

        for (int i = 0; i < cadena.length(); i++) {
            modelo.addColumn(cadena.charAt(i));
            ancho += 60;
        }

        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centrar);
        }

        tabla.setRowHeight(54);

        int alto = 60 * (int) Math.pow(2, t.contarPreposiciones());
        this.setSize(ancho, alto + 90);
        scroll.setBounds(0, 0, this.getWidth() - 6, this.getHeight() - 80);

        tabla.getTableHeader().setFont(new java.awt.Font("Dialog", 1, 15));
        ((DefaultTableCellRenderer) tabla.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        scroll.setViewportView(tabla);
    }

    private void cargarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

        modelo.setRowCount(0);

        t.crearTabla();
        boolean matriz[][] = t.unirMatrices();

        for (int i = 0; i < matriz.length; i++) {
            ArrayList<Character> columna = new ArrayList<>();
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]) {
                    columna.add('V');
                } else {
                    columna.add('F');
                }

            }
            modelo.addRow(columna.toArray());
        }
        tabla.setModel(modelo);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tabla_conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla_conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla_conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla_conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabla_conjuntos("((A∨B)∧¬(A∧B))").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
