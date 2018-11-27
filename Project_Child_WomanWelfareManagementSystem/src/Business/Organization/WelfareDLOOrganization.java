/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.WelfareAdminRole;
import Business.Role.WelfareDLORole;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WelfareDLOOrganization extends WelfareOrganization{
    
    public WelfareDLOOrganization() {
        super(WelfareOrganization.Type.DLO.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WelfareDLORole());
        return roles;
    }
}
