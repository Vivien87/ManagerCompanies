package com.dibrova.service;

import com.dibrova.dao.DepartmentDao;
import com.dibrova.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author Volodymyr Dibrova
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentDao departmentDao;

    @Override
    public Department addDepartment(Department department) {
        return departmentDao.save(department);
    }

    @Override
    public void deleteDepartmentById(int id) {
           departmentDao.deleteById(id);
    }
}
