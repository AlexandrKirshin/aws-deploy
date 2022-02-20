package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {

    this.userRepository = userRepository;
  }

  public User getById(Integer id) {

    return userRepository.getById(id);
  }

  public List<User> getAll() {

    return userRepository.findAll();
  }

  public void create(User user) {

    userRepository.save(user);
  }
}
