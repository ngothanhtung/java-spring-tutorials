package vn.softech.apiservice.controllers;

import org.springframework.web.bind.annotation.*;
import vn.softech.apiservice.dtos.CreateUserDto;
import vn.softech.apiservice.entities.User;
import vn.softech.apiservice.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public User createUser(@RequestBody CreateUserDto data) {
        return userService.createRequest(data);
    }

    @GetMapping()
    public Iterable<User> getUsers() {
        return userService.getUsers();
    }
}
