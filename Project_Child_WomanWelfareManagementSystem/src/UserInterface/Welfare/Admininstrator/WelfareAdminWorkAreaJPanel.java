/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Welfare.Admininstrator;

import Business.EcoSystem;
import Business.Enterprise.WelfareEnterprise;
import UserInterface.SystemAdmin.ManageNetworkJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class WelfareAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WelfareAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    WelfareEnterprise enterprise;
    public WelfareAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem, WelfareEnterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnOrgManage = new javax.swing.JButton();
        btnEmpManage = new javax.swing.JButton();
        btnUserManage = new javax.swing.JButton();

        jLabel1.setText("Welfare Administrator Work Panel");

        btnOrgManage.setText("Manage Organization");
        btnOrgManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgManageActionPerformed(evt);
            }
        });

        btnEmpManage.setText("Manage Employee");

        btnUserManage.setText("Manage User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnUserManage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmpManage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrgManage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnOrgManage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmpManage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUserManage)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrgManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgManageActionPerformed
        ManageWelfareOrganizationJPanel manageWelfareOrganizationJPanel=new ManageWelfareOrganizationJPanel(userProcessContainer, ecosystem,enterprise);
        userProcessContainer.add("manageWelfareOrganizationJPanel",manageWelfareOrganizationJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrgManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpManage;
    private javax.swing.JButton btnOrgManage;
    private javax.swing.JButton btnUserManage;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}