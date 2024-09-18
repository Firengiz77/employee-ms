package com.microservice.employee_microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.**.client")
public class EmployeeMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeMicroservicesApplication.class, args);
    }
}
