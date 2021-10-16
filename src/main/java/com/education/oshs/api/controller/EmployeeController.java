package com.education.oshs.api.controller;

import com.education.oshs.api.dto.EmployeeDto;
import com.education.oshs.api.mapper.EmployeeMapper;
import com.education.oshs.api.mapper.EntityMapper;
import com.education.oshs.model.Employee;
import com.education.oshs.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EntityMapper<Employee, EmployeeDto> employeeMapper;
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeMapper employeeMapper,
                              EmployeeService employeeService) {
        this.employeeMapper = employeeMapper;
        this.employeeService = employeeService;
    }

    @GetMapping
    public Collection<EmployeeDto> getEmployees() {
        return employeeService.getEmployees().stream()
                .map(employeeMapper::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/fired")
    public Collection<EmployeeDto> getFired() {
        return employeeService.getFired().stream()
                .map(employeeMapper::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public EmployeeDto getEmployee(@PathVariable Integer id) {
        Employee employee = employeeService.getEmployee(id);
        return employeeMapper.fromEntity(employee);
    }
}
