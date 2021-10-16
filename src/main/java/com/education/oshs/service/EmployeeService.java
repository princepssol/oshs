package com.education.oshs.service;

import com.education.oshs.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Collection<Employee> getEmployeesByDepartment(Integer id);

    Employee getLeaderByDepartment(Integer id);

    Collection<Employee> getEmployees();

    Collection<Employee> getFired();

    Employee getEmployee(Integer id);
}
