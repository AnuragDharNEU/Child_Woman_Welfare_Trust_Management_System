/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Enterprise.EducationEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateComboBox();
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        try{
            model.setRowCount(0);
            for (Network network : system.getNetworkList()) {
                if(!network.getName().equals("System Administrator")){
                    for (WelfareEnterprise enterprise : network.getEnterpriseDirectory().getWelfareEnterpriseList()) {
                        Object[] row = new Object[3];
                        row[0] = enterprise.getName();
                        row[1] = network.getName();
                        row[2] = enterprise.getEnterpriseType().getValue();
                        model.addRow(row);
                    }
                    for (EducationEnterprise enterprise : network.getEnterpriseDirectory().getEducationnterpriseList()) {
                        Object[] row = new Object[3];
                        row[0] = enterprise.getName();
                        row[1] = network.getName();
                        row[2] = enterprise.getEnterpriseType().getValue();
                        model.addRow(row);
                    }
                    for (HospitalEnterprise enterprise : network.getEnterpriseDirectory().getHospitalnterpriseList()) {
                        Object[] row = new Object[3];
                        row[0] = enterprise.getName();
                        row[1] = network.getName();
                        row[2] = enterprise.getEnterpriseType().getValue();
                        model.addRow(row);
                    }
                }
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }
    private void populateComboBox() {
        ddlNetwork.removeAllItems();
        ddlType.removeAllItems();
        try{
            for (Network network : system.getNetworkList()) {
                if(!network.getName().equals("System Administrator")){
                    ddlNetwork.addItem(network);
                }
            }

            for (WelfareEnterprise.EnterpriseType type : WelfareEnterprise.EnterpriseType.values()) {
                ddlType.addItem(type);
            }
            for (EducationEnterprise.EnterpriseType type : EducationEnterprise.EnterpriseType.values()) {
                ddlType.addItem(type);
            }
            for (HospitalEnterprise.EnterpriseType type : HospitalEnterprise.EnterpriseType.values()) {
                ddlType.addItem(type);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ddlNetwork = new javax.swing.JComboBox();
        ddlType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Manage Enterprise");

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise", "Network", "Type"
            }
        ));
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Network");

        ddlNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ddlType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ddlType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlTypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Enterprise Type");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Enterprise Name");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(93, 93, 93)
                                .addComponent(btnSubmit)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ddlType, 0, 111, Short.MAX_VALUE)
                                        .addComponent(ddlNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ddlNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ddlType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSubmit))
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try{
            Network network = (Network) ddlNetwork.getSelectedItem();
            String type = ddlType.getSelectedItem().toString();

            if (network == null || type == null) {
                JOptionPane.showMessageDialog(null, "Invalid Input!");
                return;
            }

            String name = txtName.getText();
            if(!name.trim().isEmpty()){
                if(type.equals(WelfareEnterprise.EnterpriseType.Welfare.getValue())){
                network.getEnterpriseDirectory().createAndAddWelfareEnterprise(name, type);
                }
                if(type.equals(EducationEnterprise.EnterpriseType.Education.getValue())){
                network.getEnterpriseDirectory().createAndAddEducationEnterprise(name, type);
                }
                if(type.equals(HospitalEnterprise.EnterpriseType.Hospital.getValue())){
                network.getEnterpriseDirectory().createAndAddHospitalEnterprise(name, type);
                }
                Logger.getInstance().writeLogs("Enterprise created "+name + " Type "+type);
                JOptionPane.showMessageDialog(null, "Enterprise created "+name + " Type "+type);
                populateTable();
            }
            else{
                 JOptionPane.showMessageDialog(null, "Please enter a enterprise name","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ddlTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox ddlNetwork;
    private javax.swing.JComboBox ddlType;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
