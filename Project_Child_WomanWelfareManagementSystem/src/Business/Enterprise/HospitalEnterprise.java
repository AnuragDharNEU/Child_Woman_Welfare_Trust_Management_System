/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.HospitalOrganization;
import Business.Organization.HospitalOrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class HospitalEnterprise extends HospitalOrganization{
    private EnterpriseType enterpriseType;
    private HospitalOrganizationDirectory hospitalOrganizationDirectory;

    public HospitalOrganizationDirectory getHospitalOrganizationDirectory() {
        return hospitalOrganizationDirectory;
    }

    
    public enum EnterpriseType{
        Hospital("Hospital");
        
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
    
    public HospitalEnterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        hospitalOrganizationDirectory=new HospitalOrganizationDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
