package com.education.oshs.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PositionDto implements DtoMarker{
    private Integer id;
    private String name;
    private Map<Integer, String> employees;
}
