/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Welfare.BLO;

import Business.EcoSystem;
import Business.Enterprise.WelfareEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Welfare.DLO.WelfareDLOWorkRequestJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class WelfareBLOWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WelfareBLOWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system; 
    WelfareEnterprise enterprise;
    Organization organization;
    UserAccount account;
    public WelfareBLOWorkAreaJPanel(JPanel userProcessContainer,EcoSystem system, WelfareEnterprise enterprise, Organization organization, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system=system;
        this.organization=organization;
        this.account=account;
        lblEntName.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEntName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnManageRequest = new javax.swing.JButton();
        btnFunds = new javax.swing.JButton();
        btnSats = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));

        lblEntName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEntName.setText("Ent Name");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Enterprise");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Block Level Officer Work Area");

        btnManageRequest.setText("Manage Request");
        btnManageRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRequestActionPerformed(evt);
            }
        });

        btnFunds.setText("Manage Funds");
        btnFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFundsActionPerformed(evt);
            }
        });

        btnSats.setText("Statistics");
        btnSats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblEntName))
                    .addComponent(btnFunds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblEntName))
                .addGap(22, 22, 22)
                .addComponent(btnManageRequest)
                .addGap(18, 18, 18)
                .addComponent(btnFunds)
                .addGap(18, 18, 18)
                .addComponent(btnSats)
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRequestActionPerformed
        WelfareBLOWorkRequestJPanel welfareBLOWorkRequestJPanel=new WelfareBLOWorkRequestJPanel(userProcessContainer, enterprise,organization, system, account);
        userProcessContainer.add("welfareBLOWorkRequestJPanel",welfareBLOWorkRequestJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRequestActionPerformed

    private void btnSatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatsActionPerformed
        WelfareBLOManageStatsJPanel welfareBLOManageStatsJPanel=new WelfareBLOManageStatsJPanel(userProcessContainer, enterprise,organization, system, account);
        userProcessContainer.add("welfareBLOManageStatsJPanel",welfareBLOManageStatsJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSatsActionPerformed

    private void btnFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFundsActionPerformed
       WelfareBLOManageFundWorkRequest welfareBLOManageFundWorkRequest=new WelfareBLOManageFundWorkRequest(userProcessContainer, enterprise,organization, system, account);
        userProcessContainer.add("welfareBLOManageFundWorkRequest",welfareBLOManageFundWorkRequest);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFundsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFunds;
    private javax.swing.JButton btnManageRequest;
    private javax.swing.JButton btnSats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEntName;
    // End of variables declaration//GEN-END:variables
}
