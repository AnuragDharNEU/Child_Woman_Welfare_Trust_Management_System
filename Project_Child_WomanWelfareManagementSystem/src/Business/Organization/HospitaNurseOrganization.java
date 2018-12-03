/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HospitalNurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kavit
 */
public class HospitaNurseOrganization extends HospitalOrganization{
     public HospitaNurseOrganization() {
        super(HospitalOrganization.Type.Nurse.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalNurseRole());
        return roles;
    }
    
}
