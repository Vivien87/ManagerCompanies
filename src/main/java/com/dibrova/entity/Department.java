package com.dibrova.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * @author Volodymyr Dibrova
 */

@Entity
@Table(name="department")
public class Department extends AbstractModelClass implements Serializable {





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

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "department", fetch = FetchType.LAZY,orphanRemoval = true)
//    @JsonManagedReference
//    private List<DepartmentCategory> departmentCategories = new ArrayList<>();

    @Column(name = "department_category")
    @Enumerated(EnumType.STRING)
    private DepartmentCategory departmentCategory;



    public DepartmentCategory getDepartmentCategory() {
        return departmentCategory;
    }

    public void setDepartmentCategory(DepartmentCategory departmentCategory) {
        this.departmentCategory = departmentCategory;
    }
}
