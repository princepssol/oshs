package com.education.oshs.api.mapper;

import com.education.oshs.api.dto.PositionDto;
import com.education.oshs.model.Employee;
import com.education.oshs.model.Position;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class PositionMapper implements EntityMapper<Position, PositionDto> {

    @Override
    @Mapping(target = "employees", ignore = true)
    @Mapping(target = "id", ignore = true)
    public abstract Position toEntity(PositionDto dto);
}