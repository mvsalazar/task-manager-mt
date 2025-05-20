package com.taskmanager.endpoints;

import com.taskmanager.model.User;
import com.taskmanager.repository.UserRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@BrowserCallable
@AnonymousAllowed
public class UserEndpoint {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
}
