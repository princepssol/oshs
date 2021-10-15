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
    @Mapping(target = "parent", ignore = true)
    @Mapping(target = "employees", ignore = true)
    @Mapping(target = "children", ignore = true)
    @Mapping(target = "id", ignore = true)
    public abstract Department toEntity(DepartmentDto dto);
}
