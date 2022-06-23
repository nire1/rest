package ru.home.rest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "department")
public class Department {
    @Id
    private Long id;

    @Column(name = "name"
    ,unique = true)
    private String name;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "upId")
    private Long upId;

    public Department(Long id, String name, Date createDate, Long upId) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.upId = upId;
    }

    @OneToMany(mappedBy = "department")
   // @JoinColumn(name = "user_id")
    private List<Employee> employee;
}
