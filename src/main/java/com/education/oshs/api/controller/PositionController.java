package com.education.oshs.api.controller;

import com.education.oshs.api.dto.EmployeeDto;
import com.education.oshs.api.dto.PositionDto;
import com.education.oshs.api.mapper.EntityMapper;
import com.education.oshs.api.mapper.PositionMapper;
import com.education.oshs.model.Employee;
import com.education.oshs.model.Position;
import com.education.oshs.service.EmployeeService;
import com.education.oshs.service.PositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/position")
public class PositionController {
    private final EntityMapper<Position, PositionDto> positionMapper;
    private final EntityMapper<Employee, EmployeeDto> employeeMapper;
    private final PositionService positionService;
    private final EmployeeService employeeService;

    public PositionController(PositionMapper positionMapper,
                              EntityMapper<Employee, EmployeeDto> employeeMapper,
                              PositionService positionService,
                              EmployeeService employeeService) {
        this.positionMapper = positionMapper;
        this.employeeMapper = employeeMapper;
        this.positionService = positionService;
        this.employeeService = employeeService;
    }

    @GetMapping
    public Collection<PositionDto> getPositions() {
        return positionService.getPositions().stream()
                .map(positionMapper::fromEntity)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PositionDto getPosition(@PathVariable Integer id) {
        Position position = positionService.getPosition(id);
        return positionMapper.fromEntity(position);
    }

    @GetMapping("/{id}/employees")
    public Collection<EmployeeDto> getEmployees(@PathVariable Integer id) {
        return employeeService.getEmployeesByPosition(id).stream()
                .map(employeeMapper::fromEntity)
                .collect(Collectors.toList());
    }
}
