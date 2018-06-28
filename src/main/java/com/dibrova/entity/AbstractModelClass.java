package com.dibrova.entity;

import javax.persistence.*;

@MappedSuperclass
public class AbstractModelClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Version
    private Integer version;



    public Integer getId() {
        return this.id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }


;
}


