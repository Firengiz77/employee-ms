package com.microservice.employee_microservices.service;

import com.microservice.employee_microservices.client.AddressFeignClient;
import com.microservice.employee_microservices.mapper.EmployeeMapper;
import com.microservice.employee_microservices.model.Employee;
import com.microservice.employee_microservices.repository.EmployeeRepository;
import com.microservice.employee_microservices.response.AddressResponse;
import com.microservice.employee_microservices.response.EmployeeResponse;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AddressFeignClient addressFeignClient;

    public EmployeeService(EmployeeRepository employeeRepository, AddressFeignClient addressFeignClient) {
        this.employeeRepository = employeeRepository;
        this.addressFeignClient = addressFeignClient;
    }

    public EmployeeResponse getEmployee(int id) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        EmployeeResponse employeeResponse = EmployeeMapper.INSTANCE.employeeToEmployeeResponse(employee);
        AddressResponse addressResponse = addressFeignClient.getAddressByEmployeeId(id);
        employeeResponse.setAddressResponse(addressResponse);
        return employeeResponse;
    }

}
