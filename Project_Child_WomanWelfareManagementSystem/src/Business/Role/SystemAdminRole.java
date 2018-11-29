/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.EducationEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class SystemAdminRole  extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    @Override
    public JPanel createWelfareWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,WelfareEnterprise enterprise, EcoSystem system) {
        //return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        return null;
    }
    @Override
    public JPanel createEducationWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,EducationEnterprise enterprise, EcoSystem system) {
        //return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        return null;
    }
    @Override
    public JPanel createHospitalWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,HospitalEnterprise enterprise, EcoSystem system) {
        //return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        return null;
    }
    
}
