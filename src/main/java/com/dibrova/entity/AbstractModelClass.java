package com.dibrova.entity;

import javax.persistence.*;

@MappedSuperclass
public class AbstractModelClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    public Integer getId() {
        return this.id;
    }


    public void setId(Integer id) {
        this.id = id;
    }




;
}


