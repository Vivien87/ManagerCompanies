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

    @Column(name = "NAME", nullable = false)
    private String name;

    public Company() {
        super();
    }

    public Company(String name) {
        super();
        this.name = name;

    }


    public String getNameCompany() {
        return name;
    }

    public void setNameCompany(String nameCompany) {
        this.name = name;
    }

//    @OneToMany
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JoinColumn(name = "user_id",
//            foreignKey = @ForeignKey(name = "USER_ID"))
//    private User user;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "company", fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonManagedReference
    private Set<Department> departments = new HashSet<>();

    public void setDepartments(Set<Department> departments) {
        this.departments.clear();
        if (departments != null) {
            this.departments.addAll(departments);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Department> getDepartments() {
        return departments;
    }
}
