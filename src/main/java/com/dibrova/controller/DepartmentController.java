package com.dibrova.controller;

import com.dibrova.dao.DepartmentDao;
import com.dibrova.entity.Company;
import com.dibrova.entity.Department;
import com.dibrova.exception.CompanyNotFoundException;
import com.dibrova.exception.DepartmentNotFoundException;
import com.dibrova.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
/**
 * @author Volodymyr Dibrova
 */
@RestController
public class DepartmentController {
     @Autowired
     DepartmentDao departmentDao;
      @Autowired
     DepartmentService departmentService;

    private static Logger logger = LoggerFactory.getLogger(Company.class);

    @GetMapping(value= Endpoints.DEPARTMENTS, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findAllCompanies() throws CompanyNotFoundException {
        List<Department> departments = departmentDao.findAll();

        return new ResponseEntity<>(departments, HttpStatus.OK);

    }

        @GetMapping(value=Endpoints.DEPARTMENT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Department retrieveDepartment(@PathVariable int id) {
        Optional<Department> department = departmentDao.findById(id);
        if (!department.isPresent())
            throw new DepartmentNotFoundException("id-" + id);


        return department.get();
    }

    @PostMapping(value =Endpoints.DEPARTMENT_CREATE , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createDepartment(@RequestBody Department department) {
        Department savedDepartment = departmentService.addDepartment(department);
        logger.info("created department");
        return new ResponseEntity<>(savedDepartment,HttpStatus.OK);
    }

    @DeleteMapping(value=Endpoints.DEPARTMENT , produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCompany(@PathVariable int id) {
        departmentService.deleteDepartmentById(id);
        logger.info(id + "was delete");
    }

}
