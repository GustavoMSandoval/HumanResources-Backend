package com.api.backend.dtos.department;

import java.util.List;

import com.api.backend.entity.Employee;

public record DepartmentResponse(long id, String name , List<Employee> employees) {
    
}
