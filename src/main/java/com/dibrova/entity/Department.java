package com.dibrova.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Entity
public class Department extends  AbstractModelClass implements Serializable {

private String nameDepartment;

    public String getName() {
        return nameDepartment;
    }

    public void setName(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }
//    @ManyToOne
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JoinColumn(name = "company_id",
//            foreignKey = @ForeignKey(name = "COMPANY_ID"))
//    private Company company;
//
//
//    @ManyToOne
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JoinColumn(name = "user_id",
//            foreignKey = @ForeignKey(name = "USER_ID"))
//    private User user;
}
