package com.education.oshs.api.controller;

import com.education.oshs.api.dto.EmployeeDto;
import com.education.oshs.api.mapper.EmployeeMapper;
import com.education.oshs.api.mapper.EntityMapper;
import com.education.oshs.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EntityMapper<Employee, EmployeeDto> employeeMapper;

    public EmployeeController(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @GetMapping
    public Collection<EmployeeDto> getEmployees() {
        return null;
    }

    @GetMapping("/{id}")
    public EmployeeDto getEmployee(@PathVariable Integer id) {
        return null;
    }
}
