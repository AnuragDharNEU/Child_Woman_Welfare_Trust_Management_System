/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.WelfareSLORole;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WelfareSLOOrganization extends WelfareOrganization{
    public WelfareSLOOrganization() {
        super(WelfareOrganization.Type.SLO.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WelfareSLORole());
        return roles;
    }
}
