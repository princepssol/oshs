package com.education.oshs.api.controller;

import com.education.oshs.api.dto.EmployeeDto;
import com.education.oshs.api.dto.PositionDto;
import com.education.oshs.api.mapper.EntityMapper;
import com.education.oshs.api.mapper.PositionMapper;
import com.education.oshs.model.Position;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/position")
public class PositionController {
    private final EntityMapper<Position, PositionDto> positionMapper;

    public PositionController(PositionMapper positionMapper) {
        this.positionMapper = positionMapper;
    }

    @GetMapping
    public Collection<PositionDto> getPositions() {
        return null;
    }

    @GetMapping("/{id}")
    public PositionDto getPosition(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("/{id}/employees")
    public Collection<EmployeeDto> getEmployees(@PathVariable Integer id) {
        return null;
    }
}
