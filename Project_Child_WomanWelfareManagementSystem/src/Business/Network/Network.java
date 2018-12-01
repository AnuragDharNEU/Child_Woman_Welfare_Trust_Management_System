/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.WelfareCentre.WelfareCentreDirectory;

/**
 *
 * @author user
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private WelfareCentreDirectory centreDir;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        centreDir = new WelfareCentreDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public WelfareCentreDirectory getCentreDir() {
        return centreDir;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
