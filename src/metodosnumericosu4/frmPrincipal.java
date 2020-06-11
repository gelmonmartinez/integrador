/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericosu4;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Carlos Estrella
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtB = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        txtFuncion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        btnTrapecio = new javax.swing.JButton();
        btnSimpsonTercio = new javax.swing.JButton();
        txtSimpsonTercio = new javax.swing.JTextField();
        txtTrapecio = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 327));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        txtB.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtB.setText(" b");
        jPanel1.add(txtB);
        txtB.setBounds(80, 50, 50, 30);

        txtA.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtA.setText(" a");
        jPanel1.add(txtA);
        txtA.setBounds(70, 130, 50, 30);

        txtFuncion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtFuncion.setText(" f(x)");
        jPanel1.add(txtFuncion);
        txtFuncion.setBounds(90, 90, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/integral.3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 60, 60, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("dx");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 90, 30, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("N = ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 130, 30, 30);

        txtN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNKeyTyped(evt);
            }
        });
        jPanel1.add(txtN);
        txtN.setBounds(250, 130, 40, 30);

        btnTrapecio.setText("Trapecio");
        btnTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrapecioActionPerformed(evt);
            }
        });
        jPanel1.add(btnTrapecio);
        btnTrapecio.setBounds(10, 180, 110, 30);

        btnSimpsonTercio.setText("Simpson 1/3");
        btnSimpsonTercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpsonTercioActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpsonTercio);
        btnSimpsonTercio.setBounds(10, 210, 110, 30);
        jPanel1.add(txtSimpsonTercio);
        txtSimpsonTercio.setBounds(140, 210, 160, 30);
        jPanel1.add(txtTrapecio);
        txtTrapecio.setBounds(140, 180, 160, 30);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(330, 260, 80, 30);

        btnNuevo.setText("Nueva integral");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo);
        btnNuevo.setBounds(300, 60, 120, 30);

        btnAyuda.setText("Ayuda");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAyuda);
        btnAyuda.setBounds(360, 0, 70, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtA.setText("");
        txtB.setText("");
        txtFuncion.setText("");
        txtN.setText("");
        txtSimpsonTercio.setText("");
        txtTrapecio.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrapecioActionPerformed
        if (!txtA.getText().equals("") && !txtB.getText().equals("") && !txtFuncion.getText().equals("") && !txtN.getText().equals("") && !txtA.getText().equals("a") && !txtB.getText().equals("b") && !txtFuncion.getText().equals("f(x)")) {
            String funcion = txtFuncion.getText();
            String a = txtA.getText();
            String b = txtB.getText();
            int n = Integer.parseInt(txtN.getText());

            Metodos trapecio = new Metodos();
            if (n == 2) {
                txtTrapecio.setText(trapecio.metodoTrapecio(a, b, funcion));
            } else if (n > 2) {
                dlgTrapecioMultiple trapecioMultiple = new dlgTrapecioMultiple(this, true);
                ModeloTablaTrapecioMultiple model = null;
                ArrayList<FilaTrapecioMultiple> lista = trapecio.metodoTrapecioMultiple(a, b, n, funcion);
                txtTrapecio.setText(Double.toString(trapecio.resultadoTrapecioMultiple));
                if (lista != null) {
                    model = new ModeloTablaTrapecioMultiple(lista);
                    trapecioMultiple.tblTrapecioMultiple.setModel(model);
                }
                trapecioMultiple.setLocationRelativeTo(null);
                trapecioMultiple.setTitle("Trapecio Multiple");
                trapecioMultiple.setVisible(true);
            } else {
                txtTrapecio.setText("n debe ser >= 2");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos correctamente");
        }
    }//GEN-LAST:event_btnTrapecioActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "Siga las siguientes instrucciones\n"
                + "                Si desea usar:\n\n3.1416 = pi\nSeno = sin\nCoseno = cos\nRaiz = sqrt\nPotencia = ^\nEuler = e");
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnSimpsonTercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpsonTercioActionPerformed
        if (!txtA.getText().equals("") && !txtB.getText().equals("") && !txtFuncion.getText().equals("") && !txtN.getText().equals("") && !txtA.getText().equals("a") && !txtB.getText().equals("b") && !txtFuncion.getText().equals("f(x)")) {
            String funcion = txtFuncion.getText();
            String a = txtA.getText();
            String b = txtB.getText();
            int n = Integer.parseInt(txtN.getText());

            Metodos simpsonTercio = new Metodos();
            if (n == 2) {
                txtSimpsonTercio.setText(simpsonTercio.metodoSimpsonTercio(a, b, funcion));
            } else if (n > 2 && n % 2 == 0) {
                dlgSimpsonTercioMultiple simpsonTercioMultiple = new dlgSimpsonTercioMultiple(this, true);
                ModeloTablaSimpsonTercioMultiple model = null;
                ArrayList<FilaSimpsonTercioMultiple> lista = simpsonTercio.metodoSimpsonTercioMultiple(a, b, n, funcion);
                txtSimpsonTercio.setText(Double.toString(simpsonTercio.resultadoSimpsonTercioMultiple));
                if (lista != null) {
                    model = new ModeloTablaSimpsonTercioMultiple(lista);
                    simpsonTercioMultiple.tblSimpsonTercioMultiple.setModel(model);
                }
                simpsonTercioMultiple.setLocationRelativeTo(null);
                simpsonTercioMultiple.setTitle("Simpson 1/3 Multiple");
                simpsonTercioMultiple.setVisible(true);
            } else {
                txtSimpsonTercio.setText("n debe ser >= 2 y par");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos correctamente");
        }
    }//GEN-LAST:event_btnSimpsonTercioActionPerformed

    private void txtNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNKeyTyped
        char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    getToolkit().beep();
                    evt.consume();
                }
    }//GEN-LAST:event_txtNKeyTyped

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSimpsonTercio;
    private javax.swing.JButton btnTrapecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtSimpsonTercio;
    private javax.swing.JTextField txtTrapecio;
    // End of variables declaration//GEN-END:variables
}
