package com.dibrova.controller;


import com.dibrova.entity.Company;
import com.dibrova.exception.CompanyNotFoundException;
import com.dibrova.service.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class CompanyController {

     @Autowired
    CompanyService companyService;
     private static Logger logger = LoggerFactory.getLogger(Company.class);

     @GetMapping(Endpoints.COMPANIES)
     public ResponseEntity<Object> findAllCompanies() throws CompanyNotFoundException {
         ResponseEntity<Object> companiesResponseEntity = new ResponseEntity<>(companyService.findAllCompanies(),HttpStatus.OK);
         return companiesResponseEntity;
     }

@PostMapping(Endpoints.COMPANIES+"/ save")
 public ResponseEntity<Object> saveOrUpdateCompany(@RequestBody Company company, @RequestParam("id") String id, @RequestParam("nameCompany")String nameCompany){

   if(!id.isEmpty()){
       company=(Company)companyService.findUserById(Integer.parseInt(id));
   }else {
       company = new Company();
   }
    company.setNameCompany(nameCompany);
    company = companyService.addCompany(company);
    logger.info("Company successfully save");
   return new ResponseEntity<>(company,HttpStatus.OK);

 }


}
