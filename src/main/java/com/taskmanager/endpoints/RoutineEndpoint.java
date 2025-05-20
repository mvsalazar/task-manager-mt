package com.taskmanager.endpoints;

import com.taskmanager.model.Routine;
import com.taskmanager.repository.RoutineRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@BrowserCallable
@AnonymousAllowed
public class RoutineEndpoint {
    @Autowired
    RoutineRepository routineRepository;

    public List<Routine> findAll() {
        return routineRepository.findAll();
    }

    public Optional<Routine> findById(final Long id) {
        return routineRepository.findById(id);
    }
}
