/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EducationSupervisorRole;
import Business.Role.EducationTeacherRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author souma
 */
public class EducationTeacherOrganization extends EducationOrganization{
    public EducationTeacherOrganization() {
        super(EducationOrganization.Type.Teacher.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EducationTeacherRole());
        return roles;
    }
}
