package com.taskmanager.endpoints;

import com.taskmanager.model.Task;
import com.taskmanager.repository.TaskRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@BrowserCallable
@AnonymousAllowed
public class TaskEndpoint {
    @Autowired
    TaskRepository taskRepository;

    public List<Task> findAll()  {
        return taskRepository.findAll();
    }

    public Optional<Task> findById(final Long id) {
        return taskRepository.findById(id);
    }
}
