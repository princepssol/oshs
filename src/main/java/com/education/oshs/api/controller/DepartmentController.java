package com.education.oshs.api.controller;

import com.education.oshs.api.dto.DepartmentDto;
import com.education.oshs.api.dto.EmployeeDto;
import com.education.oshs.api.mapper.DepartmentMapper;
import com.education.oshs.api.mapper.EmployeeMapper;
import com.education.oshs.api.mapper.EntityMapper;
import com.education.oshs.model.Department;
import com.education.oshs.model.Employee;
import com.education.oshs.service.DepartmentService;
import com.education.oshs.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final EntityMapper<Department, DepartmentDto> departmentMapper;
    private final EntityMapper<Employee, EmployeeDto> employeeMapper;
    private final DepartmentService departmentService;
    private final EmployeeService employeeService;

    public DepartmentController(DepartmentMapper departmentMapper,
                                EmployeeMapper employeeMapper,
                                DepartmentService departmentService,
                                EmployeeService employeeService) {
        this.departmentMapper = departmentMapper;
        this.employeeMapper = employeeMapper;
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }

    @GetMapping
    public Collection<DepartmentDto> getDepartments() {
        return departmentService.getDepartments().stream()
                .map(departmentMapper::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public DepartmentDto getDepartment(@PathVariable Integer id) {
        Department department = departmentService.getDepartment(id);
        return departmentMapper.fromEntity(department);
    }

    @GetMapping("/{id}/children")
    public Collection<DepartmentDto> getChildren(@PathVariable Integer id) {
        return departmentService.getChildren(id).stream()
                .map(departmentMapper::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}/parent")
    public DepartmentDto getParent(@PathVariable Integer id) {
        Department parent = departmentService.getParent(id);
        return departmentMapper.fromEntity(parent);
    }

    @GetMapping("/{id}/employees")
    public Collection<EmployeeDto> getEmployees(@PathVariable Integer id) {
        return employeeService.getEmployeesByDepartment(id).stream()
                .map(employeeMapper::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}/leader")
    public EmployeeDto getLeader(@PathVariable Integer id) {
        Employee leader = employeeService.getLeaderByDepartment(id);
        return employeeMapper.fromEntity(leader);
    }
}
