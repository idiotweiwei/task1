package com.idiot.jdbc.test;

import java.util.List;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.idiot.jdbc.dao.IUserDAO;
import com.idiot.jdbc.model.User;


public class UserTest {

    @Test
    public void  testaddUser(){
        User user = new User();
        user.setUsername("liu");
        user.setPassword("6");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDAO dao = (IUserDAO) ctx.getBean("userDao");
        dao.addUser(user);
    }

    @Test
    public void testdeleteUser(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDAO dao = (IUserDAO) ctx.getBean("userDao");
        dao.deleteUser(1);
    };

    @Test
    public void testupdateUser(){
        User user = new User();
        user.setId(1);
        user.setUsername("idiot");
        user.setPassword("123456");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDAO dao = (IUserDAO) ctx.getBean("userDao");
        dao.updateUser(user);
    };
    @Test
    public void testsearchUserName(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDAO dao = (IUserDAO) ctx.getBean("userDao");
        String  username = dao.searchUserName(2);
        System.out.println(username);
    };
    @Test
    public void testsearchUser(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDAO dao = (IUserDAO) ctx.getBean("userDao");
        User  u = dao.searchUser(2);

        System.out.println(u.toString());

    };
    @Test
    public void testfindAll(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDAO dao = (IUserDAO) ctx.getBean("userDao");
        List<User>  u = dao.findAll();
        for (User user : u) {
            System.out.println(user.toString());
        }

    };
}