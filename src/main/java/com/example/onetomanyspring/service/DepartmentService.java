package com.example.onetomanyspring.service;

import com.example.onetomanyspring.domain.department.Department;
import com.example.onetomanyspring.dto.DepartmentRequestDTO;
import com.example.onetomanyspring.dto.DepartmentResponseDTO;
import com.example.onetomanyspring.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    public DepartmentRepository departmentRepository;
    public Department saveDepartment(DepartmentRequestDTO departmentRequestDTO) {
        Department department = new Department(departmentRequestDTO);
        return departmentRepository.save(department);
    }

    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }
}
