package ru.home.rest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "employee")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "sex")
    private String sex;
    @Column(name = "date_birth")
    private Date dateBirth;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "date_of_first_day")
    private Date dateOfFirstDay;
    @Column(name = "date_of_last_day")
    private Date dateOfLastDay;
    @Column(name = "position")
    private String position;
    @Column(name = "salary")
    private BigDecimal salary;


   @ManyToOne
   private Department department;



}
