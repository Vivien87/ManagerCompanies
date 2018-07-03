package com.dibrova.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
/**
 * @author Volodymyr Dibrova
 */
@Entity
@Table(name="POSITIONTYPE")
public class Position  extends AbstractModelClass {

    @Column(name="position")
    String position;

    @OneToOne
    @JoinColumn(name = "userid",
            foreignKey = @ForeignKey(name = "USERID"))
    @JsonBackReference
    private User user;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
