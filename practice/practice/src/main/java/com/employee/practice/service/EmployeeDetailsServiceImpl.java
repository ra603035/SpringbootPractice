package com.employee.practice.service;

import com.employee.practice.model.Address;
import com.employee.practice.model.EmployeeDetails;
import com.employee.practice.model.Veichel;
import com.employee.practice.repo.EmployeeDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

    @Autowired
    private EmployeeDetailsRepo employeeDetailsRepo;

    private Address address;
    private Veichel veichel;

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
    public Address getAddressByAddressId(int addressId) {

        List<EmployeeDetails> listEmp = (List<EmployeeDetails>) employeeDetailsRepo.findAll();
        for(EmployeeDetails employeeDetails : listEmp){
            if(employeeDetails.getAddress().getAddressId() == addressId){
                address = employeeDetails.getAddress();
            }
        }
        return address;
    }

    @Override
    public List<Address> getAllAddress() {
        List<EmployeeDetails> listEmp = (List<EmployeeDetails>) employeeDetailsRepo.findAll();
        List<Address> listAddress = new ArrayList<>();
        for (EmployeeDetails employeeDetails : listEmp){
            listAddress.add(employeeDetails.getAddress());

        }
        return listAddress;
    }

    @Override
    public Veichel getVeichelByVeichelId(int veichelId) {
        List<EmployeeDetails> listEmp = (List<EmployeeDetails>) employeeDetailsRepo.findAll();
        for(EmployeeDetails employeeDetails : listEmp){
            if(employeeDetails.getVeichel().getVeichelId() == veichelId)
                veichel = employeeDetails.getVeichel();
        }
        return veichel;
    }

    @Override
    public List<Veichel> getAllVeichel() {
        List<EmployeeDetails> listEmp = (List<EmployeeDetails>) employeeDetailsRepo.findAll();
        List<Veichel> listVeichel = new ArrayList<>();

        for(EmployeeDetails employeeDetails : listEmp){
            listVeichel.add(employeeDetails.getVeichel());
        }
        return listVeichel;
    }


    @Override
    public void populateEmployeeDetails() {
        Address address = new Address(101,"5th","bengaluru","karnataka","india",560076);
        Veichel veichel = new Veichel("bike", "560000",100000.0f);
        EmployeeDetails employeeDetails1 = new EmployeeDetails("Rahul",25,100000.0f,"IT",address,veichel);
        employeeDetailsRepo.save(employeeDetails1);
    }

}
