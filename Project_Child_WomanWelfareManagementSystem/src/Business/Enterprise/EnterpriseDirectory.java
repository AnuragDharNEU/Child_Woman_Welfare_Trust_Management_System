/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class EnterpriseDirectory {
    private ArrayList<WelfareEnterprise> welfareEnterpriseList;
    private ArrayList<EducationEnterprise> educationEnterpriseList;
    private ArrayList<HospitalEnterprise> hospitalEnterpriseList;
    private ArrayList<Object> combineEnterprises;
    public EnterpriseDirectory(){
        welfareEnterpriseList=new ArrayList<WelfareEnterprise>();
        educationEnterpriseList=new ArrayList<EducationEnterprise>();
        hospitalEnterpriseList=new ArrayList<HospitalEnterprise>();
    }

    public ArrayList<WelfareEnterprise> getWelfareEnterpriseList() {
        return welfareEnterpriseList;
    }

    public void setWelfareEnterpriseList(ArrayList<WelfareEnterprise> welfareEnterpriseList) {
        this.welfareEnterpriseList = welfareEnterpriseList;
    }

    public ArrayList<EducationEnterprise> getEducationnterpriseList() {
        return educationEnterpriseList;
    }

    public void setEducationnterpriseList(ArrayList<EducationEnterprise> educationnterpriseList) {
        this.educationEnterpriseList = educationnterpriseList;
    }

    public ArrayList<HospitalEnterprise> getHospitalnterpriseList() {
        return hospitalEnterpriseList;
    }

    public void setHospitalnterpriseList(ArrayList<HospitalEnterprise> hospitalnterpriseList) {
        this.hospitalEnterpriseList = hospitalnterpriseList;
    }
    
    //Create enterprises
    public WelfareEnterprise createAndAddWelfareEnterprise(String name,String type){
        WelfareEnterprise enterpriseW=null;
        if(type.equals(WelfareEnterprise.EnterpriseType.Welfare.getValue())){
            enterpriseW = new WelfareEnterprise(name, WelfareEnterprise.EnterpriseType.valueOf(type));
            welfareEnterpriseList.add(enterpriseW);
        }
        return enterpriseW;
    }
    public EducationEnterprise createAndAddEducationEnterprise(String name,String type){
        EducationEnterprise enterpriseE=null;
        if(type.equals(EducationEnterprise.EnterpriseType.Education.getValue())){
            enterpriseE = new EducationEnterprise(name, EducationEnterprise.EnterpriseType.valueOf(type));
            educationEnterpriseList.add(enterpriseE);
        }
        return enterpriseE;
    }
    public HospitalEnterprise createAndAddHospitalEnterprise(String name,String type){
        HospitalEnterprise enterpriseH=null;
        if(type.equals(HospitalEnterprise.EnterpriseType.Hospital.getValue())){
            enterpriseH = new HospitalEnterprise(name, HospitalEnterprise.EnterpriseType.valueOf(type));
            hospitalEnterpriseList.add(enterpriseH);
        }
        return enterpriseH;
    }
    public ArrayList<Object> GetAllEnterprise(){
        combineEnterprises.add(hospitalEnterpriseList);
        combineEnterprises.add(educationEnterpriseList);
        combineEnterprises.add(welfareEnterpriseList);
        return combineEnterprises;
    }
}
