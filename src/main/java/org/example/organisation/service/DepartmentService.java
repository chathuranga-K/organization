package org.example.organisation.service;

import org.example.organisation.model.Department;
import org.example.organisation.model.Employee;
import org.example.organisation.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    // Get a List of Departments
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }

    // Add Department
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Update Department Information
    public Department editDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Delete Department
    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);
    }

    // Find department by ID
    public Department findDepartmentById(int id) {
        return departmentRepository.findById(id).orElse(null);
    }

    // Find Employees by Department ID
    public List<Employee> findEmployeesByDepartmentId(int id) {
        return departmentRepository.findByDepartmentId(id);
    }

    // Get older Employee by Department ID
    public Employee findOldEmployeeByDepartmentId(int id) {
        // Get the first employee in the oldest employee list
        return departmentRepository.findOldestEmployee(id).getFirst(); // get(0) -> to get by id
    }

}
