/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import DBmanage.DBconnUser;
import javax.swing.JOptionPane;

/**
 *
 * @author romio-pc
 */
public class PassChanger extends javax.swing.JFrame {
    DBconnUser ox=new DBconnUser();
    boolean b=false;
    /**
     * Creates new form PassChanger
     */
    public PassChanger() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tbxnwpss = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        btnLogIn = new javax.swing.JButton();
        lvlmessage1 = new javax.swing.JLabel();
        lvlmessage = new javax.swing.JLabel();
        tbxPASS = new javax.swing.JTextField();
        tbxUN = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnback = new javax.swing.JButton();
        btnback1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 69, 22));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("New Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 110, 22));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 69, 22));

        tbxnwpss.setBackground(new java.awt.Color(0, 102, 102));
        tbxnwpss.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tbxnwpss.setBorder(null);
        tbxnwpss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxnwpssActionPerformed(evt);
            }
        });
        jPanel1.add(tbxnwpss, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 210, -1));

        btnsubmit.setBackground(new java.awt.Color(0, 153, 153));
        btnsubmit.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("Submit");
        btnsubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsubmitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnsubmitMouseReleased(evt);
            }
        });
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 380, -1, -1));

        btnLogIn.setBackground(new java.awt.Color(0, 153, 153));
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Check");
        btnLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogInMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogInMouseReleased(evt);
            }
        });
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, -1, -1));

        lvlmessage1.setBackground(new java.awt.Color(255, 255, 255));
        lvlmessage1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lvlmessage1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lvlmessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 353, 18));

        lvlmessage.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lvlmessage.setForeground(new java.awt.Color(255, 153, 153));
        jPanel1.add(lvlmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 261, 18));

        tbxPASS.setBackground(new java.awt.Color(0, 102, 102));
        tbxPASS.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tbxPASS.setForeground(new java.awt.Color(255, 255, 255));
        tbxPASS.setBorder(null);
        tbxPASS.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tbxPASS, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 220, -1));

        tbxUN.setBackground(new java.awt.Color(0, 102, 102));
        tbxUN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tbxUN.setForeground(new java.awt.Color(255, 255, 255));
        tbxUN.setBorder(null);
        tbxUN.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tbxUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 220, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 220, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 220, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 220, 10));

        btnback.setBackground(new java.awt.Color(0, 153, 153));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnbackMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnbackMouseReleased(evt);
            }
        });
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        btnback1.setBackground(new java.awt.Color(0, 153, 153));
        btnback1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnback1.setForeground(new java.awt.Color(255, 255, 255));
        btnback1.setText("Exit");
        btnback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnback1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnback1MouseReleased(evt);
            }
        });
        btnback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnback1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 470, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 20, 230));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password Chenger");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 220, 50));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 330, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PrintAndDesign/LOGOHeader2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 270, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMouseReleased
        String pass= tbxPASS.getText();
        //DBconn lgn= new DBconn();
        ox.checkLogIn(tbxUN.getText(), pass);
        if(ox.visualCheck==false){
        lvlmessage.setText("Invalid Username or Password !");
        lvlmessage1.setText("");
        }
        else
        {
            b=true;
        lvlmessage.setText("");
        lvlmessage1.setText("Successfully Matched!"+"\n"+" Now type your new password below:");
        }
    }//GEN-LAST:event_btnLogInMouseReleased

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed

    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnLogInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogInMousePressed
        
    }//GEN-LAST:event_btnLogInMousePressed

    private void btnsubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsubmitMousePressed
        
    }//GEN-LAST:event_btnsubmitMousePressed

    private void btnsubmitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsubmitMouseReleased
        if(tbxnwpss.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Input a New Password !", "Try Again", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        if(b==true)
        {
            ox.updatePass(tbxnwpss.getText(), tbxUN.getText());
            JOptionPane.showMessageDialog(this, "Successfully Changed !", "Done !", JOptionPane.INFORMATION_MESSAGE);
            tbxUN.setText("");
            tbxPASS.setText("");
            tbxnwpss.setText("");
            lvlmessage.setText("");
            lvlmessage1.setText("");
        }
        else if(b==false){
        JOptionPane.showMessageDialog(this, "Something is wrong! try again", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btnsubmitMouseReleased

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void tbxnwpssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxnwpssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxnwpssActionPerformed

    private void btnbackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackMousePressed

    private void btnbackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackMouseReleased

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new Main_LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnback1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnback1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnback1MousePressed

    private void btnback1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnback1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnback1MouseReleased

    private void btnback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnback1ActionPerformed

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
            java.util.logging.Logger.getLogger(PassChanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassChanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassChanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassChanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassChanger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnback1;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lvlmessage;
    private javax.swing.JLabel lvlmessage1;
    private javax.swing.JTextField tbxPASS;
    private javax.swing.JTextField tbxUN;
    private javax.swing.JTextField tbxnwpss;
    // End of variables declaration//GEN-END:variables
}
