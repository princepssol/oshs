package com.education.oshs.api.mapper;

import com.education.oshs.api.dto.EmployeeDto;
import com.education.oshs.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import static com.education.oshs.config.ParseConfig.DTO_DATE_FORMAT;
import static com.education.oshs.config.ParseConfig.DTO_MONEY_FORMAT;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class EmployeeMapper implements EntityMapper<Employee, EmployeeDto> {

    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "birthDate", dateFormat = DTO_DATE_FORMAT)
    @Mapping(target = "workDate", dateFormat = DTO_DATE_FORMAT)
    @Mapping(target = "firedDate", dateFormat = DTO_DATE_FORMAT)
    @Mapping(target = "money", numberFormat = DTO_MONEY_FORMAT)
    public abstract Employee toEntity(EmployeeDto dto);

    @Override
    @Mapping(target = "birthDate", dateFormat = DTO_DATE_FORMAT)
    @Mapping(target = "workDate", dateFormat = DTO_DATE_FORMAT)
    @Mapping(target = "firedDate", dateFormat = DTO_DATE_FORMAT)
    @Mapping(target = "money", numberFormat = DTO_MONEY_FORMAT)
    public abstract EmployeeDto fromEntity(Employee entity);
}
