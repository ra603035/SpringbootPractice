package com.employee.practice.repo;

import com.employee.practice.model.EmployeeDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepo extends CrudRepository<EmployeeDetails,Integer> {
}
