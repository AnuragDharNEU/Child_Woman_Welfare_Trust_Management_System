/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.EducationOrganization;
import Business.Organization.EducationOrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class EducationEnterprise extends EducationOrganization{
    private EnterpriseType enterpriseType;
    private EducationOrganizationDirectory educationOrganizationDirectory;

    public EducationOrganizationDirectory getEducationOrganizationDirectory() {
        return educationOrganizationDirectory;
    }
    public enum EnterpriseType{
        Welfare("Welfare");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public EducationEnterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        educationOrganizationDirectory=new EducationOrganizationDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
