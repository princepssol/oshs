package com.education.oshs.repository;

import com.education.oshs.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByDepartmentId(Integer id);

    Optional<Employee> findEmployeeByDepartmentIdAndLeader(Integer id, boolean leader);

    List<Employee> findEmployeesByFiredDateIsNull();

    List<Employee> findEmployeesByPositionId(Integer id);
}
