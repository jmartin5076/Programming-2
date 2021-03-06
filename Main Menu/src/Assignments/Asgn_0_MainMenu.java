/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author Dave
 */
public class Asgn_0_MainMenu extends javax.swing.JFrame {

  /**
   * Creates new form MainMenu
   */
  public Asgn_0_MainMenu() {
    initComponents();
    this.setLocationRelativeTo(null); // center JFrame on screen;
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
        btn_1_NumberAddition = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        m_btnHelloWorld = new javax.swing.JButton();
        m_btnTipCalc = new javax.swing.JButton();
        m_btnWorldClock = new javax.swing.JButton();
        m_btnCardCollector = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programming 2 - Main Menu");

        btn_1_NumberAddition.setText("1 - Number Addition");
        btn_1_NumberAddition.setToolTipText("Assignment 1 - Number Addition");
        btn_1_NumberAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1_NumberAdditionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Select an Assignment to view.");

        m_btnHelloWorld.setText("3 - Hello, World!");
        m_btnHelloWorld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_btnHelloWorldActionPerformed(evt);
            }
        });

        m_btnTipCalc.setText("7 - Tip Calculator");
        m_btnTipCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_btnTipCalcActionPerformed(evt);
            }
        });

        m_btnWorldClock.setText("10 - World Clock");
        m_btnWorldClock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_btnWorldClockActionPerformed(evt);
            }
        });

        m_btnCardCollector.setText("11 - Card Collector");
        m_btnCardCollector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_btnCardCollectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(m_btnWorldClock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m_btnTipCalc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m_btnHelloWorld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_1_NumberAddition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addComponent(m_btnCardCollector, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1_NumberAddition)
                    .addComponent(m_btnCardCollector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_btnHelloWorld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_btnTipCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m_btnWorldClock)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btn_1_NumberAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1_NumberAdditionActionPerformed
    NumberAdditionUI naf = new NumberAdditionUI();
    naf.setLocationRelativeTo(null);
    naf.setVisible(true);
  }//GEN-LAST:event_btn_1_NumberAdditionActionPerformed

    private void m_btnHelloWorldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_btnHelloWorldActionPerformed
    Asgn_3_Hello_world hwf = new Asgn_3_Hello_world();
    hwf.setLocationRelativeTo(null);
    hwf.setVisible(true);
    }//GEN-LAST:event_m_btnHelloWorldActionPerformed

    private void m_btnTipCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_btnTipCalcActionPerformed
        TipCalculatorUI tcf = new TipCalculatorUI();
        tcf.setLocationRelativeTo(null);
        tcf.setVisible(true);
    }//GEN-LAST:event_m_btnTipCalcActionPerformed

    private void m_btnWorldClockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_btnWorldClockActionPerformed
        Asgn_10_WorldClock wcf = new Asgn_10_WorldClock();
        wcf.setLocationRelativeTo(null);
        wcf.setVisible(true);
    }//GEN-LAST:event_m_btnWorldClockActionPerformed

    private void m_btnCardCollectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_btnCardCollectorActionPerformed
        CardCollectorUI ccf = new CardCollectorUI();
        ccf.setLocationRelativeTo(null);
        ccf.setVisible(true);
    }//GEN-LAST:event_m_btnCardCollectorActionPerformed

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
      java.util.logging.Logger.getLogger(Asgn_0_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Asgn_0_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Asgn_0_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Asgn_0_MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Asgn_0_MainMenu().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1_NumberAddition;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton m_btnCardCollector;
    private javax.swing.JButton m_btnHelloWorld;
    private javax.swing.JButton m_btnTipCalc;
    private javax.swing.JButton m_btnWorldClock;
    // End of variables declaration//GEN-END:variables
}
