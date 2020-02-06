/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import DBmanage.DBconnPaymentInstallments;
import DBmanage.DBconnProduct;
import DBmanage.DBconnVoucherDetails;
import MainPackeg.PaymentInstallment;
import MainPackeg.ProductInfo;
import MainPackeg.VoucherDetails;
import autocomplete.AutoSuggestor;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author romio-pc
 */
public class FullVoucherShow extends javax.swing.JFrame {

    DBconnVoucherDetails vd=new DBconnVoucherDetails();
    DBconnProduct pro=new DBconnProduct();
    DBconnPaymentInstallments pi=new DBconnPaymentInstallments();
    DefaultTableModel t1;
    DefaultTableModel t2;
    /**
     * Creates new form NewJFrame
     */
    public FullVoucherShow() {
        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        t1 = (DefaultTableModel) tblvd.getModel();
        t2 = (DefaultTableModel) tblInstallment.getModel();
    }
    public FullVoucherShow(String v){
        initComponents();
        t1 = (DefaultTableModel) tblvd.getModel();
        ArrayList<VoucherDetails> list =new ArrayList();
        
        list= vd.fullVoucherDetails(v);
        t1.setRowCount(0);
        for(int i=0;i<list.size();i++){
        String id=String.valueOf(list.get(i).getPid());
        int q=list.get(i).getQuant(); 
        ArrayList<ProductInfo> list2 =new ArrayList();
        list2=pro.searchProductForSale(id);
        String nam=list2.get(0).getPname();
        String cst=list2.get(0).getCost();
        double cost=Double.parseDouble(cst);
        String prof=list2.get(0).getProfit();
        double profit=Double.parseDouble(prof);
        double price=(cost+(cost*(profit/100)));
        double tprice=(q*price);
        Object[] row={id,nam,q,tprice};
        t1.addRow(row);
        }
        t2 = (DefaultTableModel) tblInstallment.getModel();
        ArrayList<PaymentInstallment> list2=new ArrayList();
        list2=pi.installmentDetails(v);
        t2.setRowCount(0);
        for(int i=0;i<list2.size();i++){
        Object[] row={list2.get(i).getInstallmnt_no(),list2.get(i).getPayment(),list2.get(i).getTdate()};
        t2.addRow(row);
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvd = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInstallment = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblvd.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        tblvd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product  ID", "Product Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblvd);
        if (tblvd.getColumnModel().getColumnCount() > 0) {
            tblvd.getColumnModel().getColumn(0).setResizable(false);
            tblvd.getColumnModel().getColumn(1).setResizable(false);
            tblvd.getColumnModel().getColumn(2).setResizable(false);
            tblvd.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 130));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        tblInstallment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Installment No.", "Payment", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInstallment);
        if (tblInstallment.getColumnModel().getColumnCount() > 0) {
            tblInstallment.getColumnModel().getColumn(0).setResizable(false);
            tblInstallment.getColumnModel().getColumn(1).setResizable(false);
            tblInstallment.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 560, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FullVoucherShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FullVoucherShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FullVoucherShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FullVoucherShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FullVoucherShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblInstallment;
    private javax.swing.JTable tblvd;
    // End of variables declaration//GEN-END:variables
}
