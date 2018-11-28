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
public class EducationOrganizationDirectory {
    private ArrayList<EducationOrganization> educationOrganizationList;
    
    public EducationOrganizationDirectory() {
            educationOrganizationList = new ArrayList();
        }

    public ArrayList<EducationOrganization> getEducationOrganizationList() {
        return educationOrganizationList;
    }
    public EducationOrganization createEducationOrganization(String type){
        EducationOrganization organization = null;
        if (type.equals(EducationOrganization.Type.Admin.getValue())){
            organization = new EducationAdminOrganization();
            educationOrganizationList.add(organization);
        }
        else if (type.equals(EducationOrganization.Type.Distributor.getValue())){
//            organization = new EducationAdminOrganization();
//            educationOrganizationList.add(organization);
        }
        else if (type.equals(EducationOrganization.Type.Teacher.getValue())){
//            organization = new EducationAdminOrganization();
//            educationOrganizationList.add(organization);
        }
        else if (type.equals(EducationOrganization.Type.Supervisor.getValue())){
//            organization = new EducationAdminOrganization();
//            educationOrganizationList.add(organization);
        }
        return organization;
    }
}
