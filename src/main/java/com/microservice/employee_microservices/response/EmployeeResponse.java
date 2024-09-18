package com.microservice.employee_microservices.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse {

    private int id;
    private String name;
    private String email;
    private String bloodgroup;
    private AddressResponse addressResponse;
}
