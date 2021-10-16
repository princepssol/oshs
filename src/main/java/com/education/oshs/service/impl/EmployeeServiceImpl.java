package com.education.oshs.service.impl;

import com.education.oshs.exception.ProjectException;
import com.education.oshs.model.Employee;
import com.education.oshs.repository.EmployeeRepository;
import com.education.oshs.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static com.education.oshs.exception.ProjectException.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Collection<Employee> getEmployeesByDepartment(Integer id) {
        return employeeRepository.findAllByDepartmentId(id);
    }

    @Override
    public Employee getLeaderByDepartment(Integer id) {
        return employeeRepository.findEmployeeByDepartmentIdAndLeader(id, true)
                .orElseThrow(() -> new ProjectException(String.format(NOT_EXISTS, id)));
    }

    @Override
    public Collection<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Collection<Employee> getFired() {
        return employeeRepository.findEmployeesByFiredDateIsNull();
    }

    @Override
    public Employee getEmployee(Integer id) {
        return employeeRepository.findById(id).orElseThrow(() -> new ProjectException(String.format(NOT_EXISTS, id)));
    }
}
