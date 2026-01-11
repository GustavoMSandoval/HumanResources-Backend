package com.api.backend.dtos.employee;

public record EmployeeResponse(long id, String CPF, String email, String name, float salary) {
    
}
