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
    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }

    // Find department by ID
    public Department findDepartmentById(Integer id) {
        return departmentRepository.findById(id).orElse(null);
    }

    // Find Department by ID
    public List<Employee> findAllEmployeesByDepartment(Integer id) {
        return emplo.findAll();
    }

}
