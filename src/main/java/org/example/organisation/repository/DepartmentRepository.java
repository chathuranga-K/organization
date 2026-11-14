package org.example.organisation.repository;

import org.example.organisation.model.Department;
import org.example.organisation.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    List<Employee> findByDepartmentId(Integer id);

    // Count by Department ID
    int countByDepartmentId(Integer id);

    // Get list of employees of the department by the
    @Query("SELECT e FROM Employee e WHERE e.department.id =:deptId ORDER BY e.joinDate ASC")
    List<Employee> findOldestEmployee(@Param("deptId") int deptId);
}
