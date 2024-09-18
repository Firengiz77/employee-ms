package com.microservice.employee_microservices.repository;

import com.microservice.employee_microservices.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
