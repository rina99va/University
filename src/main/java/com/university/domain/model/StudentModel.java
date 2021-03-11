package com.university.domain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "students")
public class StudentModel {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "tabNumber")
    private String tabNumber;

}
