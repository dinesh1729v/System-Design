package com.section2.assignment.domain.dao;

import com.section2.assignment.domain.Employee;

public class EmployeeDAO {//EmployeeDataAccessObject
    public void saveEmployee(Employee employee)
    {
        System.out.println("Saved employee to the db "+employee);
    }
    public void deleteEmployee(Employee employee)
    {
        System.out.println("Deleted employee from the db "+employee);
    }
}
