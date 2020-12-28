package com.javatechie.key.example.repository;

import com.javatechie.key.example.entity.Employee;
import com.javatechie.key.example.entity.EmployeePKId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeePKId> {
}
