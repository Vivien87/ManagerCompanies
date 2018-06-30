package com.dibrova.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="user")
public class User extends AbstractModelClass implements Serializable {

    //ім’я, прізвище, дата народження, посада

    private String name;

    private String last_Name;

    @Temporal(TemporalType.DATE)
    private Date date_Of_Birth;


    public User() {
    }

//    public User(int id, String name, String lastName, Date dateOfBirth, Position positionUser) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.last_Name = lastName;
//        this.date_Of_Birth = dateOfBirth;
//        this.position_User = positionUser;
//    }

    public User(int id, String name, String lastName, Date dateOfBirth) {
        super();
        this.id = id;
        this.name = name;
        this.last_Name = lastName;
        this.date_Of_Birth = dateOfBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return last_Name;
    }

    public void setLastName(String lastName) {
        this.last_Name = lastName;
    }

    public Date getDateOfBirth() {
        return date_Of_Birth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.date_Of_Birth = dateOfBirth;
    }



//    @Enumerated(EnumType.STRING)
//    @Type(type = "org.hibernate.type.EnumType")
//    private Position position_User;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user",orphanRemoval = true)
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Department  department;


}
