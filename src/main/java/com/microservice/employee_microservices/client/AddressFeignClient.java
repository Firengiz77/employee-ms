package com.microservice.employee_microservices.client;

import com.microservice.employee_microservices.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-client", url = "${clients.address}")
public interface AddressFeignClient {

    @GetMapping("/{id}")
    AddressResponse getAddressByEmployeeId(@PathVariable("id") Integer id);
}
