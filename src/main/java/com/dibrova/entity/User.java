package com.dibrova.entity;

import com.dibrova.entity.type.Position;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class User extends AbstractModelClass  implements Serializable {

    //ім’я, прізвище, дата народження, посада

    private String name;

    private String lastName;

    public User() {
    }

    public User(int id ,String name, String lastName, Date dateOfBirth, Position positionUser) {
        super();
        this.id=id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.positionUser = positionUser;
    }

    public User(int id ,String name, String lastName, Date dateOfBirth) {
        super();
        this.id=id;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

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
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    @Enumerated(EnumType.STRING)
    @Type(type = "org.hibernate.type.EnumType")
    private Position positionUser;

//    @ManyToOne
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JoinColumn(name = "department_id",
//            foreignKey = @ForeignKey(name = "DEPARTMENT_ID"))
//    private Department department;
//
//
//    @ManyToOne
//    @JoinColumn(name="company_id",referencedColumnName = "id")
//    private Company company;
}
