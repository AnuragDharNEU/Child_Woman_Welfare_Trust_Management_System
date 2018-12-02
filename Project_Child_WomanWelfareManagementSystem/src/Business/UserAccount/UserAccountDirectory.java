/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.EducationEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.WelfareEnterprise;
import Business.Network.Network;
import Business.Organization.EducationOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.WelfareOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
//        boolean flag = true;
//        if(flag){
//            for(Network net : EcoSystem.getInstance().getNetworkList()){
//                for(WelfareEnterprise wel : net.getEnterpriseDirectory().getWelfareEnterpriseList()){
//                    for(WelfareOrganization org : wel.getWelfareOrganizationDirectory().getWelfareOrganizationList()){
//                        for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
//                            if (ua.getUsername().equals(username))
//                            flag = false;
//                        }
//                    }
//                }
//            }
//        }
//        if(flag){
//            for(Network net : EcoSystem.getInstance().getNetworkList()){
//                for(EducationEnterprise wel : net.getEnterpriseDirectory().getEducationnterpriseList()){
//                    for(EducationOrganization org : wel.getEducationOrganizationDirectory().getEducationOrganizationList()){
//                        for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
//                            if (ua.getUsername().equals(username))
//                            flag = false;
//                        }
//                    }
//                }
//            }
//        }
//        if(flag){
//            for(Network net : EcoSystem.getInstance().getNetworkList()){
//                for(HospitalEnterprise wel : net.getEnterpriseDirectory().getHospitalnterpriseList()){
//                    for(HospitalOrganization org : wel.getHospitalOrganizationDirectory().getHospitalOrganizationList()){
//                        for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
//                            if (ua.getUsername().equals(username))
//                            flag = false;
//                        }
//                    }
//                }
//            }
//        }
//        return flag;
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
