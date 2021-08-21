package com.education.oshs.api;

import com.education.oshs.api.dto.EmployeeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping
    public Collection<EmployeeDto> getEmployees() {
        return null;
    }

    @GetMapping("/{id}")
    public EmployeeDto getEmployee(@PathVariable Integer id) {
        return null;
    }
}
