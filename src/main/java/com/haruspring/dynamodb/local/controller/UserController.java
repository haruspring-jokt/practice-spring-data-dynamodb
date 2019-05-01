package com.haruspring.dynamodb.local.controller;

import com.haruspring.dynamodb.local.domain.model.User;
import com.haruspring.dynamodb.local.domain.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/users")
@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("add")
  public User addUser() {
    User user = new User();
    user.setFirstName("Mingch");
    user = userService.addUser(user);
    return user;
  }

  @GetMapping("list")
  public List<User> listUser() {
    List<User> list = userService.listUser();
    return list;
  }
}
