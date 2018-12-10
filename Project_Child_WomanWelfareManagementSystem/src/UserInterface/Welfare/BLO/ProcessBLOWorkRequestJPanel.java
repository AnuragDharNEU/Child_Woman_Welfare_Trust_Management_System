/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Welfare.BLO;

import Business.Enterprise.EducationEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Network.Network;
import Business.Organization.EducationOrganization;
import Business.Organization.EducationSupervisorOrganization;
import Business.Organization.HospitalDoctorOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.WelfareOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalDoctorWorkRequest;
import Business.WorkQueue.SupervisorWorkRequest;
import Business.WorkQueue.WelfareBLOWorkRequest;
import UserInterface.Education.Supervisor.ManageRequestSuvPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ProcessBLOWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessBLOWorkRequestJPanel
     */
    JPanel userProcessContainer;
    WelfareBLOWorkRequest request;
    WelfareOrganization organization;
    UserAccount userAccount;
    WelfareEnterprise enterprise;
    Network network;
    WelfareBLOWorkRequest bloRequest;
    public ProcessBLOWorkRequestJPanel(JPanel userProcessContainer, WelfareOrganization organization,UserAccount userAccount, WelfareEnterprise enterprise, Network network,WelfareBLOWorkRequest bloRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.organization = organization;
        this.userAccount = userAccount;
        this.enterprise=enterprise;
        this.network = network;
        this.bloRequest=bloRequest;
        PopulateTypeCombo();
    }
    private void PopulateTypeCombo(){
        try{
            ddlAssign.removeAllItems();
            if(bloRequest.getReferTo()!= null && bloRequest.getReferTo().equals("Education")){
                for(EducationEnterprise ed : network.getEnterpriseDirectory().getEducationnterpriseList()){
                    ddlAssign.addItem(ed);
                }
            }
            else if(bloRequest.getReferTo().equals("Hospital")){
                for(HospitalEnterprise ed : network.getEnterpriseDirectory().getHospitalnterpriseList()){
                    ddlAssign.addItem(ed);
                }
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
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

        jLabel1 = new javax.swing.JLabel();
        ddlAssign = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnAssign = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Assign To");

        ddlAssign.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ddlAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlAssignActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Message");

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ddlAssign, 0, 130, Short.MAX_VALUE)
                            .addComponent(txtMessage)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(116, 116, 116)
                        .addComponent(btnAssign)))
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ddlAssign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnBack))
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
            try{
                SupervisorWorkRequest supRequest = new SupervisorWorkRequest();
                HospitalDoctorWorkRequest hosRequest = new HospitalDoctorWorkRequest();
                String message = txtMessage.getText();
                if(!message.trim().isEmpty()){
                    bloRequest.setStatus("Completed");
                    EducationEnterprise selectedEdOrg=null;
                    HospitalEnterprise selectedHosOrg=null;
                    if(ddlAssign.getSelectedItem() instanceof EducationEnterprise){
                        selectedEdOrg = (EducationEnterprise)ddlAssign.getSelectedItem();
                        bloRequest.setTestResult("Sent to "+selectedEdOrg);
                    }
                    if(ddlAssign.getSelectedItem() instanceof HospitalEnterprise){
                        selectedHosOrg = (HospitalEnterprise)ddlAssign.getSelectedItem();
                        bloRequest.setTestResult("Sent to "+selectedHosOrg);
                    }
                    EducationOrganization org = null;
                    if(selectedEdOrg!= null){
                        for (EducationOrganization organization : selectedEdOrg.getEducationOrganizationDirectory().getEducationOrganizationList()){
                            if (organization instanceof EducationSupervisorOrganization){
                                org = organization;
                                break;
                            }
                        }
                        if (org!=null){
                            supRequest.setMessage(message);
                            supRequest.setSender(userAccount);
                            supRequest.setStatus("Sent");
                            org.getWorkQueue().getWorkRequestList().add(supRequest);
                            userAccount.getWorkQueue().getWorkRequestList().add(supRequest);
                            Logger.getInstance().writeLogs("Supervisor Work request created");
                            JOptionPane.showMessageDialog(null, "Supervisor Work request created");
                        }
                    }
                    HospitalOrganization orgHos = null;
                    if(selectedHosOrg!= null){
                        for (HospitalOrganization organization : selectedHosOrg.getHospitalOrganizationDirectory().getHospitalOrganizationList()){
                            if (organization instanceof HospitalDoctorOrganization){
                                orgHos = organization;
                                break;
                            }
                        }
                        if (orgHos!=null){
                            hosRequest.setMessage(message);
                            hosRequest.setSender(userAccount);
                            hosRequest.setStatus("Sent");
                            hosRequest.setPatient(bloRequest.getPatient());
                            orgHos.getWorkQueue().getWorkRequestList().add(hosRequest);
                            userAccount.getWorkQueue().getWorkRequestList().add(hosRequest);
                            Logger.getInstance().writeLogs("Doctor Work request created");
                        }
                    }
                }
                else{
                     JOptionPane.showMessageDialog(null, "Please enter message","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
            }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void ddlAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlAssignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlAssignActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        WelfareBLOWorkRequestJPanel manageReq = (WelfareBLOWorkRequestJPanel) component;
        manageReq.PopulateTable();
        manageReq.PopulateAssignTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox ddlAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
