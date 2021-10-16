package com.education.oshs.service;

import com.education.oshs.model.Position;

import java.util.Collection;

public interface PositionService {
    Collection<Position> getPositions();

    Position getPosition(Integer id);
}
