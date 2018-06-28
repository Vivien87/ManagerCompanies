package com.dibrova;

import com.dibrova.dao.CompanyDao;
import com.dibrova.entity.Company;
import com.dibrova.service.CompanyService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class CompanyServiceTest {

    private static final int ID = 12345;
    private static final String NAME = "Tested Company";
    @InjectMocks
    CompanyService companyService;
    @Mock
    CompanyDao companyDao;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
     @Test
    public void getCompanyByIdTest(){
         Company companyToSave =new Company();
         companyToSave.setNameCompany(NAME);
         companyToSave.setId(ID);
//         Mockito.when(companyDao.findById(ID)).thenReturn(companyToSave);
         Company companyById =companyService.findUserById(ID);
         Assert.assertEquals(NAME,companyById.getNameCompany());
    }

    public void addCompanyTestSize(){
        List<Company>companies=new ArrayList<>();
        Company companyToSave=new Company();
        companyToSave.setNameCompany(NAME);
        companyToSave.setId(ID);
        companies.add(companyToSave);
       Mockito.when(companyDao.findAll()).thenReturn(companies);
        Assert.assertEquals(1,companyService.findAllCompanies().size());

    }
}
