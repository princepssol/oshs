package com.education.oshs.api.mapper;

import com.education.oshs.api.dto.DepartmentDto;
import com.education.oshs.model.Department;
import com.education.oshs.model.Employee;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class DepartmentMapper implements EntityMapper<Department, DepartmentDto> {

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "parent", ignore = true)
    @Mapping(target = "children", ignore = true)
    @Mapping(target = "employees", ignore = true)
    @Mapping(target = "created", ignore = true)
    public abstract Department toEntity(DepartmentDto dto);

    @Override
    @Mapping(target = "parent", expression = "java(toParent(entity.getParent()))")
    @Mapping(target = "children", expression = "java(toChildren(entity.getChildren()))")
    @Mapping(target = "employees", expression = "java(toEmployees(entity.getEmployees()))")
    public abstract DepartmentDto fromEntity(Department entity);

    public ImmutablePair<Integer, String> toParent(Department parent) {
        return new ImmutablePair<>(parent.getId(), parent.getName());
    }

    public Map<Integer, String> toChildren(Collection<Department> children) {
        return children.stream()
                .collect(Collectors.toMap(Department::getId, Department::getName));
    }

    public Map<Integer, String> toEmployees(Collection<Employee> employees) {
        return employees.stream()
                .collect(Collectors.toMap(Employee::getId,
                        employee -> String.join(" ",
                                employee.getFirstName(),
                                employee.getSecondName(),
                                employee.getLastName())));
    }
}
