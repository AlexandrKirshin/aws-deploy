package com.example.demo.controller;


import com.example.demo.domain.User;
import com.example.demo.service.UserServiceImpl;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

  private final UserServiceImpl userService;


  @GetMapping("/users")
  public String showUsersList() {

    return userService.getAll().toString();
  }

  @GetMapping("/add-user")
  public String viewCreateUsers() {

    User user = new User();
    user.setName("admin" + LocalDateTime.now());

    userService.create(user);
    return "add-user";
  }

}
