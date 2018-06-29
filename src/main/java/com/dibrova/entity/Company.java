package com.dibrova.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Table
@Entity
public class Company extends AbstractModelClass {

    private String nameCompany;

    public Company() {
        super();
    }

    public Company(String name) {
        super();
        this.nameCompany = name;

    }


    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

//    @OneToMany
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JoinColumn(name = "user_id",
//            foreignKey = @ForeignKey(name = "USER_ID"))
//    private User user;
}
