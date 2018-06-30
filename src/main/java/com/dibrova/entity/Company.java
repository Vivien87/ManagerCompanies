package com.dibrova.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="company")
public class Company extends AbstractModelClass {

    private String name_Company;

    public Company() {
        super();
    }

    public Company(String name) {
        super();
        this.name_Company = name;

    }


    public String getNameCompany() {
        return name_Company;
    }

    public void setNameCompany(String nameCompany) {
        this.name_Company = name_Company;
    }

//    @OneToMany
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JoinColumn(name = "user_id",
//            foreignKey = @ForeignKey(name = "USER_ID"))
//    private User user;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "company", fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonManagedReference
    private Set<Department> departments = new HashSet<>();




}
