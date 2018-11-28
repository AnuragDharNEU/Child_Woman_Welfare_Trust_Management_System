/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.WelfareEnterprise;
import Business.Network.Network;
import Business.Organization.WelfareOrganization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author user
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
         
        Network network= system.createAndAddNetwork();
        network.setName("System Administrator");
        WelfareEnterprise ent = network.getEnterpriseDirectory().createAndAddWelfareEnterprise("Admin", "Welfare");
        WelfareOrganization welfare = ent.getWelfareOrganizationDirectory().createWelfareOrganization("Admin Organization");
        
        Employee employee = welfare.getEmployeeDirectory().createEmployee("SystemAdmin");
        UserAccount ua= welfare.getUserAccountDirectory().createUserAccount("sysAdmin", "sysAdmin", employee, new SystemAdminRole());
            
        return system;
    }
}
