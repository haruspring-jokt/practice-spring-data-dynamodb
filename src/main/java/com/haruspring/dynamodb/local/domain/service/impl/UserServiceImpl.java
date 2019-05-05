package com.haruspring.dynamodb.local.domain.service.impl;

import com.haruspring.dynamodb.local.domain.model.User;
import com.haruspring.dynamodb.local.domain.service.UserService;
import com.haruspring.dynamodb.local.repository.UserDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserDAO userDAO;

  @Override
  public User addUser(User user) {
    return userDAO.save(user);
  }

  @Override
  public List<User> listUser() {
    List<User> result = (List<User>) userDAO.findAll();
    return result;
  }
}
