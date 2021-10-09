package com.education.oshs.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentDto implements DtoMarker {
    private Integer id;
    private String name;
    private ImmutablePair<Integer, String> parent;
    private Map<Integer, String> children;
    private Map<Integer, String> employees;
    private String created;
}
