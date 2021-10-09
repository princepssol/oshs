package com.education.oshs.api.mapper;

import com.education.oshs.api.dto.DtoMarker;
import com.education.oshs.model.EntityMarker;

public interface EntityMapper<E extends EntityMarker, D extends DtoMarker> {
    E toEntity(D dto);
    D fromEntity(E entity);
}
