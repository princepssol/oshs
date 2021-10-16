package com.education.oshs.service.impl;

import com.education.oshs.model.Employee;
import com.education.oshs.repository.EmployeeRepository;
import com.education.oshs.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Collection;

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
        return employeeRepository.findEmployeeByDepartmentIdAndAndLeader(id, true);
    }
}
