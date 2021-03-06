/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.WelfareEnterprise;
import Business.Logger;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Welfare.FLO.WelfareFLOWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class WelfareFLORole extends WelfareRole{
    @Override
    public JPanel createWelfareWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,WelfareEnterprise enterprise, EcoSystem system) {
        Logger.getInstance().writeLogs(account.getEmployee().getName()+ " Logs in");
        return new WelfareFLOWorkAreaJPanel(userProcessContainer, system, enterprise, organization,account);
    }
}
