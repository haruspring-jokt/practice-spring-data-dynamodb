package com.haruspring.dynamodb.local.domain.service;

import com.haruspring.dynamodb.local.domain.model.User;
import java.util.List;

public interface UserService {
  public User addUser(User user);

  public List<User> listUser();
}
