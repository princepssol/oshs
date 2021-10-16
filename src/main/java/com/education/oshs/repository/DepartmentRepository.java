package com.education.oshs.repository;

import com.education.oshs.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    List<Department> getDepartmentsByParentId(Integer id);

    @Query("select d.parent from Department d where d.id = :id")
    Optional<Department> getParentByChildId(Integer id);
}
