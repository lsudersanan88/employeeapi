package com.lakshmi.employeeapi.service;

import com.lakshmi.employeeapi.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public List<Employee> retrieveEmployees();

    public Optional<Employee> getEmployee(Long employeeId);

    public Employee saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);
}
