package com.lakshmi.employeeapi.controller;

import com.lakshmi.employeeapi.model.Employee;
import com.lakshmi.employeeapi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
 @Autowired
 EmployeeServiceImpl employeeService;

    @PostMapping("/api/employees")
    public ResponseEntity<Employee> saveEmployee(Employee employee){

        if(employee!= null) {
            employeeService.saveEmployee(employee);
            return new ResponseEntity<Employee>(HttpStatus.OK);
        }
        return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
    }

  @GetMapping("/api/getemployees")
    public ResponseEntity<List<Employee>> getEmployees(){

           List<Employee>employees =  employeeService.retrieveEmployees();
           if (employees.size()!= 0) {
               return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
           }
       return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/employee/get/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id)
    {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if(employee != null)
        {
            return new ResponseEntity("employee found"+employee,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
/*
    @DeleteMapping("/employee/delete/{id}")
    public ResponseEntity<String> deleteByEmployeeById(@PathVariable("id") Long id)
    {

        String string = employeeService.deleteEmployeeById(id);
        if(string != null)
        {
            return new ResponseEntity(string,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/employee/save")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id)
    {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if(employee != null)
        {
            return new ResponseEntity(employee,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }*/
}
