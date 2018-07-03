package com.dibrova.service;

import com.dibrova.entity.Company;

import java.util.List;
/**
 * @author Volodymyr Dibrova
 */

public interface CompanyService {
    Company findCompanyById(Integer id);

    List<Company> findAllCompanies();

    Company addCompany(Company company);

    void deleteCompanyById(int id);

}
