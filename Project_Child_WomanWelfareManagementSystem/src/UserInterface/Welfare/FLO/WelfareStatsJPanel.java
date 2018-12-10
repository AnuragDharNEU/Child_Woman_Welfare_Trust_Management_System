/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Welfare.FLO;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WelfareCentre.WelfareCentre;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author user
 */
public class WelfareStatsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WelfareStatsJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system; 
    WelfareEnterprise enterprise;
    Organization organization;
    UserAccount account;
    Network network;
    ArrayList<Patient> patients;
    ArrayList<Patient> patientsUnderMe;
    public WelfareStatsJPanel(JPanel userProcessContainer, WelfareEnterprise enterprise, Organization organization,EcoSystem system, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system=system;
        this.organization=organization;
        this.account= account;
        network = GetNetwork();
        patients = GetPatients();
        patientsUnderMe= GetPatientsUnderMe();
    }
    private Network GetNetwork(){
        Network thisNetwork = null;
        for(Network net: system.getNetworkList()){
            for(WelfareEnterprise wel : net.getEnterpriseDirectory().getWelfareEnterpriseList()){
                if(enterprise.equals(wel)){
                    thisNetwork= net;
                }
            }
        }
        return thisNetwork;
    }
    private ArrayList<Patient> GetPatients(){
            ArrayList<Patient> pat = null;
        try{
            for(WelfareCentre centre : network.getCentreDir().getWelfareCentreList()){
                for (Employee emp : centre.getEmployeeList()){
                    if(account.getEmployee().getId()==(emp.getId())){
                       pat = centre.getPatientList();
                    }
                }
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
            return pat;
    }
    private ArrayList<Patient> GetPatientsUnderMe(){
        ArrayList<Patient> pat = null;
        ArrayList<Patient> patUnderMe = new ArrayList<Patient>();
        try{
            for(WelfareCentre centre : network.getCentreDir().getWelfareCentreList()){
                for (Employee emp : centre.getEmployeeList()){
                    if(account.getEmployee().getId()==(emp.getId())){
                       pat = centre.getPatientList();
                    }
                }
            }
            if(pat!= null){
                for(Patient p : pat){
                    if(p.getFieldOfficer() != null && p.getFieldOfficer().getEmployee().getId()==account.getEmployee().getId()){
                        patUnderMe.add(p);
                    }
                }
            }
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
        return patUnderMe;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStats = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));

        btnStats.setText(" Stats Patient in Centre");
        btnStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatsActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton1.setText("Stats Patient Under Me");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnStats)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(114, 114, 114))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatsActionPerformed
        try{
            DefaultPieDataset pieDataSet = new DefaultKeyedValuesDataset();
            int child=0, women=0;
            for(Patient pat :patients){
                if(pat.getAge()<=6)
                    child++; 
                else
                    women++;
            }
            pieDataSet.setValue("Child",child);
            pieDataSet.setValue("Women",women);
            JFreeChart chart  = ChartFactory.createPieChart("Pie Chart", pieDataSet,true, true, true);
            PiePlot p = (PiePlot)chart.getPlot();
            ChartFrame frame = new ChartFrame("Pie Chart", chart);
            frame.setVisible(true);
            frame.setSize(450,500);
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }//GEN-LAST:event_btnStatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            DefaultPieDataset pieDataSet = new DefaultKeyedValuesDataset();
            int child=0, women=0;
            for(Patient pat :patientsUnderMe){
                if(pat.getAge()<=6)
                    child++; 
                else
                    women++;
            }
            pieDataSet.setValue("Child",child);
            pieDataSet.setValue("Women",women);
            JFreeChart chart  = ChartFactory.createPieChart("Pie Chart", pieDataSet,true, true, true);
            PiePlot p = (PiePlot)chart.getPlot();
            ChartFrame frame = new ChartFrame("Pie Chart", chart);
            frame.setVisible(true);
            frame.setSize(450,500);
            ChartPanel chartPanel = new ChartPanel(chart);
            frame.add(chartPanel);
            frame.validate();

            chartPanel.addChartMouseListener(new ChartMouseListener() {

            @Override
            public void chartMouseClicked(ChartMouseEvent event) {
                ChartEntity entity = event.getEntity();
                System.out.println(entity);
            }

            @Override
            public void chartMouseMoved(ChartMouseEvent event) {
            }
        });
        }
        catch(Exception ex){
            Logger.getInstance().exceptionLogs(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStats;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
