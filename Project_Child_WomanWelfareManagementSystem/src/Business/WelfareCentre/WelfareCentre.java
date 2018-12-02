/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WelfareCentre;

import Business.Employee.Employee;
import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class WelfareCentre {
    private String Name;
    private Employee supervisor;
    private ArrayList<Employee> employeeList;
    private ArrayList<Patient> patientList;

    public WelfareCentre() {
        this.employeeList = new ArrayList<Employee>();
        this.patientList = new ArrayList<Patient>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public void AddEmployee(Employee emp){
        employeeList.add(emp);
    }
    public void AddPatient(Patient pat){
        patientList.add(pat);
    }
    @Override
    public String toString(){
        return Name;
    }
}
