package com.api.backend.dtos.employee;

import com.api.backend.entity.Department;

public record EmployeeRequest(
    Department department, String CPF, String email, String name, float salary) {
    
}
