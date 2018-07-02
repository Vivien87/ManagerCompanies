package com.dibrova.service;

import com.dibrova.dao.UserDao;
import com.dibrova.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserServiceTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private UserDao userDao;

    private User expectedUser;
    private int expectedAlluserslistSize;
    private Date testDate;
    private int expecteduserID;
    private static final int ID = 12345;
    private static final String NAME = "Tested User";

    @Before
    public void setUp() {
        testDate = Date.valueOf(LocalDate.of(1987, 1, 1));
        expectedAlluserslistSize = 8;
        expectedUser = new User(2, "Vivi", "Dibrova", testDate,"Doctor");
    }

    @Test
    public void getAllUsersIfRequestedAllusers() {
        List<User> users = userDao.findAll();
        Assert.assertEquals(expectedAlluserslistSize, users.size());
    }

    @Test
    public void getUserByIdIfRequestedById() {
        userDao.save(expectedUser);
        expecteduserID = expectedUser.getId();
        Optional<User> optionalUser = userDao.findById(expecteduserID);
        User actual = optionalUser.get();
        Assert.assertEquals(expectedUser, actual);
    }


}
