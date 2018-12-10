package com.lakshmi.employeeapi.service;

import com.lakshmi.employeeapi.employeerepository.EmployeeRepository;
import com.lakshmi.employeeapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
   @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public List<Employee> retrieveEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployee(Long employeeId) {
        Optional<Employee> employee =   employeeRepository.findById(employeeId);
        return employee;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
         return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {

    }

    @Override
    public void updateEmployee(Employee employee) {

    }


    public  Optional<Employee> getEmployeeById(Long id){
        Optional<Employee> employee =   employeeRepository.findById(id) ;
        return employee;
    }
    public  String deleteEmployeeById(Long id){

        // Optional<Employee> employee =   employeeRepository.findById(id) ;
        List<Employee> employeeList =   employeeRepository.findAll() ;
        for (Employee employee : employeeList) {
            if(employee.getId().equals(id)){
                employeeRepository.delete(employee);
                return "Employee deleted";
            }

        }
        return null;
    }
}


