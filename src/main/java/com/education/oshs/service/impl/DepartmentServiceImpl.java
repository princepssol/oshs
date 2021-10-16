package com.education.oshs.service.impl;

import com.education.oshs.exception.ProjectException;
import com.education.oshs.model.Department;
import com.education.oshs.repository.DepartmentRepository;
import com.education.oshs.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Objects;

import static com.education.oshs.exception.ProjectException.*;

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

    @Override
    public Department getDepartment(Integer id) {
        return departmentRepository.getOne(id);
    }

    @Override
    public Collection<Department> getChildren(Integer id) {
        Collection<Department> children = departmentRepository.getDepartmentsByParentId(id);
        if (children.isEmpty()) throw new ProjectException(String.format(NO_CHILDREN, id));
        return children;
    }

    @Override
    public Department getParent(Integer id) {
        Department parent = departmentRepository.getParentByChildId(id)
                .orElseThrow(() -> new ProjectException(String.format(NOT_EXISTS, id)));
        if (Objects.equals(id, parent.getId())) {
            throw new ProjectException(String.format(NO_PARENT, id));
        }
        return parent;
    }
}
