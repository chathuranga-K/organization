package org.example.organisation.repository;

import org.example.organisation.model.Department;
import org.example.organisation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    List<Employee> findByDepartmentId(Integer id);

}
