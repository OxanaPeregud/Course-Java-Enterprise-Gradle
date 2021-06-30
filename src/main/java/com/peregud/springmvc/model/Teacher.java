package com.peregud.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Course course;

    @OneToMany(mappedBy = "teacher")
    private Set<StudentResult> studentResults = new HashSet<>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Admin admin;
}
