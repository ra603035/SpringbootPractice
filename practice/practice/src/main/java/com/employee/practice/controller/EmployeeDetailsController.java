package com.employee.practice.controller;

import com.employee.practice.model.EmployeeDetails;
import com.employee.practice.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class EmployeeDetailsController {

    @Autowired
    private EmployeeDetailsService employeeDetailsService;

    @PostMapping("/add-employee")
   public void addEmployeeDetails(@RequestBody EmployeeDetails employeeDetails){
       employeeDetailsService.addEmployeeDetails(employeeDetails);
   }

   @GetMapping("/get-a-Employee/{id}")
   public EmployeeDetails getEmployeeDetailsById(@PathVariable int id){
        return employeeDetailsService.getEmployeeDetailsByEmpId(id);
   }

   @GetMapping("/get-all-employee")
   public List<EmployeeDetails> getAllEmployeeDetails(){
        return employeeDetailsService.getAllEmployeeDetails();
   }
   @PostMapping("/populate-employee-details")
   public void populateEmployeeDetails(){
        employeeDetailsService.populateEmployeeDetails();
   }

   @DeleteMapping("/delete-employee/{id}")
   public void deleteEmployeeDetailsById(@PathVariable int id){
        employeeDetailsService.deleteEmployeeDetailsByEmpId(id);
   }

   @DeleteMapping("/delete-employee")
   public void deleteEmployeeDetails(@RequestBody EmployeeDetails employeeDetails){
        employeeDetailsService.deleteEmployeeDetails(employeeDetails);
   }
}
