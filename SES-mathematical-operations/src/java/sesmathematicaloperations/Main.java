/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesmathematicaloperations;

import java.util.ArrayList;
import java.util.Arrays;
import javax.ejb.EJB;
import org.apache.jasper.tagplugins.jstl.ForEach;
import pt.up.feup.mesw.ses.MathematicalOperationsSessionBeanRemote;

/**
 *
 * @author Daniela
 */
public class Main extends javax.swing.JFrame {

    @EJB
    private static MathematicalOperationsSessionBeanRemote mathematicalOperationsSessionBean;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xInput = new javax.swing.JTextField();
        yInput = new javax.swing.JTextField();
        sqrRootBtn = new javax.swing.JButton();
        cubicRootBtn = new javax.swing.JButton();
        logarithmBtn = new javax.swing.JButton();
        powerBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        history = new javax.swing.JTextArea();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xInputActionPerformed(evt);
            }
        });

        sqrRootBtn.setText("Square root");
        sqrRootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrRootBtnActionPerformed(evt);
            }
        });

        cubicRootBtn.setText("Cubic root");
        cubicRootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubicRootBtnActionPerformed(evt);
            }
        });

        logarithmBtn.setText("Logarithm");
        logarithmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarithmBtnActionPerformed(evt);
            }
        });

        powerBtn.setText("Power");
        powerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerBtnActionPerformed(evt);
            }
        });

        history.setColumns(20);
        history.setRows(5);
        jScrollPane1.setViewportView(history);

        resultLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sqrRootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logarithmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xInput))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yInput)
                            .addComponent(powerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cubicRootBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sqrRootBtn)
                    .addComponent(cubicRootBtn))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logarithmBtn)
                    .addComponent(powerBtn))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xInputActionPerformed

    private void sqrRootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrRootBtnActionPerformed
        if (xInput.getText() == null || xInput.getText().length() == 0 || this.formatNumber(xInput.getText()) == null) {
            return;
        }
        double first_operator = Double.parseDouble(xInput.getText());
        xInput.setText("\u221A" + Double.toString(first_operator));
        xInput.setText("");
        try {
            double result = mathematicalOperationsSessionBean.squareRoot(first_operator);
            resultLabel.setText(Double.toString(result));
            xInput.setText(Double.toString(result));
            mathematicalOperationsSessionBean.saveToHistory(String.valueOf(first_operator), null, "square root");
            writeToHistoryPane();
        } catch (Exception ex) {
            resultLabel.setText("Error! " + Arrays.toString(ex.getStackTrace()));
        }
    }//GEN-LAST:event_sqrRootBtnActionPerformed

    private void cubicRootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubicRootBtnActionPerformed
        if (xInput.getText() == null || xInput.getText().length() == 0 || this.formatNumber(xInput.getText()) == null) {
            return;
        }
        double first_operator = Double.parseDouble(xInput.getText());
        xInput.setText("\u221A" + Double.toString(first_operator));
        xInput.setText("");
        try {
            double result = mathematicalOperationsSessionBean.cubicRoot(first_operator);
            resultLabel.setText(Double.toString(result));
            xInput.setText(Double.toString(result));
        } catch (Exception ex) {
            resultLabel.setText("Error! " + Arrays.toString(ex.getStackTrace()));
        }
    }//GEN-LAST:event_cubicRootBtnActionPerformed

    private void logarithmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarithmBtnActionPerformed
        if (xInput.getText() == null || xInput.getText().length() == 0 || this.formatNumber(xInput.getText()) == null
                || yInput.getText() == null || yInput.getText().length() == 0 || this.formatNumber(yInput.getText()) == null) {
            return;
        }
        double base = Double.parseDouble(xInput.getText());
        double value = Double.parseDouble(yInput.getText());

        xInput.setText("\u221A" + Double.toString(base));
        xInput.setText("");

        yInput.setText("\u221A" + Double.toString(base));
        yInput.setText("");
        try {
            double result = mathematicalOperationsSessionBean.logarithmGivenBase(base, value);
            resultLabel.setText(Double.toString(result));
            xInput.setText(Double.toString(result));
        } catch (Exception ex) {
            resultLabel.setText("Error! " + Arrays.toString(ex.getStackTrace()));
        }
    }//GEN-LAST:event_logarithmBtnActionPerformed

    private void powerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerBtnActionPerformed
        if (xInput.getText() == null || xInput.getText().length() == 0 || this.formatNumber(xInput.getText()) == null
                || yInput.getText() == null || yInput.getText().length() == 0 || this.formatNumber(yInput.getText()) == null) {
            return;
        }
        double base = Double.parseDouble(xInput.getText());
        double exponent = Double.parseDouble(yInput.getText());

        xInput.setText("\u221A" + Double.toString(base));
        xInput.setText("");

        yInput.setText("\u221A" + Double.toString(base));
        yInput.setText("");
        try {
            double result = mathematicalOperationsSessionBean.powerExponent(base, exponent);
            resultLabel.setText(Double.toString(result));
            xInput.setText(Double.toString(result));
        } catch (Exception ex) {
            resultLabel.setText("Error! " + Arrays.toString(ex.getStackTrace()));
        }
    }//GEN-LAST:event_powerBtnActionPerformed

    private String formatNumber(String text) {

        for (char c : text.toCharArray()) {
            if (!((c >= '0') && (c <= '9'))) {
                return "";
            } else {
                return text;
            }
        }
        return "";
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cubicRootBtn;
    private javax.swing.JTextArea history;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logarithmBtn;
    private javax.swing.JButton powerBtn;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton sqrRootBtn;
    private javax.swing.JTextField xInput;
    private javax.swing.JTextField yInput;
    // End of variables declaration//GEN-END:variables

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //System.out.println("mathematicalOperationsEJB "+ mathematicalOperationsEJB);
        //System.err.println("result = " + mathematicalOperationsEJB.cubicRoot(2));
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void writeToHistoryPane() {
        ArrayList<String> operationHistory = mathematicalOperationsSessionBean.getHistory();
        history.setText("");
        String operations = "";
        for (String operation : operationHistory) {
            operations.concat(operation + "\n");
        }
        history.setText(operations);
    }

}
