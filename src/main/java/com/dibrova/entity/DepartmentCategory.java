package com.dibrova.entity;
/**
 * @author Volodymyr Dibrova
 */
public enum DepartmentCategory {
    IT,LEGAL,HR,FINANCE;

    @Override
    public String toString() {
        return   name();
    }

//    @Column(name="name")
//    String name;
//
//    @ManyToOne
//    @JoinColumn(name = "department_id",
//            foreignKey = @ForeignKey(name = "DEPARTMENT_ID"))
//    @JsonBackReference
//    private Department department;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

}
