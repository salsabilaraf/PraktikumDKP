/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasakhir;
/**
 *
 * @author DELFA EDISON
 */
public class FormUtama extends javax.swing.JFrame {

    /**
     * Creates new form bangunDatar
     */
    public FormUtama() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RBBelahKetupat = new javax.swing.JRadioButton();
        RBLingkaran = new javax.swing.JRadioButton();
        RBJajarGenjang = new javax.swing.JRadioButton();
        RBLayanglayang = new javax.swing.JRadioButton();
        RBPersegiPanjang = new javax.swing.JRadioButton();
        RBSegitiga = new javax.swing.JRadioButton();
        RBPersegi = new javax.swing.JRadioButton();
        RBTrapesium = new javax.swing.JRadioButton();
        BPilih = new javax.swing.JButton();
        PKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(java.awt.SystemColor.control);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAM MENGHITUNG LUAS DAN KELILING");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BANGUN DATAR");

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel3.setText("Bangun Datar :");

        RBBelahKetupat.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        RBBelahKetupat.setText("Belah Ketupat");
        RBBelahKetupat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBBelahKetupatActionPerformed(evt);
            }
        });

        RBLingkaran.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        RBLingkaran.setText("Lingkaran");
        RBLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBLingkaranActionPerformed(evt);
            }
        });

        RBJajarGenjang.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        RBJajarGenjang.setText("Jajar Genjang");
        RBJajarGenjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBJajarGenjangActionPerformed(evt);
            }
        });

        RBLayanglayang.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        RBLayanglayang.setText("Layang - layang");
        RBLayanglayang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBLayanglayangActionPerformed(evt);
            }
        });

        RBPersegiPanjang.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        RBPersegiPanjang.setText("Persegi Panjang");
        RBPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBPersegiPanjangActionPerformed(evt);
            }
        });

        RBSegitiga.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        RBSegitiga.setText("Segitiga");
        RBSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBSegitigaActionPerformed(evt);
            }
        });

        RBPersegi.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        RBPersegi.setText("Persegi");
        RBPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBPersegiActionPerformed(evt);
            }
        });

        RBTrapesium.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        RBTrapesium.setText("Trapesium");
        RBTrapesium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTrapesiumActionPerformed(evt);
            }
        });

        BPilih.setBackground(new java.awt.Color(51, 255, 51));
        BPilih.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        BPilih.setText("Pilih");
        BPilih.setEnabled(false);
        BPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPilihActionPerformed(evt);
            }
        });

        PKeluar.setFont(new java.awt.Font("Constantia", 0, 12)); // NOI18N
        PKeluar.setText("Keluar");
        PKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBBelahKetupat)
                            .addComponent(RBJajarGenjang)
                            .addComponent(RBLayanglayang)
                            .addComponent(RBLingkaran))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RBTrapesium)
                            .addComponent(RBSegitiga)
                            .addComponent(RBPersegiPanjang)
                            .addComponent(RBPersegi))))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PKeluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPilih, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BPilih)
                        .addGap(18, 18, 18)
                        .addComponent(PKeluar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RBBelahKetupat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBJajarGenjang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBLayanglayang)
                                .addGap(11, 11, 11)
                                .addComponent(RBLingkaran))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(RBPersegi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBPersegiPanjang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBSegitiga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBTrapesium)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(518, 321));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void PKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_PKeluarActionPerformed

    private void BPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPilihActionPerformed
        // TODO add your handling code here:
        if (RBBelahKetupat.isSelected()) {
            BelahKetupat a = new BelahKetupat();
            a.setVisible(true);
            this.dispose();
        } else if (RBJajarGenjang.isSelected()) {
            JajarGenjang b = new JajarGenjang();
            b.setVisible(true);
            this.dispose();
        } else if (RBLayanglayang.isSelected()) {
            Layanglayang c = new Layanglayang();
            c.setVisible(true);
            this.dispose();
        } else if (RBLingkaran.isSelected()) {
            Lingkaran d = new Lingkaran();
            d.setVisible(true);
            this.dispose();
        } else if (RBPersegi.isSelected()) {
            Persegi e = new Persegi();
            e.setVisible(true);
            this.dispose();
        } else if (RBPersegiPanjang.isSelected()) {
            PersegiPanjang f = new PersegiPanjang();
            f.setVisible(true);
            this.dispose();
        } else if (RBSegitiga.isSelected()) {
            Segitiga g = new Segitiga();
            g.setVisible(true);
            this.dispose();
        } else {
            Trapesium h = new Trapesium();
            h.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BPilihActionPerformed

    private void RBTrapesiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTrapesiumActionPerformed
        // TODO add your handling code here:
        if (RBTrapesium.isSelected()) {
            BPilih.setEnabled(true);
            RBBelahKetupat.setEnabled(false);
            RBJajarGenjang.setEnabled(false);
            RBLayanglayang.setEnabled(false);
            RBLingkaran.setEnabled(false);
            RBPersegiPanjang.setEnabled(false);
            RBSegitiga.setEnabled(false);
            RBPersegi.setEnabled(false);
        } else {
            reset();
            BPilih.setEnabled(false);
        }
    }//GEN-LAST:event_RBTrapesiumActionPerformed

    private void RBPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBPersegiActionPerformed
        // TODO add your handling code here:
        if (RBPersegi.isSelected()) {
            BPilih.setEnabled(true);
            RBBelahKetupat.setEnabled(false);
            RBJajarGenjang.setEnabled(false);
            RBLayanglayang.setEnabled(false);
            RBLingkaran.setEnabled(false);
            RBPersegiPanjang.setEnabled(false);
            RBSegitiga.setEnabled(false);
            RBTrapesium.setEnabled(false);
        } else {
            reset();
            BPilih.setEnabled(false);
        }
    }//GEN-LAST:event_RBPersegiActionPerformed

    private void RBSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBSegitigaActionPerformed
        // TODO add your handling code here:
        if (RBSegitiga.isSelected()) {
            BPilih.setEnabled(true);
            RBBelahKetupat.setEnabled(false);
            RBJajarGenjang.setEnabled(false);
            RBLayanglayang.setEnabled(false);
            RBLingkaran.setEnabled(false);
            RBPersegiPanjang.setEnabled(false);
            RBPersegi.setEnabled(false);
            RBTrapesium.setEnabled(false);
        } else {
            reset();
            BPilih.setEnabled(false);
        }
    }//GEN-LAST:event_RBSegitigaActionPerformed

    private void RBPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBPersegiPanjangActionPerformed
        // TODO add your handling code here:
        if (RBPersegiPanjang.isSelected()) {
            BPilih.setEnabled(true);
            RBBelahKetupat.setEnabled(false);
            RBJajarGenjang.setEnabled(false);
            RBLayanglayang.setEnabled(false);
            RBLingkaran.setEnabled(false);
            RBPersegi.setEnabled(false);
            RBSegitiga.setEnabled(false);
            RBTrapesium.setEnabled(false);
        } else {
            reset();
            BPilih.setEnabled(false);
        }
    }//GEN-LAST:event_RBPersegiPanjangActionPerformed

    private void RBLayanglayangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBLayanglayangActionPerformed
        // TODO add your handling code here:
        if (RBLayanglayang.isSelected()) {
            BPilih.setEnabled(true);
            RBBelahKetupat.setEnabled(false);
            RBJajarGenjang.setEnabled(false);
            RBLingkaran.setEnabled(false);
            RBPersegi.setEnabled(false);
            RBPersegiPanjang.setEnabled(false);
            RBSegitiga.setEnabled(false);
            RBTrapesium.setEnabled(false);
        } else {
            reset();
            BPilih.setEnabled(false);
        }
    }//GEN-LAST:event_RBLayanglayangActionPerformed

    private void RBJajarGenjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBJajarGenjangActionPerformed
        // TODO add your handling code here:
        if (RBJajarGenjang.isSelected()) {
            BPilih.setEnabled(true);
            RBBelahKetupat.setEnabled(false);
            RBLayanglayang.setEnabled(false);
            RBLingkaran.setEnabled(false);
            RBPersegi.setEnabled(false);
            RBPersegiPanjang.setEnabled(false);
            RBSegitiga.setEnabled(false);
            RBTrapesium.setEnabled(false);
        } else {
            reset();
            BPilih.setEnabled(false);
        }
    }//GEN-LAST:event_RBJajarGenjangActionPerformed

    private void RBLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBLingkaranActionPerformed
        // TODO add your handling code here:
        if (RBLingkaran.isSelected()) {
            BPilih.setEnabled(true);
            RBBelahKetupat.setEnabled(false);
            RBJajarGenjang.setEnabled(false);
            RBLayanglayang.setEnabled(false);
            RBPersegi.setEnabled(false);
            RBPersegiPanjang.setEnabled(false);
            RBSegitiga.setEnabled(false);
            RBTrapesium.setEnabled(false);
        } else {
            reset();
            BPilih.setEnabled(false);
        }
    }//GEN-LAST:event_RBLingkaranActionPerformed

    private void RBBelahKetupatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBBelahKetupatActionPerformed
        // TODO add your handling code here:
        if (RBBelahKetupat.isSelected()) {
            BPilih.setEnabled(true);
            RBJajarGenjang.setEnabled(false);
            RBLayanglayang.setEnabled(false);
            RBLingkaran.setEnabled(false);
            RBPersegi.setEnabled(false);
            RBPersegiPanjang.setEnabled(false);
            RBSegitiga.setEnabled(false);
            RBTrapesium.setEnabled(false);
        } else {
            reset();
            BPilih.setEnabled(false);
        }
    }//GEN-LAST:event_RBBelahKetupatActionPerformed

    public void reset() {
        RBBelahKetupat.setSelected(false);
        RBJajarGenjang.setSelected(false);
        RBLayanglayang.setSelected(false);
        RBLingkaran.setSelected(false);
        RBPersegi.setSelected(false);
        RBPersegiPanjang.setSelected(false);
        RBSegitiga.setSelected(false);
        RBTrapesium.setSelected(false);
        
        RBBelahKetupat.setEnabled(true);
        RBJajarGenjang.setEnabled(true);
        RBLayanglayang.setEnabled(true);
        RBLingkaran.setEnabled(true);
        RBTrapesium.setEnabled(true);
        RBPersegiPanjang.setEnabled(true);
        RBSegitiga.setEnabled(true);
        RBPersegi.setEnabled(true);
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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BPilih;
    private javax.swing.JButton PKeluar;
    private javax.swing.JRadioButton RBBelahKetupat;
    private javax.swing.JRadioButton RBJajarGenjang;
    private javax.swing.JRadioButton RBLayanglayang;
    private javax.swing.JRadioButton RBLingkaran;
    private javax.swing.JRadioButton RBPersegi;
    private javax.swing.JRadioButton RBPersegiPanjang;
    private javax.swing.JRadioButton RBSegitiga;
    private javax.swing.JRadioButton RBTrapesium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}