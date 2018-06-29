package com.dibrova.service;

import com.dibrova.entity.Company;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CompanyService {
    Company findUserById(Integer id);
    List<Company> findAllCompanies();
    Company addCompany (Company company);
    void deleteCompanyById(int id);

}
