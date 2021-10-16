package com.education.oshs.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto implements DtoMarker{
    private Integer id;
    @NotBlank
    private String sex;
    @NotBlank
    private String firstName;
    private String secondName;
    @NotBlank
    private String lastName;
    @NotBlank
    private Boolean leader;
    @NotBlank
    private String birthDate;
    @NotBlank
    private String workDate;
    private DepartmentDto department;
    private PositionDto position;
    @NotBlank
    private String phone;
    @Email
    private String email;
    private String firedDate;
    @NotBlank
    private String money;
}
