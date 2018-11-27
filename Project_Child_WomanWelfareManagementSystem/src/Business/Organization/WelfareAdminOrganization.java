/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.WelfareAdminRole;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WelfareAdminOrganization extends WelfareOrganization{
    
    public WelfareAdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WelfareAdminRole());
        return roles;
    }
}
