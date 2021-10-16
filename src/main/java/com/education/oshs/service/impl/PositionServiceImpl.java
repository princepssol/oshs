package com.education.oshs.service.impl;

import com.education.oshs.exception.ProjectException;
import com.education.oshs.model.Position;
import com.education.oshs.repository.PositionRepository;
import com.education.oshs.service.PositionService;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static com.education.oshs.exception.ProjectException.*;

@Service
public class PositionServiceImpl implements PositionService {
    private PositionRepository positionRepository;

    @Override
    public Collection<Position> getPositions() {
        return positionRepository.findAll();
    }

    @Override
    public Position getPosition(Integer id) {
        return positionRepository.findById(id).orElseThrow(() -> new ProjectException(String.format(NOT_EXISTS, id)));
    }
}
