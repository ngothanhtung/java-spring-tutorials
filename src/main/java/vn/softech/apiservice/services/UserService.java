package vn.softech.apiservice.services;

import org.springframework.stereotype.Service;
import vn.softech.apiservice.dtos.CreateUserDto;
import vn.softech.apiservice.entities.User;
import vn.softech.apiservice.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createRequest(CreateUserDto data  ) {
        User user = new User();
        user.setName(data.getName());
        user.setEmail(data.getEmail());
        user.setPassword(data.getPassword());

        return userRepository.save(user);
    }


    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
