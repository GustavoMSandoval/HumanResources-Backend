package com.api.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.backend.dtos.department.DepartmentRequest;
import com.api.backend.dtos.department.DepartmentResponse;
import com.api.backend.entity.Department;
import com.api.backend.entity.Employee;
import com.api.backend.repository.DepartmentRepository;

@Service
public class DepartmentService {
    private DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    private DepartmentResponse toResponse(Department department) {
        return new DepartmentResponse(
            department.getId(),
            department.getName(),
            department.getEmployees()
        );
    }

    public DepartmentResponse create(DepartmentRequest request) {

        Department department = new Department(
            request.name()
        );

        return toResponse(repository.save(department));
    }

    public DepartmentResponse addEmployee(Long departmentId, Employee employee) {

        Department department = repository.findById(departmentId).orElseThrow();

        department.addEmployee(employee);

        return toResponse(repository.save(department));

    }

    
}
