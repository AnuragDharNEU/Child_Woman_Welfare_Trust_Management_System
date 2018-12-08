/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Education.Supervisor;

import Business.EcoSystem;
import Business.Enterprise.EducationEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Network.Network;
import Business.Organization.EducationSupervisorOrganization;
import Business.Organization.Organization;
import Business.Organization.WelfareBLOOrganization;
import Business.Organization.WelfareOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SupervisorWorkRequest;
import Business.WorkQueue.WelfareBLOWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author souma
 */
    public class SupFundProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupFundProcessJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EducationEnterprise enterprise;
    private EcoSystem system;
    private Organization organization;
    private SupervisorWorkRequest request;
    Network network;
    public SupFundProcessJPanel(JPanel userProcessContainer, EcoSystem system, EducationEnterprise enterprise, UserAccount account,Organization organization,SupervisorWorkRequest request  ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=account;
        this.enterprise=enterprise;
        this.system=system;
        this.organization=organization;
        this.request=request;
        this.network = GetNetwork();
    }

  private Network GetNetwork(){
        Network thisNetwork = null;
        for(Network net: system.getNetworkList()){
            for(EducationEnterprise ed : net.getEnterpriseDirectory().getEducationnterpriseList()){
                if(enterprise.equals(ed)){
                    thisNetwork= net;
                }
            }
        }
        return thisNetwork;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFundRes = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();

        jLabel1.setText("Result:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Message:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSubmit))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFundRes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFundRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnBack))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFundSuvPanel manageFund = (ManageFundSuvPanel) component;
        manageFund.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    request.setResult(txtFundRes.getText());
    request.setStatus("Completed");  
    
    
     String message = txtMessage.getText();
     WelfareBLOWorkRequest reqBLO= new WelfareBLOWorkRequest();
     
     //WelfareEnterprise en=null;
     WelfareOrganization org=null;
     for(WelfareEnterprise en : network.getEnterpriseDirectory().getWelfareEnterpriseList()){
     for(WelfareOrganization organization : en.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
      
         if (organization instanceof WelfareBLOOrganization){
                org = organization;
                break;
                }
        }
     } 
         
        if (org!=null){
            reqBLO.setMessage(message);
            reqBLO.setSender(userAccount);
            reqBLO.setStatus("Sent");
            org.getWorkQueue().getWorkRequestList().add(reqBLO);
            userAccount.getWorkQueue().getWorkRequestList().add(reqBLO);
        
         
     }
       
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFundRes;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
