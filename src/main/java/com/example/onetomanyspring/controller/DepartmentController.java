package com.example.onetomanyspring.controller;

import com.example.onetomanyspring.domain.department.Department;
import com.example.onetomanyspring.dto.DepartmentRequestDTO;
import com.example.onetomanyspring.dto.DepartmentResponseDTO;
import com.example.onetomanyspring.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentResponseDTO> saveDepartment(@RequestBody DepartmentRequestDTO departmentRequestDTO) {
        Department department = departmentService.saveDepartment(departmentRequestDTO);
        return ResponseEntity.ok(new DepartmentResponseDTO(department));
    }

    @GetMapping
    public ResponseEntity<List<DepartmentResponseDTO>> listAllDepartments() {
        List<Department> departments = departmentService.findAllDepartments();
        return ResponseEntity.ok(departments.stream().map(DepartmentResponseDTO::new).toList());
    }

    @GetMapping("/findBy")
    public ResponseEntity<DepartmentResponseDTO> findDepartmentBy();
}
