/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class pertambahanduaangkaGUI extends javax.swing.JFrame {

    /**
     * Creates new form pertambahanduaangkaGUI
     */
    public pertambahanduaangkaGUI() {
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

        pertambahanduaangka = new javax.swing.JPanel();
        buttonhapus = new javax.swing.JButton();
        buttonkeluar = new javax.swing.JButton();
        textangkapertama = new javax.swing.JTextField();
        textangkakedua = new javax.swing.JTextField();
        texthasil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Buttontambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pertambahanduaangka.setBackground(new java.awt.Color(51, 255, 0));

        buttonhapus.setText("Hapus");
        buttonhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhapusActionPerformed(evt);
            }
        });

        buttonkeluar.setText("keluar");
        buttonkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkeluarActionPerformed(evt);
            }
        });

        jLabel1.setText("Angka pertama");

        jLabel2.setText("Angka kedua");

        jLabel3.setText("Hasil");

        Buttontambah.setText("Tambah");
        Buttontambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtontambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pertambahanduaangkaLayout = new javax.swing.GroupLayout(pertambahanduaangka);
        pertambahanduaangka.setLayout(pertambahanduaangkaLayout);
        pertambahanduaangkaLayout.setHorizontalGroup(
            pertambahanduaangkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pertambahanduaangkaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pertambahanduaangkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pertambahanduaangkaLayout.createSequentialGroup()
                        .addGroup(pertambahanduaangkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(pertambahanduaangkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textangkapertama)
                            .addComponent(textangkakedua)
                            .addComponent(texthasil))
                        .addContainerGap())
                    .addGroup(pertambahanduaangkaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Buttontambah)
                        .addGap(33, 33, 33)
                        .addComponent(buttonhapus)
                        .addGap(40, 40, 40)
                        .addComponent(buttonkeluar)
                        .addContainerGap(76, Short.MAX_VALUE))))
        );
        pertambahanduaangkaLayout.setVerticalGroup(
            pertambahanduaangkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pertambahanduaangkaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pertambahanduaangkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(textangkapertama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pertambahanduaangkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textangkakedua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pertambahanduaangkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(texthasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pertambahanduaangkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttontambah)
                    .addComponent(buttonhapus)
                    .addComponent(buttonkeluar))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pertambahanduaangka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pertambahanduaangka, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtontambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtontambahActionPerformed
        int angkapertama = Integer.valueOf(textangkapertama.getText());
        int angkakedua = Integer.valueOf(textangkakedua.getText());
        int hasil = angkapertama + angkakedua;
        texthasil.setText(hasil+"");
    }//GEN-LAST:event_ButtontambahActionPerformed

    private void buttonhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhapusActionPerformed
        textangkapertama.setText("");
        textangkakedua.setText("");
        texthasil.setText("");
        textangkapertama.requestFocus();
    }//GEN-LAST:event_buttonhapusActionPerformed

    private void buttonkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkeluarActionPerformed
       String tanya = "Apakah anda yakin akan keluar aplikasi?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)==
                JOptionPane.YES_OPTION;
        if(yakin){
            System.exit(WIDTH);
        }
    }//GEN-LAST:event_buttonkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(pertambahanduaangkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pertambahanduaangkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pertambahanduaangkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pertambahanduaangkaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pertambahanduaangkaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttontambah;
    private javax.swing.JButton buttonhapus;
    private javax.swing.JButton buttonkeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pertambahanduaangka;
    private javax.swing.JTextField textangkakedua;
    private javax.swing.JTextField textangkapertama;
    private javax.swing.JTextField texthasil;
    // End of variables declaration//GEN-END:variables
}
