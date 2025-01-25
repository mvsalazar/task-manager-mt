//package com.taskmanager.endpoints;
//
//public class UserEndpoint {
//}

package com.taskmanager.endpoints;

import com.taskmanager.model.User;
import com.taskmanager.repository.UserRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Endpoint
@AnonymousAllowed
public class UserEndpoint {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getById( Long id) {
        return userRepository.findById(id);
    }
}
