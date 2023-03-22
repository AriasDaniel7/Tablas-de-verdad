/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import mundo.tablas;

/**
 *
 * @author Daniel Arias
 */
public class ventana_principal extends javax.swing.JFrame {

    private tablas t;
    private String TXTentrada;

    public ventana_principal(String cadena) {
        TXTentrada = cadena;
        initComponents();
        detallesFrame();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEntrada_infija = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        simbolo1 = new javax.swing.JButton();
        simbolo4 = new javax.swing.JButton();
        simbolo2 = new javax.swing.JButton();
        simbolo5 = new javax.swing.JButton();
        simbolo3 = new javax.swing.JButton();
        simbolo6 = new javax.swing.JButton();
        simbolo7 = new javax.swing.JButton();
        btnConvertir = new javax.swing.JButton();
        btnTablas = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Digite la expresión en notación infija:");

        txtEntrada_infija.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEntrada_infija.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntrada_infijaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Simbolos disponibles:");

        simbolo1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        simbolo1.setText("∨");
        simbolo1.setMaximumSize(new java.awt.Dimension(45, 25));
        simbolo1.setMinimumSize(new java.awt.Dimension(45, 25));
        simbolo1.setPreferredSize(new java.awt.Dimension(45, 25));
        simbolo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simbolo1ActionPerformed(evt);
            }
        });

        simbolo4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        simbolo4.setText("→");
        simbolo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simbolo4ActionPerformed(evt);
            }
        });

        simbolo2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        simbolo2.setText("∧");
        simbolo2.setMaximumSize(new java.awt.Dimension(45, 25));
        simbolo2.setMinimumSize(new java.awt.Dimension(45, 25));
        simbolo2.setPreferredSize(new java.awt.Dimension(45, 25));
        simbolo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simbolo2ActionPerformed(evt);
            }
        });

        simbolo5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        simbolo5.setText("(");
        simbolo5.setMaximumSize(new java.awt.Dimension(45, 25));
        simbolo5.setMinimumSize(new java.awt.Dimension(45, 25));
        simbolo5.setPreferredSize(new java.awt.Dimension(45, 25));
        simbolo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simbolo5ActionPerformed(evt);
            }
        });

        simbolo3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        simbolo3.setText("¬");
        simbolo3.setMaximumSize(new java.awt.Dimension(45, 25));
        simbolo3.setMinimumSize(new java.awt.Dimension(45, 25));
        simbolo3.setPreferredSize(new java.awt.Dimension(45, 25));
        simbolo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simbolo3ActionPerformed(evt);
            }
        });

        simbolo6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        simbolo6.setText(")");
        simbolo6.setMaximumSize(new java.awt.Dimension(45, 25));
        simbolo6.setMinimumSize(new java.awt.Dimension(45, 25));
        simbolo6.setPreferredSize(new java.awt.Dimension(45, 25));
        simbolo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simbolo6ActionPerformed(evt);
            }
        });

        simbolo7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        simbolo7.setText("↔");
        simbolo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simbolo7ActionPerformed(evt);
            }
        });

        btnConvertir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnConvertir.setText("Postfija");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        btnTablas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnTablas.setText("Tablas");
        btnTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablasActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(txtEntrada_infija, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(simbolo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(simbolo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(simbolo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(simbolo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(simbolo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(simbolo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(simbolo7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btnConvertir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtEntrada_infija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simbolo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simbolo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simbolo3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simbolo5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simbolo6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simbolo4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simbolo7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertir)
                    .addComponent(btnTablas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        simbolo7.getAccessibleContext().setAccessibleParent(simbolo7);

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
    }// </editor-fold>//GEN-END:initComponents

    private void simbolo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simbolo1ActionPerformed
        entradaTXT("∨");
    }//GEN-LAST:event_simbolo1ActionPerformed

    private void simbolo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simbolo4ActionPerformed
        entradaTXT("→");
    }//GEN-LAST:event_simbolo4ActionPerformed

    private void simbolo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simbolo2ActionPerformed
        entradaTXT("∧");
    }//GEN-LAST:event_simbolo2ActionPerformed

    private void simbolo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simbolo5ActionPerformed
        entradaTXT("(");
    }//GEN-LAST:event_simbolo5ActionPerformed

    private void simbolo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simbolo3ActionPerformed
        entradaTXT("¬");
    }//GEN-LAST:event_simbolo3ActionPerformed

    private void simbolo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simbolo6ActionPerformed
        entradaTXT(")");
    }//GEN-LAST:event_simbolo6ActionPerformed

    private void simbolo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simbolo7ActionPerformed
        entradaTXT("↔");
    }//GEN-LAST:event_simbolo7ActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        String entrada = txtEntrada_infija.getText();
        if (!entrada.isEmpty()) {
            if (validarCadena(entrada)) {
                t = new tablas(entrada);
                String salida = t.postfija();

                JLabel etiqueta = new JLabel(salida);
                etiqueta.setFont(new java.awt.Font("Dialog", 1, 18));
                etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

                JOptionPane.showMessageDialog(this, etiqueta, "Expresión en Notacion postfija", JOptionPane.CLOSED_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "Expresión no valida", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                txtEntrada_infija.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Campo Vacio", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            txtEntrada_infija.requestFocus();
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablasActionPerformed
        String entrada = txtEntrada_infija.getText();
        if (!entrada.isEmpty()) {
            if (validarCadena(entrada)) {
                this.dispose();
                tabla vt = new tabla(entrada);
                vt.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Expresión no valida", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                txtEntrada_infija.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Campo Vacio", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            txtEntrada_infija.requestFocus();
        }
    }//GEN-LAST:event_btnTablasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        txtEntrada_infija.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtEntrada_infijaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntrada_infijaKeyTyped
        char validar = evt.getKeyChar();
        if (!Character.isLetter(validar)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEntrada_infijaKeyTyped

    private void detallesFrame() {
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Tablas de Verdad");
        txtEntrada_infija.setText(TXTentrada);
    }

    private void entradaTXT(String txt) {
        int posicion = txtEntrada_infija.getCaretPosition();
        StringBuilder texto = new StringBuilder(txtEntrada_infija.getText());
        texto.insert(posicion, txt);
        txtEntrada_infija.setText(texto.toString());
        txtEntrada_infija.requestFocus();
        txtEntrada_infija.setCaretPosition(posicion + 1);
    }

    public boolean validarCadena(String cadena) {
        char u = cadena.charAt(cadena.length() - 1);
        char p = cadena.charAt(0);
        String patron1 = "[∧ ¬ → ↔ ∨]";
        String patron2 = "[)]";
        String patron3 = "[∧ → ↔ ∨]";
        if (Pattern.matches(patron3, Character.toString(p))
                || Pattern.matches(patron1, Character.toString(u))) {
            return false;
        }
        int conIzq = 0;
        int conDer = 0;
        for (int i = 0; i < cadena.length() - 1; i++) {
            char a = cadena.charAt(i);
            char d = cadena.charAt(i + 1);
            if (a == d || Character.isLetter(a) && Character.isLetter(d)
                    || (Character.isLetter(a) && d == '¬')
                    || (Pattern.matches(patron2, Character.toString(a)) && Character.isLetter(d))) {
                return false;
            }
            if (a == '(') {
                conIzq++;
            } else if (a == ')') {
                conDer++;
            }
        }
        if (u == '(') {
            conIzq++;
        } else if (u == ')') {
            conDer++;
        }

        return conIzq == conDer;
    }

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
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_principal("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnTablas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton simbolo1;
    private javax.swing.JButton simbolo2;
    private javax.swing.JButton simbolo3;
    private javax.swing.JButton simbolo4;
    private javax.swing.JButton simbolo5;
    private javax.swing.JButton simbolo6;
    private javax.swing.JButton simbolo7;
    private javax.swing.JTextField txtEntrada_infija;
    // End of variables declaration//GEN-END:variables
}
