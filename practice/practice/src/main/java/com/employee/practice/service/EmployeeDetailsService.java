package com.employee.practice.service;

import com.employee.practice.model.EmployeeDetails;

import java.util.List;

public interface EmployeeDetailsService {

    public void addEmployeeDetails(EmployeeDetails employeeDetails);

    public EmployeeDetails getEmployeeDetailsByEmpId(int empId);

    public List<EmployeeDetails> getAllEmployeeDetails();

    public void deleteEmployeeDetailsByEmpId(int empId);

    public void deleteEmployeeDetails(EmployeeDetails employeeDetails);

    public EmployeeDetails updateEmployeeDetails(EmployeeDetails employeeDetails);

    public void populateEmployeeDetails();
}
