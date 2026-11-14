package org.example.organisation.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    private String email;
    private LocalDate joinDate;
    private double salary;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dep_id")
    private Department department;

    // Default Constructor
    public Employee() {}

    // Parameter Constructor
    public Employee(int id, String name, String email, LocalDate joinDate, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.joinDate = joinDate;
        this.salary = salary;
        this.department = department;
    }
}
