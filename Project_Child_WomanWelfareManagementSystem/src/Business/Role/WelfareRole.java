/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.EducationEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public abstract class WelfareRole extends Role{
    
    public enum RoleType{
        Admin("Admin"),
        DistrictOfficer("District Officer"),
        BlockOfficer("Block Officer"),
        SectorOfficer("Sector Officer"),
        FieldOfficer("Field Officer");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem system) {
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
