/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalLabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kavit
 */
public class HospitalLabAssistantOrganization extends HospitalOrganization {
    public HospitalLabAssistantOrganization() {
        super(HospitalOrganization.Type.Lab.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalLabAssistantRole());
        return roles;
    }
    
}
