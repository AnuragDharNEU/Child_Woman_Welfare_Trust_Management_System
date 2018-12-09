/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.EducationEnterprise;
import Business.Logger;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Education.Supervisor.EducationSupervisorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author souma
 */
public class EducationSupervisorRole extends EducationRole{
    @Override
    public JPanel createEducationWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,EducationEnterprise enterprise, EcoSystem system) {
        Logger.getInstance().writeLogs(account.getEmployee().getName()+ " Logs in");
        return new EducationSupervisorWorkAreaJPanel(userProcessContainer, system,enterprise,account,organization);
    }
}
