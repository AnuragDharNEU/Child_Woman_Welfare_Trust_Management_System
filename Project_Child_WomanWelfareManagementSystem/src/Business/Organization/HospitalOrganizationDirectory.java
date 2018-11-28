/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class HospitalOrganizationDirectory {
    
    private ArrayList<HospitalOrganization> hospitalOrganizationList;
    
    public HospitalOrganizationDirectory() {
            hospitalOrganizationList = new ArrayList();
        }

    public ArrayList<HospitalOrganization> getHospitalOrganizationList() {
        return hospitalOrganizationList;
    }
    public HospitalOrganization createHospitalOrganization(String type){
        HospitalOrganization organization = null;
        if (type.equals(HospitalOrganization.Type.Admin.getValue())){
            organization = new HospitalAdminOrganization();
            hospitalOrganizationList.add(organization);
        }
        else if (type.equals(HospitalOrganization.Type.Doctor.getValue())){
//            organization = new EducationAdminOrganization();
//            educationOrganizationList.add(organization);
        }
        else if (type.equals(HospitalOrganization.Type.Lab.getValue())){
//            organization = new EducationAdminOrganization();
//            educationOrganizationList.add(organization);
        }
        return organization;
    }
}
