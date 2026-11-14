package org.example.organisation.service;

import org.example.organisation.model.Employee;
import org.example.organisation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    // Add Employee
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Edit Employee Information
    public Employee editEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Update Employee Information
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Delete Employee
    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    // Search an Employee by ID
    public Employee findEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    // Get all employees
    public List<Employee> findAllEmployees(Employee employee) {
        return employeeRepository.findAll();
    }
}
