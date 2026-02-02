package com.api.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.backend.dtos.department.DepartmentRequest;
import com.api.backend.dtos.department.DepartmentResponse;
import com.api.backend.entity.Employee;
import com.api.backend.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4200"})
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public DepartmentResponse create(@RequestBody DepartmentRequest request) {
        return service.create(request);
    }

    @PutMapping("{id}")
    public DepartmentResponse addEmployeeById(@PathVariable Long id, Employee employee) {
        return service.addEmployee(id, employee);
    }

    @GetMapping("{id}")
    public DepartmentResponse findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public List<DepartmentResponse> list() {
        return service.list();
    }
    
}
