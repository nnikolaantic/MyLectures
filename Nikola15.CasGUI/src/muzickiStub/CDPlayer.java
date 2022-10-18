/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muzickiStub;

import javax.swing.JPanel;

/**
 *
 * @author Anta
 */
public class CDPlayer extends javax.swing.JFrame {

    /**
     * Creates new form CDPlayer
     */
    JPanel[] jp = new JPanel[5];
    int volume = 2;
    int trenutnaPesma = 1;
    
    public CDPlayer() {
        initComponents();
        setLocationRelativeTo(null);
        
        jp[0] = volume1;
        jp[1] = volume2;
        jp[2] = volume3;
        jp[3] = volume4;
        jp[4] = volume5;

        volume4.setVisible(false);
        volume5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        volume5 = new javax.swing.JPanel();
        volume1 = new javax.swing.JPanel();
        volume2 = new javax.swing.JPanel();
        volume3 = new javax.swing.JPanel();
        volume4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonPustiPesmu = new javax.swing.JButton();
        jLabelTrenutnaPesma = new javax.swing.JLabel();
        jButtonNarednaPesma = new javax.swing.JButton();
        jButtonPrethodnaPesma = new javax.swing.JButton();
        jButtonPrekiniPesmu = new javax.swing.JButton();

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("CD Player");

        jButton1.setText("< -- Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        volume5.setBackground(new java.awt.Color(255, 51, 153));
        volume5.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout volume5Layout = new javax.swing.GroupLayout(volume5);
        volume5.setLayout(volume5Layout);
        volume5Layout.setHorizontalGroup(
            volume5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        volume5Layout.setVerticalGroup(
            volume5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        volume1.setBackground(new java.awt.Color(255, 51, 153));
        volume1.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout volume1Layout = new javax.swing.GroupLayout(volume1);
        volume1.setLayout(volume1Layout);
        volume1Layout.setHorizontalGroup(
            volume1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        volume1Layout.setVerticalGroup(
            volume1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        volume2.setBackground(new java.awt.Color(255, 51, 153));
        volume2.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout volume2Layout = new javax.swing.GroupLayout(volume2);
        volume2.setLayout(volume2Layout);
        volume2Layout.setHorizontalGroup(
            volume2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        volume2Layout.setVerticalGroup(
            volume2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        volume3.setBackground(new java.awt.Color(255, 51, 153));
        volume3.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout volume3Layout = new javax.swing.GroupLayout(volume3);
        volume3.setLayout(volume3Layout);
        volume3Layout.setHorizontalGroup(
            volume3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        volume3Layout.setVerticalGroup(
            volume3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        volume4.setBackground(new java.awt.Color(255, 51, 153));
        volume4.setForeground(new java.awt.Color(255, 0, 102));

        javax.swing.GroupLayout volume4Layout = new javax.swing.GroupLayout(volume4);
        volume4.setLayout(volume4Layout);
        volume4Layout.setHorizontalGroup(
            volume4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        volume4Layout.setVerticalGroup(
            volume4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Volume");

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonPustiPesmu.setText("Pusti pesmu");
        jButtonPustiPesmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPustiPesmuActionPerformed(evt);
            }
        });

        jLabelTrenutnaPesma.setBackground(new java.awt.Color(255, 51, 102));
        jLabelTrenutnaPesma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelTrenutnaPesma.setForeground(new java.awt.Color(0, 153, 204));
        jLabelTrenutnaPesma.setText("---------------");

        jButtonNarednaPesma.setText("Sledeca Pesma");
        jButtonNarednaPesma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNarednaPesmaActionPerformed(evt);
            }
        });

        jButtonPrethodnaPesma.setText("Prethodna Pesma");
        jButtonPrethodnaPesma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrethodnaPesmaActionPerformed(evt);
            }
        });

        jButtonPrekiniPesmu.setText("Prekini Pesmu");
        jButtonPrekiniPesmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrekiniPesmuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(volume1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(178, 178, 178))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(volume2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(volume3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(volume4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(volume5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTrenutnaPesma, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPustiPesmu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPrethodnaPesma))
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNarednaPesma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPrekiniPesmu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(volume1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(volume2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(volume3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(volume4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volume5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPustiPesmu)
                    .addComponent(jButtonPrekiniPesmu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNarednaPesma)
                    .addComponent(jButtonPrethodnaPesma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTrenutnaPesma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MuzickiStub ms = new MuzickiStub();
        ms.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println("+");
        if(volume < 4){
            volume++;
            for (int i = 0 ; i <= volume; i++) {
                jp[i].setVisible(true);
            }
        }else{
            System.out.println("Pojacano je do kraja");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.out.println("-");
        if(volume > 0){
            for (int i = 4 ; i >= volume; i--) {
                jp[i].setVisible(false);
            }
            volume--;
        }else{
            System.out.println("Utisano je do kraja");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonPustiPesmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPustiPesmuActionPerformed
        System.out.println("Pustam pesmu");
        jLabelTrenutnaPesma.setText("Pesma " + trenutnaPesma);
    }//GEN-LAST:event_jButtonPustiPesmuActionPerformed

    private void jButtonPrethodnaPesmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrethodnaPesmaActionPerformed
        if(trenutnaPesma > 1){
            trenutnaPesma--;
            jLabelTrenutnaPesma.setText("Pesma " + trenutnaPesma);
        }else{
            trenutnaPesma = 40;
            jLabelTrenutnaPesma.setText("Pesma " + trenutnaPesma);
        }
    }//GEN-LAST:event_jButtonPrethodnaPesmaActionPerformed

    private void jButtonNarednaPesmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNarednaPesmaActionPerformed
        if(trenutnaPesma < 40){
            trenutnaPesma++;
            jLabelTrenutnaPesma.setText("Pesma " + trenutnaPesma);
        }else{
            trenutnaPesma = 1;
            jLabelTrenutnaPesma.setText("Pesma " + trenutnaPesma);
        }
    }//GEN-LAST:event_jButtonNarednaPesmaActionPerformed

    private void jButtonPrekiniPesmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrekiniPesmuActionPerformed
        jLabelTrenutnaPesma.setText("----------------------------");
    }//GEN-LAST:event_jButtonPrekiniPesmuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonNarednaPesma;
    private javax.swing.JButton jButtonPrekiniPesmu;
    private javax.swing.JButton jButtonPrethodnaPesma;
    private javax.swing.JButton jButtonPustiPesmu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTrenutnaPesma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel volume1;
    private javax.swing.JPanel volume2;
    private javax.swing.JPanel volume3;
    private javax.swing.JPanel volume4;
    private javax.swing.JPanel volume5;
    // End of variables declaration//GEN-END:variables
}
