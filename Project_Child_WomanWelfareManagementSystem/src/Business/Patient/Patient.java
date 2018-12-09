/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.UserAccount.UserAccount;

/**
 *
 * @author user
 */
public class Patient {
    private String Name;
    private int age;
    private String problem;
    private String service;
    private String serviceProvided;
    private UserAccount FieldOfficer;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
    public UserAccount getFieldOfficer() {
        return FieldOfficer;
    }

    public void setFieldOfficer(UserAccount FieldOfficer) {
        this.FieldOfficer = FieldOfficer;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceProvided() {
        return serviceProvided;
    }

    public void setServiceProvided(String serviceProvided) {
        this.serviceProvided = serviceProvided;
    }
    
    @Override
    public String toString(){
        return Name;
    }
}
