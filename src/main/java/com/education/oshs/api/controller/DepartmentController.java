package com.education.oshs.api.controller;

import com.education.oshs.api.dto.DepartmentDto;
import com.education.oshs.api.dto.EmployeeDto;
import com.education.oshs.api.mapper.DepartmentMapper;
import com.education.oshs.api.mapper.EntityMapper;
import com.education.oshs.model.Department;
import com.education.oshs.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final EntityMapper<Department, DepartmentDto> departmentMapper;
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentMapper departmentMapper,
                                DepartmentService departmentService) {
        this.departmentMapper = departmentMapper;
        this.departmentService = departmentService;
    }

    @GetMapping
    public Collection<DepartmentDto> getDepartments() {
        return departmentService.getDepartments().stream()
                .map(departmentMapper::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public DepartmentDto getDepartment(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("/{id}/children")
    public Collection<DepartmentDto> getChildren(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("/{id}/parent")
    public DepartmentDto getParent(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("/{id}/employees")
    public Collection<EmployeeDto> getEmployees(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("/{id}/leader")
    public EmployeeDto getLeader(@PathVariable Integer id) {
        return null;
    }
}
