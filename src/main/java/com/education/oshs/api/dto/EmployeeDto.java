package com.education.oshs.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto implements DtoMarker{
    private Integer id;
    private String sex;
    private String firstName;
    private String secondName;
    private String lastName;
    private Boolean leader;
    private String birthDate;
    private String workDate;
    private DepartmentDto department;
    private PositionDto position;
    private String phone;
    private String email;
    private String firedDate;
    private String money;
}
