package com.taskmanager.controller;

import com.taskmanager.model.User;
import com.taskmanager.repository.UserRepository;
import com.vaadin.hilla.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Controller
@RequestMapping(path="/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Async
    @GetMapping(path = "/all")
    public @ResponseBody CompletableFuture<Iterable<User>> getAllUsers() {
        return CompletableFuture
                .completedFuture(userRepository.findAll());
    }

    @Async
    @GetMapping(path = "/{id}")
    public @ResponseBody CompletableFuture<Optional<User>> getById(@PathVariable Long id) {
        return CompletableFuture
                .completedFuture(userRepository.findById(id));
    }
}
