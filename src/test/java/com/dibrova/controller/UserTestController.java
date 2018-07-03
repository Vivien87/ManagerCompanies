package com.dibrova.controller;

import com.dibrova.dao.UserDao;
import com.dibrova.entity.Department;
import com.dibrova.entity.DepartmentCategory;
import com.dibrova.entity.Position;
import com.dibrova.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class UserTestController {

     @InjectMocks
    private UserController userController;
    @Mock
    private UserDao userDao;

    private MockMvc mockMvc;

    private List<User> users;
    private List<Department> departments;

    @Before
    public void setup (){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(userController)
                .build();
        users = new ArrayList<>();
        departments = new ArrayList<>();

        Department department = new Department();
        department.setId(2);
        department.setDepartmentCategory(DepartmentCategory.FINANCE);
        departments.add(department);

        Position position = new Position();
        position.setPosition("FINANCE");

        User user = new User();
        user.setId(2);
        user.setName("Vova");
        user.setLastName("dib");
        user.setDepartments(departments);
        user.setPosition(position);

    }

    @Test
    public void testAddUser () throws Exception {

        User user = new User();
        user.setName("Vova");
        user.setLastName("dib");

        ObjectMapper mapper = new ObjectMapper();
        String userAsJSON = mapper.writeValueAsString(user);
        this.mockMvc.perform(post("/users/")
                .content(userAsJSON).accept(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isCreated());
    }
    @Test
    public void testUpdateUserSuccess () throws Exception {

        User user = users.get(0);
        user.setLastName("dib");

        ObjectMapper mapper = new ObjectMapper();

        String userAsJSON = mapper.writeValueAsString(user);

        given(userDao.findById(123)).willReturn(java.util.Optional.ofNullable(user));
        this.mockMvc.perform(put("/users/1")
                .content(userAsJSON).accept(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isOk());
    }

    @Test
    public void testUpdateUserErrorUserId () throws Exception {

        User user = users.get(0);
        user.setId(2723);
        user.setDepartments(null);

        ObjectMapper mapper = new ObjectMapper();

        String userAsJSON = mapper.writeValueAsString(user);

        this.mockMvc.perform(put("/users/1")
                .content(userAsJSON).accept(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(status().isNotFound());
    }
}
