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
public class WelfareOrganizationDirectory {
    private ArrayList<WelfareOrganization> welfareOrganizationList;

    public WelfareOrganizationDirectory() {
        welfareOrganizationList = new ArrayList();
    }

    public ArrayList<WelfareOrganization> getWelfareOrganizationList() {
        return welfareOrganizationList;
    }
    public WelfareOrganization createWelfareOrganization(String type){
        WelfareOrganization organization = null;
        if (type.equals(WelfareOrganization.Type.Admin.getValue())){
            organization = new WelfareAdminOrganization();
            welfareOrganizationList.add(organization);
        }
        else if (type.equals(WelfareOrganization.Type.DLO.getValue())){
            organization = new WelfareDLOOrganization();
            welfareOrganizationList.add(organization);
        }
        else if (type.equals(WelfareOrganization.Type.BLO.getValue())){
//            organization = new WelfareDLOOrganization();
//            welfareOrganizationList.add(organization);
        }
        else if (type.equals(WelfareOrganization.Type.SLO.getValue())){
//            organization = new WelfareDLOOrganization();
//            welfareOrganizationList.add(organization);
        }
        else if (type.equals(WelfareOrganization.Type.FLO.getValue())){
//            organization = new WelfareDLOOrganization();
//            welfareOrganizationList.add(organization);
        }
        return organization;
    }
}
