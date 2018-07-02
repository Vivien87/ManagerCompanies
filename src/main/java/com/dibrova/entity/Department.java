package com.dibrova.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="department")
public class Department extends AbstractModelClass implements Serializable {

    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name_Department) {
        this.name = name_Department;
    }

    @ManyToOne
    @JsonBackReference
    private Company company;



//    @JoinColumn(name = "user_id",
//            referencedColumnName ="id" )
@OneToMany(cascade = CascadeType.ALL, mappedBy = "department", fetch = FetchType.LAZY,orphanRemoval = true)
@JsonManagedReference
private Set<User> users=new HashSet<>();


    public void setUsers(Set<User> users) {
        this.users.clear();
        if (users != null) {
            this.users.addAll(users);
        }
    }
    public Set<User> getUsers() {
        return users;
    }
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }





    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + id +
                ", deptName='" + name + '\'' +
                '}';
    }
}
