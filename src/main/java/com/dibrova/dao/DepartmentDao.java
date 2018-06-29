package com.dibrova.dao;

import com.dibrova.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

//List<>
}
