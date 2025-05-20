package com.taskmanager.services;

import com.taskmanager.model.Routine;
import com.taskmanager.repository.RoutineRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.ListRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class RoutineService extends ListRepositoryService<Routine, Long, RoutineRepository> {
}
