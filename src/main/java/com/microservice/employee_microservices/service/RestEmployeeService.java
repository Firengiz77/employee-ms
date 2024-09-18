/*
package com.microservice.employee_microservices.service;

import com.microservice.employee_microservices.mapper.EmployeeMapper;
import com.microservice.employee_microservices.model.Employee;
import com.microservice.employee_microservices.repository.EmployeeRepository;
import com.microservice.employee_microservices.response.AddressResponse;
import com.microservice.employee_microservices.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestEmployeeService {
    private static EmployeeRepository employeeRepository;
    private static RestTemplate restTemplate;

    public RestEmployeeService(EmployeeRepository employeeRepository, @Value("${addressservice.base.url}") String addressBaseUrl, RestTemplateBuilder restTemplateBuilder) {
        this.employeeRepository = employeeRepository;
        this.restTemplate = restTemplateBuilder
                .rootUri(addressBaseUrl)
                .build();
    }

    public EmployeeResponse getEmployee(int id) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        EmployeeResponse employeeResponse = EmployeeMapper.INSTANCE.employeeToEmployeeResponse(employee);
        AddressResponse addressResponse = callAddressServiceUsingRestTemplate(id);
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }

    private AddressResponse callAddressServiceUsingRestTemplate(int id) {
        return restTemplate.getForObject("/" + id, AddressResponse.class);
    }

}
*/
