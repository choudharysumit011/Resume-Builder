package com.example.Resume.Builder.Services;

import com.example.Resume.Builder.Repository.UserRepository;
import com.example.Resume.Builder.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void insertTestData() {
        User user1 = new User();
        user1.setUserName("einstein");
        user1.setPassword("einstein");
        user1.setActive(true);
        user1.setRoles("USER");

        User user2 = new User();
        user2.setUserName("newton");
        user2.setPassword("newton");
        user2.setActive(true);
        user2.setRoles("USER");

        User user3 = new User();
        user3.setUserName("koushik");
        user3.setPassword("koushik");
        user3.setActive(true);
        user3.setRoles("USER");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }
}
