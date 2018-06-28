package com.dibrova.service;

import com.dibrova.dao.CompanyDao;
import com.dibrova.entity.Company;
import com.dibrova.exception.CompanyNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompanyServiceImpl implements CompanyService {
           @Autowired
          CompanyDao companyDao;

    @Override
    public Company findUserById(Integer id) {
        Optional<Company> company = companyDao.findById(id);
        return company.orElseGet(company::get);
    }

    @Override
    public List<Company> findAllCompanies() {
      List<Company> companies = new ArrayList<>();
      companyDao.findAll().forEach(companies::add);

      if(companies.isEmpty()){
          throw new CompanyNotFoundException("No one company exists");
      }

        return companies;
    }

    @Override
    public Company addCompany(Company company) {
        return companyDao.save(company);
    }

    @Override
    public void deleteCompanyById(int id) {
        companyDao.deleteById(id);

    }

}
