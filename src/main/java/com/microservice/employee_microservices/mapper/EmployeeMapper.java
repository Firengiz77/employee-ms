package com.microservice.employee_microservices.mapper;

import com.microservice.employee_microservices.model.Employee;
import com.microservice.employee_microservices.response.EmployeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeResponse employeeToEmployeeResponse(Employee employee);
}
