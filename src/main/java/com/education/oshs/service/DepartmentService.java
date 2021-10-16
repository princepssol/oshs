package com.education.oshs.service;

import com.education.oshs.model.Department;

import java.util.Collection;

public interface DepartmentService {

    Collection<Department> getDepartments();

    Department getDepartment(Integer id);

    Collection<Department> getChildren(Integer id);

    Department getParent(Integer id);
}
