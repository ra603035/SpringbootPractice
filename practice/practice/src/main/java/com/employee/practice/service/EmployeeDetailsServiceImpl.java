package com.employee.practice.service;

import com.employee.practice.model.Address;
import com.employee.practice.model.EmployeeDetails;
import com.employee.practice.model.Veichel;
import com.employee.practice.repo.EmployeeDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

    @Autowired
    private EmployeeDetailsRepo employeeDetailsRepo;

    @Override
    public void addEmployeeDetails(EmployeeDetails employeeDetails) {
        employeeDetailsRepo.save(employeeDetails);
    }

    @Override
    public EmployeeDetails getEmployeeDetailsByEmpId(int empId) {

        return employeeDetailsRepo.findById(empId).get();
    }

    @Override
    public List<EmployeeDetails> getAllEmployeeDetails() {
        return (List)employeeDetailsRepo.findAll();
    }

    @Override
    public void deleteEmployeeDetailsByEmpId(int empId) {
      employeeDetailsRepo.deleteById(empId);
    }

    @Override
    public void deleteEmployeeDetails(EmployeeDetails employeeDetails) {
        employeeDetailsRepo.delete(employeeDetails);
    }

    @Override
    public EmployeeDetails updateEmployeeDetails(EmployeeDetails employeeDetails) {
       employeeDetailsRepo.save(employeeDetails);
        return employeeDetails;
    }

    @Override
    public void populateEmployeeDetails() {
        Address address = new Address(101,"5th","bengaluru","karnataka","india",560076);
        //Veichel veichel = new Veichel("bike", "560000",100000.0f);
        EmployeeDetails employeeDetails1 = new EmployeeDetails("Rahul",25,100000.0f,"IT",address);
        employeeDetailsRepo.save(employeeDetails1);
    }
}
