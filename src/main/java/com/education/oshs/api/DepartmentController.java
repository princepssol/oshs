package com.education.oshs.api;

import com.education.oshs.api.dto.DepartmentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @GetMapping
    public Collection<DepartmentDto> getDepartments() {
        return null;
    }

    @GetMapping("/{id}")
    public DepartmentDto getDepartment(@PathVariable Integer id) {
        return null;
    }
}
