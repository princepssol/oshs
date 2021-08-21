package com.education.oshs.api.controller;

import com.education.oshs.api.dto.PositionDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/position")
public class PositionController {

    @GetMapping
    public Collection<PositionDto> getPositions() {
        return null;
    }

    @GetMapping("/{id}")
    public PositionDto getPosition(@PathVariable Integer id) {
        return null;
    }
}
