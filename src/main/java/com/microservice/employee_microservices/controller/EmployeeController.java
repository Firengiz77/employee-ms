package com.microservice.employee_microservices.controller;


import com.microservice.employee_microservices.response.EmployeeResponse;
import com.microservice.employee_microservices.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees/")
public class EmployeeController {

    public static EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("{id}")
    public EmployeeResponse getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }


}
