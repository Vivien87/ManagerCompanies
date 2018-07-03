package com.dibrova.service;

import com.dibrova.entity.Department;

/**
 * @author Volodymyr Dibrova
 */
public interface  DepartmentService  {


    Department addDepartment(Department department);
    void deleteDepartmentById(int id);
}
