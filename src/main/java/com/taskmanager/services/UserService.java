package com.taskmanager.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskmanager.model.Family;
import com.taskmanager.model.User;
import com.taskmanager.repository.FamilyRepository;
import com.taskmanager.repository.UserRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.ListRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class UserService extends ListRepositoryService<User, Long, UserRepository> {
    @Autowired
	private UserRepository userRepository;

    public User save(final User user) {
        User newUser = new User();

        newUser.setName(user.getName());
        newUser.setNickName(user.getNickName());
        newUser.setFamily(user.getFamily());
        newUser.setType(user.getType());

        userRepository.save(newUser);
    
        return newUser;
    }
}
