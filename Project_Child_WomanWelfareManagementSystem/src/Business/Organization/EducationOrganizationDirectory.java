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
    
}
