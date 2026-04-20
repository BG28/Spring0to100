package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.controllers;

import com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EmployeeController {

//    @GetMapping(path = "/getSecretMessage")
//    public String getMySuperSecretMessage(){
//        return "Secret: @ajsdnjaow";
//    }

    @GetMapping("/employees/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return new EmployeeDTO(1,"Bikram",
                "abcs@gmail.com",
                28,
                "admin",
                600000.00,
                LocalDate.now(),
                true);
    }

//    @GetMapping("/employees")
//    public List<EmployeeDTO> getAllEmployees(@RequestParam Integer age){
//          return null;
//    }
}
