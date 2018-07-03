package com.dibrova.dao;

import com.dibrova.entity.Department;
import com.dibrova.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
/**
 * @author Volodymyr Dibrova
 */
@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer> {





}
