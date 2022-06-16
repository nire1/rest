package ru.home.rest.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "employee")
public class Employee extends BaseEntity{

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "sex")
    private String sex;
    @Column(name = "date_birth")
    private Date date_birth;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;


}
