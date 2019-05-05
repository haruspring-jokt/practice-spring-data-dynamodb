package com.haruspring.dynamodb.local.repository;

import static org.junit.Assert.*;

import com.haruspring.dynamodb.local.domain.model.User;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {

  @Autowired private UserDAO dao;

  @Test
  public void countTest() {
    List<User> list = (List<User>) dao.findAll();
    assertEquals(4, list.size());
  }
}
