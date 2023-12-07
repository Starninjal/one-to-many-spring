package com.example.onetomanyspring.dto;

import com.example.onetomanyspring.domain.department.Department;

public record DepartmentRequestDTO(String departmentName, Long departmentNumber, String departmentAddress){
    public DepartmentRequestDTO(Department department) {
        this(department.getDepartmentName(), department.getDepartmentNumber(), department.getDepartmentAddress());
    }
}
