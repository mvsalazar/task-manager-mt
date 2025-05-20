package com.taskmanager;

// import com.taskmanager.model.Family;
// import com.taskmanager.model.User;
// import com.taskmanager.model.UserType;
// import com.taskmanager.repository.FamilyRepository;
// import com.taskmanager.repository.UserRepository;
// import org.springframework.boot.CommandLineRunner;
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

    // @Bean
    // public CommandLineRunner loadData(final UserRepository userRepository, final FamilyRepository familyRepository) {
    //     return (args) -> {
    //         // Seed Users
    //         userRepository.save(new User("TOM", "Tommy", UserType.CHILD));
    //         userRepository.save(new User("Nick", "Nicky", UserType.PARENT));
    //         userRepository.save(new User("Jen", "Jenny", UserType.PARENT));

    //         // Seed Family
    //         familyRepository.save(new Family("Smith"));
    //     };
    // }

}
