package com.microservice.employee_microservices.service;

import com.microservice.employee_microservices.mapper.EmployeeMapper;
import com.microservice.employee_microservices.model.Employee;
import com.microservice.employee_microservices.repository.EmployeeRepository;
import com.microservice.employee_microservices.response.AddressResponse;
import com.microservice.employee_microservices.response.EmployeeResponse;
//import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.stereotype.Service;

//@Service
public class WebClientEmployeeService {

    private static EmployeeRepository employeeRepository;
//    private static WebClient webClient;
//
//    public WebClientEmployeeService(EmployeeRepository employeeRepository, WebClient webClient) {
//        this.employeeRepository = employeeRepository;
//        this.webClient = webClient;
//    }
//
//    public EmployeeResponse getEmployee(int id) {
//        Employee employee = employeeRepository.findById(id).orElseThrow();
//        EmployeeResponse employeeResponse = EmployeeMapper.INSTANCE.employeeToEmployeeResponse(employee);
//        AddressResponse addressResponse = webClient.get()
//                .uri("/" + id)
//                .retrieve()
//                .bodyToMono(AddressResponse.class)
//                .block();
//        employeeResponse.setAddressResponse(addressResponse);
//        return employeeResponse;
//    }
}
