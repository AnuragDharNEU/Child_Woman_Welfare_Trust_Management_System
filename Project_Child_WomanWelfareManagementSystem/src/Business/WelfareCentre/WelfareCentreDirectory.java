/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WelfareCentre;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WelfareCentreDirectory {
    private ArrayList<WelfareCentre> welfareCentreList;
    
    public WelfareCentreDirectory() {
        welfareCentreList = new ArrayList();
    }

    public ArrayList<WelfareCentre> getWelfareCentreList() {
        return welfareCentreList;
    }
    public WelfareCentre CreateWelfareCentre(String Name, Employee supervisor){
        WelfareCentre centre = new WelfareCentre();
        centre.setName(Name);
        centre.setSupervisor(supervisor);
        welfareCentreList.add(centre);
        return centre;
    }
}

