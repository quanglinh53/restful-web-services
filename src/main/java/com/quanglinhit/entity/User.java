package com.quanglinhit.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@ApiModel(description = "all details user.")
//@Entity
public class User {
//    @Id
//    @GeneratedValue
    private Integer id;

    @Size(min = 4, message = "Name should have atleast 2 charactors")
    @ApiModelProperty(notes = "Name should have atleast 2 charactors")
    private String name;

    @Past
    @ApiModelProperty(notes = "Birthday should be inthe past")
    private Date birthday;

//    @ApiModelProperty definitions.User.description

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{ id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public User(int id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }
}
