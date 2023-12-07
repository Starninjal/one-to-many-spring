package com.example.onetomanyspring.domain.employee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "employee")
@Entity(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String employeeName;

    @Column(unique = true)
    private String employeeDocument;

    private String employeeAge;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;s

}
