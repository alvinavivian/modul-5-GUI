/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS2;

/**
 *
 * @author alvin
 */
public class kuis2 extends javax.swing.JFrame {

    /**
     * Creates new form kuis2
     */
    public kuis2() {
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

        HB1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HB2 = new javax.swing.JTextField();
        HB3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HB4 = new javax.swing.JTextField();
        Keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Diskon = new javax.swing.JTextField();
        Proses = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        HB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HB1ActionPerformed(evt);
            }
        });
        getContentPane().add(HB1);
        HB1.setBounds(140, 20, 150, 30);

        jLabel4.setText("Harga Barang 1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 30, 100, 14);

        jLabel3.setText("Harga Barang 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 60, 120, 14);

        HB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HB2ActionPerformed(evt);
            }
        });
        getContentPane().add(HB2);
        HB2.setBounds(140, 60, 140, 20);

        HB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HB3ActionPerformed(evt);
            }
        });
        getContentPane().add(HB3);
        HB3.setBounds(140, 90, 140, 20);

        jLabel5.setText("Harga Barang 3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 90, 100, 14);

        jLabel6.setText("Harga Barang 4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 120, 120, 14);

        HB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HB4ActionPerformed(evt);
            }
        });
        getContentPane().add(HB4);
        HB4.setBounds(140, 120, 150, 20);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(270, 210, 90, 30);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 280, 330, 150);

        jLabel7.setText("Hasil");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 250, 120, 14);

        jLabel8.setText("Diskon");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 170, 120, 14);

        Diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiskonActionPerformed(evt);
            }
        });
        getContentPane().add(Diskon);
        Diskon.setBounds(140, 160, 150, 30);

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses);
        Proses.setBounds(40, 210, 90, 30);

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus);
        Hapus.setBounds(150, 210, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HB1ActionPerformed

    private void HB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HB2ActionPerformed

    private void HB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HB3ActionPerformed

    private void HB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HB4ActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_KeluarActionPerformed

    private void DiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiskonActionPerformed

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:int hb1 = Integer.parseInt(HB1.getText());
        int hb1 = Integer.parseInt(HB1.getText());
        int hb2 = Integer.parseInt(HB2.getText());
        int hb3 = Integer.parseInt(HB3.getText());
        int hb4 = Integer.parseInt(HB4.getText());
        int diskon = Integer.parseInt(Diskon.getText());
        int hasil = hb1+hb2+hb3+hb4;
        int total = hasil*diskon/100;
        
        Hasil.setText("Harga Barang 1 = "+hb1+"\n Harga Barang 2 = "+hb2+"\n Harga Barang 3 = "
            +hb3+"\n Harga Barang 4 = "+hb4+"\n Diskon = "+diskon+"\n total pembayaran = "+hasil+"\n Total Bayar = "+total);
    }//GEN-LAST:event_ProsesActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HapusActionPerformed

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
            java.util.logging.Logger.getLogger(kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Diskon;
    private javax.swing.JTextField HB1;
    private javax.swing.JTextField HB2;
    private javax.swing.JTextField HB3;
    private javax.swing.JTextField HB4;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Proses;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
