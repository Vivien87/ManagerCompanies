package com.dibrova.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
/**
 * @author Volodymyr Dibrova
 */

@Entity
@Table(name="USER")
public class User extends AbstractModelClass implements Serializable {



    //ім’я, прізвище, дата народження, посада
    @Column(name="name")
    private String name;
    @Column(name="lastname")
    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date date_Of_Birth;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user", fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonManagedReference
    private List<Department> departments = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user", fetch = FetchType.LAZY,orphanRemoval = true)
    @JsonManagedReference
     private Position position ;


    public User() {
    }


    public User(int id, String name, String lastName, Date dateOfBirth) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.date_Of_Birth = dateOfBirth;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return date_Of_Birth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.date_Of_Birth = dateOfBirth;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


}
