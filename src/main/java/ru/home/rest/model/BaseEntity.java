package ru.home.rest.model;

import lombok.Data;


import javax.persistence.*;


@Data
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



}
