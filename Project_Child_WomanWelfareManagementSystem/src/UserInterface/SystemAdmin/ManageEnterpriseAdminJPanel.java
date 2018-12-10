/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.EducationEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Network.Network;
import Business.Organization.EducationOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.WelfareOrganization;
import Business.Role.EducationAdminRole;
import Business.Role.HospitalAdminRole;
import Business.Role.WelfareAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateNetworkComboBox();
        txtOrgName.setEnabled(false);
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        try{
            model.setRowCount(0);
            for (Network network : system.getNetworkList()) {
                for (WelfareEnterprise enterprise : network.getEnterpriseDirectory().getWelfareEnterpriseList()) {
                    for(WelfareOrganization welOrg : enterprise.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
                        for (UserAccount userAccount : welOrg.getUserAccountDirectory().getUserAccountList()) {
                            Object[] row = new Object[3];
                            row[0] = enterprise.getName();
                            row[1] = network.getName();
                            row[2] = userAccount.getUsername();

                            model.addRow(row);
                        }
                    }
                }
                for (EducationEnterprise enterprise : network.getEnterpriseDirectory().getEducationnterpriseList()) {
                    for(EducationOrganization eduOrg : enterprise.getEducationOrganizationDirectory().getEducationOrganizationList()){
                        for (UserAccount userAccount : eduOrg.getUserAccountDirectory().getUserAccountList()) {
                            Object[] row = new Object[3];
                            row[0] = enterprise.getName();
                            row[1] = network.getName();
                            row[2] = userAccount.getUsername();

                            model.addRow(row);
                        }
                    }
                }
                for (HospitalEnterprise enterprise : network.getEnterpriseDirectory().getHospitalnterpriseList()) {
                    for(HospitalOrganization hosOrg : enterprise.getHospitalOrganizationDirectory().getHospitalOrganizationList()){
                        for (UserAccount userAccount : hosOrg.getUserAccountDirectory().getUserAccountList()) {
                            Object[] row = new Object[3];
                            row[0] = enterprise.getName();
                            row[1] = network.getName();
                            row[2] = userAccount.getUsername();

                            model.addRow(row);
                        }
                    }
                }
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }
    private void populateNetworkComboBox(){
        ddlNetwork.removeAllItems();
        try{
            for (Network network : system.getNetworkList()){
                if(!network.getName().equals("System Administrator"))
                ddlNetwork.addItem(network);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }
    private void populateEnterpriseComboBox(Network network){
        ddlEnterprise.removeAllItems();
        try{
            for (WelfareEnterprise enterprise : network.getEnterpriseDirectory().getWelfareEnterpriseList()){
                ddlEnterprise.addItem(enterprise);
            }
            for (EducationEnterprise enterprise : network.getEnterpriseDirectory().getEducationnterpriseList()){
                ddlEnterprise.addItem(enterprise);
            }
            for (HospitalEnterprise enterprise : network.getEnterpriseDirectory().getHospitalnterpriseList()){
                ddlEnterprise.addItem(enterprise);
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
        jLabel3 = new javax.swing.JLabel();
        ddlEnterprise = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtOrgName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Manage Enterprise Admin");

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "UserName"
            }
        ));
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Network");

        ddlNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ddlNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlNetworkActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Enterprise");

        ddlEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ddlEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlEnterpriseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("User Name");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Name");

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

        txtOrgName.setText("Admin Organization");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Organization Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSubmit)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtOrgName, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(txtName)
                                .addComponent(txtPassword))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(ddlNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ddlEnterprise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ddlNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ddlEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSubmit))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ddlNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlNetworkActionPerformed
        try{
            Network network = (Network) ddlNetwork.getSelectedItem();
            if (network != null){
                populateEnterpriseComboBox(network);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }//GEN-LAST:event_ddlNetworkActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try{
            if(ddlEnterprise.getSelectedItem() instanceof WelfareEnterprise){
                createUser((WelfareEnterprise) ddlEnterprise.getSelectedItem());
            }
            if(ddlEnterprise.getSelectedItem() instanceof EducationEnterprise){
                createUser((EducationEnterprise) ddlEnterprise.getSelectedItem());
            }
            if(ddlEnterprise.getSelectedItem() instanceof HospitalEnterprise){
                createUser((HospitalEnterprise) ddlEnterprise.getSelectedItem());
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

    private void ddlEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddlEnterpriseActionPerformed
    private void createUser(WelfareEnterprise enterprise){
        try{
            String username = txtUserName.getText();
            String password = String.valueOf(txtPassword.getPassword());
            String name = txtName.getText();
            if(!username.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty()){
                if(system.checkIfUserIsUnique(username)){
                WelfareOrganization wel = enterprise.getWelfareOrganizationDirectory().createWelfareOrganization(txtOrgName.getText());
                Employee employee = wel.getEmployeeDirectory().createEmployee(name);
                UserAccount account = wel.getUserAccountDirectory().createUserAccount(username, password, employee, new WelfareAdminRole());
                Logger.getInstance().writeLogs("User Created for"+ddlEnterprise.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "User Created for"+ddlEnterprise.getSelectedItem().toString());
                populateTable();
                }
                else{
                 JOptionPane.showMessageDialog(null, "userName already taken. Please change.","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
            else{
                 JOptionPane.showMessageDialog(null, "Please enter all the values","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }
    private void createUser(EducationEnterprise enterprise){
        try{
            String username = txtUserName.getText();
            String password = String.valueOf(txtPassword.getPassword());
            String name = txtName.getText();
            if(!username.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty()){
                if(system.checkIfUserIsUnique(username)){
                EducationOrganization ed = enterprise.getEducationOrganizationDirectory().createEducationOrganization(txtOrgName.getText());
                Employee employee = ed.getEmployeeDirectory().createEmployee(name);

                UserAccount account = ed.getUserAccountDirectory().createUserAccount(username, password, employee, new EducationAdminRole());
                Logger.getInstance().writeLogs("User Created "+ddlEnterprise.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "User Created "+ddlEnterprise.getSelectedItem().toString());
                populateTable();
                }
                else{
                 JOptionPane.showMessageDialog(null, "userName already taken. Please change.","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
            else{
                 JOptionPane.showMessageDialog(null, "Please enter all the values","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }
    private void createUser(HospitalEnterprise enterprise){
        try{
            String username = txtUserName.getText();
            String password = String.valueOf(txtPassword.getPassword());
            String name = txtName.getText();
            if(!username.trim().isEmpty() && !password.trim().isEmpty() && !name.trim().isEmpty()){
                if(system.checkIfUserIsUnique(username)){
                HospitalOrganization hos = enterprise.getHospitalOrganizationDirectory().createHospitalOrganization(txtOrgName.getText());
                Employee employee = hos.getEmployeeDirectory().createEmployee(name);

                UserAccount account = hos.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
                Logger.getInstance().writeLogs("User Created "+ddlEnterprise.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "User Created "+ddlEnterprise.getSelectedItem().toString());
                populateTable();
                }
                else{
                 JOptionPane.showMessageDialog(null, "userName already taken. Please change.","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
            else{
                 JOptionPane.showMessageDialog(null, "Please enter all the values","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox ddlEnterprise;
    private javax.swing.JComboBox ddlNetwork;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
