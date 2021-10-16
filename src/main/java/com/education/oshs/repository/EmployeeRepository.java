package com.education.oshs.repository;

import com.education.oshs.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByDepartmentId(Integer id);

    Employee findEmployeeByDepartmentIdAndAndLeader(Integer id, boolean leader);
}
