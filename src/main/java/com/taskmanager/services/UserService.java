package com.taskmanager.services;

import com.taskmanager.model.User;
import com.taskmanager.repository.UserRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.ListRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class UserService extends ListRepositoryService<User, Long, UserRepository> {
}
