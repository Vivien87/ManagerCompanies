package com.dibrova.controller;


import com.dibrova.dao.CompanyDao;
import com.dibrova.entity.Company;
import com.dibrova.exception.CompanyNotFoundException;
import com.dibrova.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;
    @Autowired
    CompanyDao companyDao;

    private static Logger logger = LoggerFactory.getLogger(Company.class);

    @GetMapping(Endpoints.COMPANIES)
    public ResponseEntity<Object> findAllCompanies() throws CompanyNotFoundException {
        List<Company> companies = companyService.findAllCompanies();
        return new ResponseEntity<>(companies, HttpStatus.OK);


    }

    @GetMapping(Endpoints.COMPANY)
    public Company retrieveCompany(@PathVariable int id) {
        Optional<Company> company = companyDao.findById(id);
        if (!company.isPresent())
            throw new CompanyNotFoundException("id-" + id);
        return company.get();
    }

    @PostMapping(Endpoints.COMPANIES)
    public ResponseEntity<Object> createCompany(@RequestBody Company company) {
        Company savedCompany = companyService.addCompany(company);
        logger.info("Successfully creted");
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedCompany.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping(Endpoints.COMPANY)
    public ResponseEntity<Object> updateCompany(@RequestBody Company company, @PathVariable int id) {
        Optional<Company> companyOptional = companyDao.findById(id);
        if (!companyOptional.isPresent()) return ResponseEntity.notFound().build();
        company.setId(id);
        companyDao.save(company);
        logger.info(id + " " + "sucssesfully updated");
        return ResponseEntity.noContent().build();
    }

    @GetMapping(Endpoints.COMPANY + "delete/{id}")
    public void deleteCompany(@PathVariable int id) {
        companyService.deleteCompanyById(id);
        logger.info(id + "was delete");
    }


}
