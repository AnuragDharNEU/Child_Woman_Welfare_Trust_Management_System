/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
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
            EcoSystem business);
    public abstract JPanel createEducationWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            EcoSystem business);
    public abstract JPanel createHospitalWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            EcoSystem business);
}
