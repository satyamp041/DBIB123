package com.psl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psl.model.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
