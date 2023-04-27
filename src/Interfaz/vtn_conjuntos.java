/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import mundo.conjuntos;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mundo.conjuntos_proposiciones;
import mundo.tablas;

/**
 *
 * @author Daniel Arias
 */
public class vtn_conjuntos extends javax.swing.JFrame {

    private conjuntos cj;

    public vtn_conjuntos() {
        cj = new conjuntos();
        initComponents();
        detallesFrame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_u = new javax.swing.JTextField();
        btnAgregar_u = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        datos_U = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        btnAgregar_a = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        datos_A = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_b = new javax.swing.JTextField();
        btnAgregar_b = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        datos_B = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_union = new javax.swing.JButton();
        btn_interseccion = new javax.swing.JButton();
        btn_a_complemento = new javax.swing.JButton();
        btn_b_complemento = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        datos_union = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        datos_interseccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        datos_Acomplemento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        datos_Bcomplemento = new javax.swing.JTextField();
        datos_AmenosB = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        datos_BmenosA = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        datos_diferenciaSimetrica = new javax.swing.JTextField();
        btn_calcularTodo = new javax.swing.JButton();
        btn_Volver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txt_expresionConjuntos = new javax.swing.JTextField();
        btn_txtUnion = new javax.swing.JButton();
        btn_txtInterseccion = new javax.swing.JButton();
        btn_txtComplemento = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_calcularConjunto = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        datos_resultado = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btn_tablaVerdad = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btn_A = new javax.swing.JButton();
        btn_B = new javax.swing.JButton();
        btn_B1 = new javax.swing.JButton();
        btn_B2 = new javax.swing.JButton();
        btn_Volver1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ingreso de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("U");

        txt_u.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_u.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_uKeyTyped(evt);
            }
        });

        btnAgregar_u.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar_u.setText("Agregar U");
        btnAgregar_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_uActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("U = {");

        datos_U.setEditable(false);
        datos_U.setBackground(new java.awt.Color(255, 255, 255));
        datos_U.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("}");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("A");

        txt_a.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_aKeyTyped(evt);
            }
        });

        btnAgregar_a.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar_a.setText("Agregar A");
        btnAgregar_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_aActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("A = {");

        datos_A.setEditable(false);
        datos_A.setBackground(new java.awt.Color(255, 255, 255));
        datos_A.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("}");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("B");

        txt_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bKeyTyped(evt);
            }
        });

        btnAgregar_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar_b.setText("Agregar B");
        btnAgregar_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_bActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("B = {");

        datos_B.setEditable(false);
        datos_B.setBackground(new java.awt.Color(255, 255, 255));
        datos_B.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("}");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_b, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txt_u)
                    .addComponent(txt_a))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar_u, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datos_U)
                    .addComponent(datos_B)
                    .addComponent(datos_A))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_u)
                    .addComponent(btnAgregar_u)
                    .addComponent(jLabel2)
                    .addComponent(datos_U, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datos_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_a)
                        .addComponent(btnAgregar_a)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datos_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_b)
                        .addComponent(btnAgregar_b)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btn_union.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_union.setText("A∪B");
        btn_union.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_unionActionPerformed(evt);
            }
        });

        btn_interseccion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_interseccion.setText("A∩B");
        btn_interseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_interseccionActionPerformed(evt);
            }
        });

        btn_a_complemento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_a_complemento.setText("Ac");
        btn_a_complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a_complementoActionPerformed(evt);
            }
        });

        btn_b_complemento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_b_complemento.setText("Bc");
        btn_b_complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b_complementoActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton8.setText("A - B");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton9.setText("B - A");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton10.setText("A Δ B");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("= {");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("}");

        datos_union.setEditable(false);
        datos_union.setBackground(new java.awt.Color(255, 255, 255));
        datos_union.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("}");

        datos_interseccion.setEditable(false);
        datos_interseccion.setBackground(new java.awt.Color(255, 255, 255));
        datos_interseccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("= {");

        datos_Acomplemento.setEditable(false);
        datos_Acomplemento.setBackground(new java.awt.Color(255, 255, 255));
        datos_Acomplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("= {");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("}");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("= {");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("}");

        datos_Bcomplemento.setEditable(false);
        datos_Bcomplemento.setBackground(new java.awt.Color(255, 255, 255));
        datos_Bcomplemento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        datos_AmenosB.setEditable(false);
        datos_AmenosB.setBackground(new java.awt.Color(255, 255, 255));
        datos_AmenosB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("= {");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("}");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("= {");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("}");

        datos_BmenosA.setEditable(false);
        datos_BmenosA.setBackground(new java.awt.Color(255, 255, 255));
        datos_BmenosA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("}");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("= {");

        datos_diferenciaSimetrica.setEditable(false);
        datos_diferenciaSimetrica.setBackground(new java.awt.Color(255, 255, 255));
        datos_diferenciaSimetrica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_calcularTodo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_calcularTodo.setText("Calcular Todo");
        btn_calcularTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_union, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_interseccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_a_complemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_b_complemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datos_union)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datos_interseccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datos_Acomplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datos_Bcomplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datos_AmenosB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datos_BmenosA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datos_diferenciaSimetrica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(btn_calcularTodo)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_union, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addComponent(datos_union, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(datos_interseccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(btn_interseccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(datos_Acomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(btn_a_complemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(datos_Bcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(btn_b_complemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(datos_AmenosB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(datos_BmenosA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(datos_diferenciaSimetrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22))
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_calcularTodo)
                .addContainerGap())
        );

        btn_Volver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Volver.setText("Atras");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Expresion de Conjuntos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.setName(""); // NOI18N

        txt_expresionConjuntos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_expresionConjuntos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_expresionConjuntosKeyTyped(evt);
            }
        });

        btn_txtUnion.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_txtUnion.setText("∪");
        btn_txtUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_txtUnionActionPerformed(evt);
            }
        });

        btn_txtInterseccion.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_txtInterseccion.setText("∩");
        btn_txtInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_txtInterseccionActionPerformed(evt);
            }
        });

        btn_txtComplemento.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_txtComplemento.setText("⊂");
        btn_txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_txtComplementoActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton4.setText("/");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton5.setText("⊕");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btn_calcularConjunto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_calcularConjunto.setText("Calcular Conjunto");
        btn_calcularConjunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularConjuntoActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Resultado = {");

        datos_resultado.setEditable(false);
        datos_resultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("}");

        btn_tablaVerdad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_tablaVerdad.setText("Tabla de Verdad");
        btn_tablaVerdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tablaVerdadActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 102));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("DEL");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btn_A.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_A.setText("A");
        btn_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AActionPerformed(evt);
            }
        });

        btn_B.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_B.setText("B");
        btn_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BActionPerformed(evt);
            }
        });

        btn_B1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_B1.setText("(");
        btn_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B1ActionPerformed(evt);
            }
        });

        btn_B2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_B2.setText(")");
        btn_B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_expresionConjuntos)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datos_resultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 127, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_B1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_A, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_B, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_txtUnion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(btn_txtInterseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnEliminar))
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btn_B2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btn_tablaVerdad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_calcularConjunto)
                                .addGap(104, 104, 104))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_expresionConjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_txtUnion)
                    .addComponent(btn_txtInterseccion)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_A))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(btn_B))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_B1)
                    .addComponent(btn_B2)
                    .addComponent(btn_txtComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calcularConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tablaVerdad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(datos_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap())
        );

        btn_Volver1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Volver1.setText("Eliminar Datos");
        btn_Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Volver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Volver1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Volver1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        Principal p = new Principal();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        txt_expresionConjuntos.setText("");
        txt_expresionConjuntos.requestFocus();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txt_expresionConjuntosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_expresionConjuntosKeyTyped
        Character caracter = evt.getKeyChar();
        boolean p = Pattern.matches("[A B]", caracter.toString());
        if (!p) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_expresionConjuntosKeyTyped

    private void btn_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AActionPerformed
        entradaTXT("A");
    }//GEN-LAST:event_btn_AActionPerformed

    private void btn_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BActionPerformed
        entradaTXT("B");
    }//GEN-LAST:event_btn_BActionPerformed

    private void btn_txtUnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_txtUnionActionPerformed
        entradaTXT("∪");
    }//GEN-LAST:event_btn_txtUnionActionPerformed

    private void btn_txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_txtComplementoActionPerformed
        entradaTXT("⊂");
    }//GEN-LAST:event_btn_txtComplementoActionPerformed

    private void btn_txtInterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_txtInterseccionActionPerformed
        entradaTXT("∩");
    }//GEN-LAST:event_btn_txtInterseccionActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        entradaTXT("/");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        entradaTXT("⊕");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_B1ActionPerformed
        entradaTXT("(");
    }//GEN-LAST:event_btn_B1ActionPerformed

    private void btn_B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_B2ActionPerformed
        entradaTXT(")");
    }//GEN-LAST:event_btn_B2ActionPerformed

    private void txt_uKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_uKeyTyped
        validarUnDato(txt_u, evt);
    }//GEN-LAST:event_txt_uKeyTyped

    private void txt_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyTyped
        validarUnDato(txt_a, evt);
    }//GEN-LAST:event_txt_aKeyTyped

    private void txt_bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bKeyTyped
        validarUnDato(txt_b, evt);
    }//GEN-LAST:event_txt_bKeyTyped

    private void btnAgregar_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_uActionPerformed
        boolean p = txt_u.getText().length() > 0;
        if (p) {
            cj.agregarDatosListaUniverso(txt_u.getText().charAt(0));
            datos_U.setText(cj.ListaUniverso());
            txt_u.setText("");
            txt_u.requestFocus();
        }
        txt_u.requestFocus();
    }//GEN-LAST:event_btnAgregar_uActionPerformed

    private void btnAgregar_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_aActionPerformed
        boolean p = txt_a.getText().length() > 0;
        if (p) {
            boolean q = cj.verificarExistenciaUniverso(txt_a.getText().charAt(0));
            if (q) {
                if (cj.agregarDatosListaA(txt_a.getText().charAt(0))) {
                    datos_A.setText(cj.ListaA());
                    txt_a.setText("");
                    txt_a.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "El dato no se puede repetir");
                    txt_a.setText("");
                    txt_a.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "El dato no esta en universo");
                txt_a.setText("");
                txt_a.requestFocus();
            }
        }
        txt_a.requestFocus();
    }//GEN-LAST:event_btnAgregar_aActionPerformed

    private void btnAgregar_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_bActionPerformed
        boolean p = txt_b.getText().length() > 0;
        if (p) {
            boolean q = cj.verificarExistenciaUniverso(txt_b.getText().charAt(0));
            if (q) {
                if (cj.agregarDatosListaB(txt_b.getText().charAt(0))) {
                    datos_B.setText(cj.ListaB());
                    txt_b.setText("");
                    txt_b.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "El dato no se puede repetir");
                    txt_b.setText("");
                    txt_b.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "El dato no esta en universo");
                txt_b.setText("");
                txt_b.requestFocus();
            }
        }
        txt_b.requestFocus();
    }//GEN-LAST:event_btnAgregar_bActionPerformed

    private void btn_unionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_unionActionPerformed
        datos_union.setText("");
        if (datos_A.getText().length() > 0) {
            cj.calcularUnion();
            datos_union.setText(cj.ListaUnion());
        } else {
            JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
        }
    }//GEN-LAST:event_btn_unionActionPerformed

    private void btn_Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Volver1ActionPerformed
        datos_A.setText("");
        datos_U.setText("");
        datos_B.setText("");
        datos_union.setText("");
        datos_interseccion.setText("");
        datos_Acomplemento.setText("");
        datos_Bcomplemento.setText("");
        datos_AmenosB.setText("");
        datos_BmenosA.setText("");
        datos_diferenciaSimetrica.setText("");
        cj = new conjuntos();
        txt_u.requestFocus();
    }//GEN-LAST:event_btn_Volver1ActionPerformed

    private void btn_interseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_interseccionActionPerformed
        datos_interseccion.setText("");
        if (datos_A.getText().length() > 0) {
            cj.calcularInterseccion();
            datos_interseccion.setText(cj.ListaInterseccion());
        } else {
            JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
        }
    }//GEN-LAST:event_btn_interseccionActionPerformed

    private void btn_a_complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a_complementoActionPerformed
        datos_Acomplemento.setText("");
        if (datos_A.getText().length() > 0) {
            cj.calcularA_Complemento();
            datos_Acomplemento.setText(cj.ListaA_complemento());
        } else {
            JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
        }
    }//GEN-LAST:event_btn_a_complementoActionPerformed

    private void btn_b_complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b_complementoActionPerformed
        datos_Bcomplemento.setText("");
        if (datos_A.getText().length() > 0) {
            cj.calcularB_Complemento();
            datos_Bcomplemento.setText(cj.ListaB_complemento());
        } else {
            JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
        }
    }//GEN-LAST:event_btn_b_complementoActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        datos_AmenosB.setText("");
        if (datos_A.getText().length() > 0) {
            cj.calcularA_menosB();
            datos_AmenosB.setText(cj.ListaA_menosB());
        } else {
            JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        datos_BmenosA.setText("");
        if (datos_A.getText().length() > 0) {
            cj.calcularB_menosA();
            datos_BmenosA.setText(cj.ListaB_menosA());
        } else {
            JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        datos_diferenciaSimetrica.setText("");
        if (datos_A.getText().length() > 0) {
            cj.calcularDiferenciSimetrica();
            datos_diferenciaSimetrica.setText(cj.ListaDiferenciaSimetrica());
        } else {
            JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btn_calcularTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularTodoActionPerformed
        if (datos_A.getText().length() > 0) {
            datos_union.setText("");
            datos_interseccion.setText("");
            datos_Acomplemento.setText("");
            datos_Bcomplemento.setText("");
            datos_AmenosB.setText("");
            datos_BmenosA.setText("");
            datos_diferenciaSimetrica.setText("");
            cj.calcularUnion();
            cj.calcularInterseccion();
            cj.calcularA_Complemento();
            cj.calcularB_Complemento();
            cj.calcularA_menosB();
            cj.calcularB_menosA();
            cj.calcularDiferenciSimetrica();
            datos_union.setText(cj.ListaUnion());
            datos_interseccion.setText(cj.ListaInterseccion());
            datos_Acomplemento.setText(cj.ListaA_complemento());
            datos_Bcomplemento.setText(cj.ListaB_complemento());
            datos_AmenosB.setText(cj.ListaA_menosB());
            datos_BmenosA.setText(cj.ListaB_menosA());
            datos_diferenciaSimetrica.setText(cj.ListaDiferenciaSimetrica());
        } else {
            JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
        }
    }//GEN-LAST:event_btn_calcularTodoActionPerformed

    private void btn_calcularConjuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularConjuntoActionPerformed
        boolean p = txt_expresionConjuntos.getText().isEmpty();
        datos_resultado.setText("");
        if (!p) {
            if (validarCadena(txt_expresionConjuntos.getText().intern())) {
                if (datos_A.getText().length() > 0) {
                    conjuntos_proposiciones cp = new conjuntos_proposiciones(txt_expresionConjuntos.getText().intern());
                    tablas t = new tablas(cp.convertir());
                    t.crearTabla();
                    t.unirMatrices();
                    cj.calcularConjuntos(t.matrizParaConjuntos(), t.Preposiciones());
                    datos_resultado.setText(cj.ListaConjuntosCalculados());
                } else {
                    JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Entrada no valida!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Entrada Vacia!");
        }
    }//GEN-LAST:event_btn_calcularConjuntoActionPerformed

    private void btn_tablaVerdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tablaVerdadActionPerformed
        boolean p = txt_expresionConjuntos.getText().isEmpty();
        if (!p) {
            if (validarCadena(txt_expresionConjuntos.getText().intern())) {
                if (datos_A.getText().length() > 0) {
                    conjuntos_proposiciones cp = new conjuntos_proposiciones(txt_expresionConjuntos.getText().intern());
                    tabla_conjuntos tc = new tabla_conjuntos(cp.convertir());
                    tc.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Complete el ingreso de datos!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Entrada no valida!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Entrada Vacia!");
        }
    }//GEN-LAST:event_btn_tablaVerdadActionPerformed

    private void detallesFrame() {
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Conjuntos");
    }

    private void validarUnDato(JTextField entrada, java.awt.event.KeyEvent evt) {
        int len = entrada.getText().length();
        if (len > 0) {
            evt.consume();
        }
    }

    private void entradaTXT(String txt) {
        int posicion = txt_expresionConjuntos.getCaretPosition();
        StringBuilder texto = new StringBuilder(txt_expresionConjuntos.getText());
        texto.insert(posicion, txt);
        txt_expresionConjuntos.setText(texto.toString());
        txt_expresionConjuntos.requestFocus();
        txt_expresionConjuntos.setCaretPosition(posicion + 1);
    }

    public boolean validarCadena(String cadena) {
        int izq = 0;
        int der = 0;
        char u = cadena.charAt(cadena.length() - 1);
        char p = cadena.charAt(0);
        boolean a = Pattern.matches("[/ ∪ ∩ ⊕ ⊂]", Character.toString(u));
        boolean b = Pattern.matches("[/ ∪ ∩ ⊕ ⊂]", Character.toString(p));

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

        for (int i = 0; i < cadena.length() - 2; i++) {
            char char1 = cadena.charAt(i);
            char char2 = cadena.charAt(i + 1);
            char char3 = cadena.charAt(i + 2);
            boolean entre1 = char3 == ')' && Pattern.matches("[/ ∪ ∩ ⊕]", Character.toString(char2));
            boolean entre2 = (char1 == '(' && Pattern.matches("[/ ∪ ∩ ⊕ ⊂]", Character.toString(char2)) && char3 == ')');
            boolean entre3 = (char1 == '(' && Pattern.matches("[/ ∪ ∩ ⊕ ⊂]", Character.toString(char2)) && Character.isLetter(char3));
            boolean entre4 = (Character.isLetter(char1) && Pattern.matches("[( )]", Character.toString(char2)) && Character.isLetter(char3));

            if (entre1 || entre2 || entre3 || entre4) {
                return false;
            }
        }

        for (int i = 0; i < cadena.length() - 1; i++) {
            char char1 = cadena.charAt(i);
            char char2 = cadena.charAt(i + 1);
            boolean entre1 = (char1 == char2) && !(char1 == '(' || char1 == ')') && !(char2 == '(' || char2 == ')');
            boolean entre2 = Character.isLetter(char1) && Character.isLetter(char2);
            boolean entre3 = Pattern.matches("[/ ∪ ∩ ⊕ ⊂]", Character.toString(char1)) && Pattern.matches("[/ ∪ ∩ ⊕ ⊂]", Character.toString(char2));

            boolean entre4 = Pattern.matches("[(]", Character.toString(char1)) && Pattern.matches("[)]", Character.toString(char2));
            if (entre1 || entre2 || entre3 || entre4) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(conjuntos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conjuntos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conjuntos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conjuntos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtn_conjuntos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar_a;
    private javax.swing.JButton btnAgregar_b;
    private javax.swing.JButton btnAgregar_u;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btn_A;
    private javax.swing.JButton btn_B;
    private javax.swing.JButton btn_B1;
    private javax.swing.JButton btn_B2;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JButton btn_Volver1;
    private javax.swing.JButton btn_a_complemento;
    private javax.swing.JButton btn_b_complemento;
    private javax.swing.JButton btn_calcularConjunto;
    private javax.swing.JButton btn_calcularTodo;
    private javax.swing.JButton btn_interseccion;
    private javax.swing.JButton btn_tablaVerdad;
    private javax.swing.JButton btn_txtComplemento;
    private javax.swing.JButton btn_txtInterseccion;
    private javax.swing.JButton btn_txtUnion;
    private javax.swing.JButton btn_union;
    private javax.swing.JTextField datos_A;
    private javax.swing.JTextField datos_Acomplemento;
    private javax.swing.JTextField datos_AmenosB;
    private javax.swing.JTextField datos_B;
    private javax.swing.JTextField datos_Bcomplemento;
    private javax.swing.JTextField datos_BmenosA;
    private javax.swing.JTextField datos_U;
    private javax.swing.JTextField datos_diferenciaSimetrica;
    private javax.swing.JTextField datos_interseccion;
    private javax.swing.JTextField datos_resultado;
    private javax.swing.JTextField datos_union;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_b;
    private javax.swing.JTextField txt_expresionConjuntos;
    private javax.swing.JTextField txt_u;
    // End of variables declaration//GEN-END:variables
}
