package com.dibrova.dao;

import com.dibrova.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Volodymyr Dibrova
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {



}
