package com.taskmanager.services;

import com.taskmanager.model.Task;
import com.taskmanager.repository.TaskRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.ListRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class TaskService extends ListRepositoryService<Task, Long, TaskRepository> {
}
