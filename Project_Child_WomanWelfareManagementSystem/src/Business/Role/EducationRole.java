/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author user
 */
public abstract class EducationRole extends Role{
    
    public enum RoleType{
        Admin("Admin"),
        Supervisor("Supervisor"),
        Distributor("Distributor"),
        Teacher("Teacher");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
