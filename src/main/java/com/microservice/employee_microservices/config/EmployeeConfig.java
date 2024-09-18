//package com.microservice.employee_microservices.config;
//
////import org.springframework.context.annotation.Bean;
//import com.microservice.employee_microservices.client.AddressFeignClient;
//import feign.Feign;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
////import org.springframework.web.reactive.function.client.WebClient;
//
//
//@Configuration
//public class EmployeeConfig {
//
//    @Bean
//    public AddressFeignClient addressFeignClient() {
//        return Feign.builder()
//                .target(AddressFeignClient.class, "http://localhost:8081/address/");
//    }
//
//    @Bean
//    public WebClient webClient() {
//        return WebClient
//                .builder().
//                baseUrl("http://localhost:8081/address")
//                .build();
//    }
//
//}
