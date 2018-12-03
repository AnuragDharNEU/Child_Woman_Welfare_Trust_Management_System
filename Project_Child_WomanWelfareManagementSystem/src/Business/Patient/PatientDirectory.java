/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PatientDirectory {
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        this.patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    public Patient AddPatient(String name, int age){
        Patient pat = new Patient();
        pat.setAge(age);
        pat.setName(name);
        patientList.add(pat);
        return pat;
    }
}
