package com.example.onetomanyspring.dto;

import com.example.onetomanyspring.domain.department.Department;

public record DepartmentResponseDTO(Long departmentId, String departmentName, Long departmentNumber, String departmentAddress) {
    public DepartmentResponseDTO(Department department) {
        this(department.getDepartmentId(), department.getDepartmentName(), department.getDepartmentNumber(), department.getDepartmentAddress());
    }
}
