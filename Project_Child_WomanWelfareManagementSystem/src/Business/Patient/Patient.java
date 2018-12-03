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
    private String disease;
    private String consultantName;
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

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getConsultantName() {
        return consultantName;
    }

    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    public UserAccount getFieldOfficer() {
        return FieldOfficer;
    }

    public void setFieldOfficer(UserAccount FieldOfficer) {
        this.FieldOfficer = FieldOfficer;
    }
    @Override
    public String toString(){
        return Name;
    }
}
