/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class College {
    private ArrayList<Department> departments;
    
    public College(String name){
        departments = new ArrayList();
    }

    // Defines a method that helps add new Department instances without getting access to the department attribute directly.
    public void addDepartment(Department newDepartment) {
        this.departments.add(newDepartment);
    }
}
