package com.api.backend.dtos.employee;

public record EmployeeRequest(
    Long departmentId, String CPF, String email, String name, float salary) {
    
}
