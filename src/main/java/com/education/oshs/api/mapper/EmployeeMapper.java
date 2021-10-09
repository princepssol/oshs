package com.education.oshs.api.mapper;

import com.education.oshs.api.dto.EmployeeDto;
import com.education.oshs.config.ParseConfig;
import com.education.oshs.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class EmployeeMapper implements EntityMapper<Employee, EmployeeDto> {

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "department", ignore = true)
    @Mapping(target = "position", ignore = true)
    @Mapping(target = "firedDate", ignore = true)
    @Mapping(target = "sex", expression = "java(Sex::valueOf)")
    @Mapping(target = "birthDate", expression = "java(Date::valueOf)")
    @Mapping(target = "workDate", expression = "java(Date::valueOf)")
    @Mapping(target = "money", numberFormat = "$#.00")
    public abstract Employee toEntity(EmployeeDto dto);

    @Override
    public EmployeeDto fromEntity(Employee entity) {
        return null;
    }
}
