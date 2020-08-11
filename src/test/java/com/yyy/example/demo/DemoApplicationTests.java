package com.yyy.example.demo;

import com.yyy.example.dao.UserDao;
import com.yyy.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    UserDao userDao;
    @Test
    public void contextLoads() {
        System.out.println("#####start");
        User user = new User();
        user.setAddress("tttt");
        user.setAge(21);
        user.setName("rrrr");
        user.setPassword("ererwer");
        //user.setId("addsd");
        userDao.insertSelective(user);
        System.out.println("#####end");
    }

}
