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
    @Column(name="name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name_Department) {
        this.name = name_Department;
    }


    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "USER_ID"))
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "company_id",
            foreignKey = @ForeignKey(name = "COMPANY_ID"))
    @JsonBackReference
    private Company company;



//    @JoinColumn(name = "user_id",
//            referencedColumnName ="id" )
/*@OneToMany(cascade = CascadeType.ALL, mappedBy = "department", fetch = FetchType.LAZY,orphanRemoval = true)
@JsonManagedReference
private Set<User> user=new HashSet<>();*/
}
