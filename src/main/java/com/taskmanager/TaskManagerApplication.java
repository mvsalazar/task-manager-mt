package com.taskmanager;

import com.taskmanager.model.User;
import com.taskmanager.model.UserType;
import com.taskmanager.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Theme("my-theme")
public class TaskManagerApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository) {
        return (args) -> {
            userRepository.save(new User("TOM", "Tommy", UserType.CHILD));
            userRepository.save(new User("Nick", "Nicky", UserType.PARENT));
            userRepository.save(new User("Jen", "Jenny", UserType.PARENT));
        };
    }

}
