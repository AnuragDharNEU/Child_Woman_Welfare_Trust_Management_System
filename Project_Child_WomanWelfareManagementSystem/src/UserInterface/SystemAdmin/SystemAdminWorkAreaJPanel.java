/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Enterprise.EducationEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Network.Network;
import Business.Organization.EducationOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Organization.WelfareOrganization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author user
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populateTree();
    }
    
    // Populate the Tree
    public void populateTree(){
        try{
            DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
            ArrayList<Network> networkList=ecosystem.getNetworkList();
            ArrayList<WelfareEnterprise> welfareEnterpriseList;
            ArrayList<HospitalEnterprise> hospitalEnterpriseList;
            ArrayList<EducationEnterprise> educationEnterpriseList;
            ArrayList<WelfareOrganization> welfareOrganizationList;
            ArrayList<HospitalOrganization> hospitalOrganizationList;
            ArrayList<EducationOrganization> educationOrganizationList;

            Network network;
            WelfareEnterprise welfareEnterprise;
            EducationEnterprise educationEnterprise;
            HospitalEnterprise hospitalEnterprise;
            WelfareOrganization welfareOrganization;
            HospitalOrganization hospitalOrganization;
            EducationOrganization educationOrganization;

            DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
            DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
            root.removeAllChildren();
            root.insert(networks, 0);

            DefaultMutableTreeNode networkNode;
            DefaultMutableTreeNode welfareEnterpriseNode;
            DefaultMutableTreeNode educationEnterpriseNode;
            DefaultMutableTreeNode hospitalEnterpriseNode;
            DefaultMutableTreeNode welfareOrganizationNode;
            DefaultMutableTreeNode educationOrganizationNode;
            DefaultMutableTreeNode hospitalOrganizationNode;

            for(int i=0;i<networkList.size();i++){
                network=networkList.get(i);
                networkNode=new DefaultMutableTreeNode(network.getName());
                networks.insert(networkNode, i);

                welfareEnterpriseList=network.getEnterpriseDirectory().getWelfareEnterpriseList();
                for(int j=0; j<welfareEnterpriseList.size();j++){
                    welfareEnterprise=welfareEnterpriseList.get(j);
                    welfareEnterpriseNode=new DefaultMutableTreeNode(welfareEnterprise.getName());
                    networkNode.insert(welfareEnterpriseNode, j);

                    welfareOrganizationList=welfareEnterprise.getWelfareOrganizationDirectory().getWelfareOrganizationList();
                    for(int a=0;a<welfareOrganizationList.size();a++){
                    welfareOrganization=welfareOrganizationList.get(a);
                    welfareOrganizationNode=new DefaultMutableTreeNode(welfareOrganization.getName());
                    welfareEnterpriseNode.insert(welfareOrganizationNode, a);
                    }
                }
                educationEnterpriseList=network.getEnterpriseDirectory().getEducationnterpriseList();
                for(int k=0; k<educationEnterpriseList.size();k++){
                    educationEnterprise=educationEnterpriseList.get(k);
                    educationEnterpriseNode=new DefaultMutableTreeNode(educationEnterprise.getName());
                    networkNode.insert(educationEnterpriseNode, k);

                    educationOrganizationList=educationEnterprise.getEducationOrganizationDirectory().getEducationOrganizationList();
                    for(int b=0;b<educationOrganizationList.size();b++){
                    educationOrganization=educationOrganizationList.get(b);
                    educationOrganizationNode=new DefaultMutableTreeNode(educationOrganization.getName());
                    educationEnterpriseNode.insert(educationOrganizationNode,b);
                    }
                }
                hospitalEnterpriseList=network.getEnterpriseDirectory().getHospitalnterpriseList();
                for(int m=0; m<hospitalEnterpriseList.size();m++){
                    hospitalEnterprise=hospitalEnterpriseList.get(m);
                    hospitalEnterpriseNode=new DefaultMutableTreeNode(hospitalEnterprise.getName());
                    networkNode.insert(hospitalEnterpriseNode, m);

                    hospitalOrganizationList=hospitalEnterprise.getHospitalOrganizationDirectory().getHospitalOrganizationList();
                    for(int b=0;b<hospitalOrganizationList.size();b++){
                    hospitalOrganization=hospitalOrganizationList.get(b);
                    hospitalOrganizationNode=new DefaultMutableTreeNode(hospitalOrganization.getName());
                    hospitalEnterpriseNode.insert(hospitalOrganizationNode,b);
                    }
                }
            }
            model.reload();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageEnterpriseAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jTree.setBackground(new java.awt.Color(255, 255, 102));
        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmin.setText("Manage Enterprise Admin");
        btnManageEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Selected Node:");

        lblSelectedNode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSelectedNode.setText("<View_selected_node>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEnterpriseAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblSelectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(18, 18, 18)
                .addComponent(btnManageNetwork)
                .addGap(18, 18, 18)
                .addComponent(btnManageEnterprise)
                .addGap(18, 18, 18)
                .addComponent(btnManageEnterpriseAdmin)
                .addGap(92, 92, 92))
        );

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminActionPerformed
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseAdminActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageEnterpriseAdmin;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
