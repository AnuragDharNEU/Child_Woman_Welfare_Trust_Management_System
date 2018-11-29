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
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public abstract class Role {
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            EcoSystem business);
    public abstract JPanel createWelfareWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            WelfareEnterprise enterprise,
            EcoSystem business);
    public abstract JPanel createEducationWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            EducationEnterprise ennterprise,
            EcoSystem business);
    public abstract JPanel createHospitalWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            HospitalEnterprise enterprise,
            EcoSystem business);
}
