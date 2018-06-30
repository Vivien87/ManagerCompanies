package com.dibrova.controller;

import com.dibrova.dao.UserDao;
import com.dibrova.entity.User;
import com.dibrova.exception.UserNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {


    @Autowired
    private UserDao userDao;

    Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping(Endpoints.USERS)
    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    @GetMapping(Endpoints.USER)
    public User findUser(@PathVariable int id) {
        Optional<User> user = userDao.findById(id);

        if (!user.isPresent()) throw new UserNotFoundException("id-" + id);
        return user.get();
    }

    @DeleteMapping(Endpoints.USER)
    public void deleteStudent(@PathVariable int id) {
        userDao.deleteById(id);
    }

    @PostMapping(Endpoints.USER_CREATE)
    public ResponseEntity<Object> createUser(@RequestBody User user) {

        user = userDao.save(user);
        log.info("User was save in H2");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping(Endpoints.USER)
    public ResponseEntity<Object> updateUser(@RequestBody User user, @PathVariable int id) {

        Optional<User> userOptional = userDao.findById(id);
        if (!userOptional.isPresent()) return ResponseEntity.notFound().build();

        user.setId(id);
        userDao.save(user);

        return ResponseEntity.noContent().build();
    }

//    @GetMapping("/vivi")
//    public String  userdep(){
//
//        return
//    }
}
