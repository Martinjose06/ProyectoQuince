/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfa;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author LUCYLEONOR
 */
public class BancoDelPueblo extends javax.swing.JFrame {

    /**
     * Creates new form BancoDelPueblo
     */
    public BancoDelPueblo() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblCE = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCO = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPP = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdRestaurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Banco Del Pueblo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Monto de Prestamo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPKeyTyped(evt);
            }
        });
        jPanel1.add(txtP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Cuotas Especiales");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblCE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 140, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Cuotas ordinarias");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        lblCO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 140, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Pago Total del Prestamo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        lblPP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 140, 30));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        cmdRestaurar.setText("Restaurar");
        cmdRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        if (txtP.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Ingresó El Prestamo", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtP.requestFocusInWindow();
        } else if (txtP.getText().equalsIgnoreCase("0")) {
            JOptionPane.showMessageDialog(this, "El Prestamo Debe Ser Superior A 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtP.requestFocusInWindow();
            txtP.selectAll();

        } else {
            String r, r1, r2;
            double t, co, ce, p;

            p = Double.parseDouble(txtP.getText());

            t = p * 1.24;

            co = (t / 2) / 20;
            ce = (t / 2) / 4;

            r = String.valueOf(t);
            r1 = String.valueOf(co);
            r2 = String.valueOf(ce);

            lblCO.setText("$ " + r1);
            lblPP.setText("$ " + r);
            lblCE.setText("$ " + r2);
        }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestaurarActionPerformed

        txtP.setText("");
        lblCO.setText("");
        lblPP.setText("");
        lblCE.setText("");
        txtP.requestFocusInWindow();
    }//GEN-LAST:event_cmdRestaurarActionPerformed

    private void txtPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPKeyTyped

    private void txtPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtP.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No Ingresó El Prestamo", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtP.requestFocusInWindow();
            } else if (txtP.getText().equalsIgnoreCase("0")) {
                JOptionPane.showMessageDialog(this, "El Prestamo Debe Ser Superior A 0", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtP.requestFocusInWindow();
                txtP.selectAll();

            } else {
                String r, r1, r2;
                double t, co, ce, p;

                p = Double.parseDouble(txtP.getText());

                t = p * 1.24;

                co = (t / 2) / 20;
                ce = (t / 2) / 4;

                r = String.valueOf(t);
                r1 = String.valueOf(co);
                r2 = String.valueOf(ce);

                lblCO.setText("$ " + r1);
                lblPP.setText("$ " + r);
                lblCE.setText("$ " + r2);
            }
        }
    }//GEN-LAST:event_txtPKeyPressed

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
            java.util.logging.Logger.getLogger(BancoDelPueblo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancoDelPueblo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancoDelPueblo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancoDelPueblo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancoDelPueblo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdRestaurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCE;
    private javax.swing.JLabel lblCO;
    private javax.swing.JLabel lblPP;
    private javax.swing.JTextField txtP;
    // End of variables declaration//GEN-END:variables
}
