package com.dibrova.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="user")
public class User extends AbstractModelClass implements Serializable {

    //ім’я, прізвище, дата народження, посада
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "LASTNAME", nullable = false)
    private String lastname;

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_OF_BIRTH", nullable = false)
    private Date date_Of_Birth;

    @Column(name="position_id")
    private String position;


    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Department  department;


    public User() {
    }

    public User(int id, String name, String lastName, Date dateOfBirth, String position) {
        super();
        this.id = id;
        this.name = name;
        this.lastname = lastName;
        this.date_Of_Birth = dateOfBirth;
        this.position = position;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public Date getDateOfBirth() {
        return date_Of_Birth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.date_Of_Birth = dateOfBirth;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDate_Of_Birth() {
        return date_Of_Birth;
    }

    public void setDate_Of_Birth(Date date_Of_Birth) {
        this.date_Of_Birth = date_Of_Birth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //    @Enumerated(EnumType.STRING)
//    @Type(type = "org.hibernate.type.EnumType")
//    private Position position_User;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user",orphanRemoval = true)



}
