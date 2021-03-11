package com.university.domain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teachers")
@Getter
@Setter
public class TeacherModel {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "subjects")
    private String subject;
}
