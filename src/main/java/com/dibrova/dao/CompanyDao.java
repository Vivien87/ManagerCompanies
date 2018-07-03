package com.dibrova.dao;

import com.dibrova.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;
import java.util.List;
/**
 * @author Volodymyr Dibrova
 */
@Repository
@PersistenceContext
public interface CompanyDao extends JpaRepository<Company,Integer> {




}
