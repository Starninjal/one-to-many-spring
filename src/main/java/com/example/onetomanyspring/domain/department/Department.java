package com.example.onetomanyspring.domain.department;

import com.example.onetomanyspring.dto.DepartmentRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "departament")
@Entity(name = "departament")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    private String departmentName;

    private Long departmentNumber;

    private String departmentAddress;

    public Department(DepartmentRequestDTO departmentDto) {
        this.departmentNumber = departmentDto.departmentNumber();
        this.departmentName = departmentDto.departmentName();
        this.departmentAddress = departmentDto.departmentAddress();
    }
}
