package com.education.oshs.service.impl;

import com.education.oshs.model.Department;
import com.education.oshs.repository.DepartmentRepository;
import com.education.oshs.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Collection<Department> getDepartments() {
        return departmentRepository.findAll();
    }
}
