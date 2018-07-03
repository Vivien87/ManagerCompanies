package com.dibrova.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="user")
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

    @Column(name="position_id")
    private String positionType;

    public User() {
    }


    public User(int id, String name, String lastName, Date dateOfBirth, String position) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.date_Of_Birth = dateOfBirth;
        this.positionType = position;
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
    public String getPosition() {
        return positionType;
    }

    public void setPosition(String position) {
        this.positionType = position;
    }



}
