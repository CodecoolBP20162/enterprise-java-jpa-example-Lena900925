package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Class")
public class Klass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    @Enumerated(EnumType.STRING)
    private CCLocation ccLocation;

    @OneToMany (mappedBy = "address")
    private Set<Student> students = new HashSet<>();

    public Klass() {}

    public Klass(String name, CCLocation ccLocation) {
        this.name = name;
        this.ccLocation = ccLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CCLocation getCcLocation() { return ccLocation; }

    public void setCcLocation(CCLocation ccLocation) { this.ccLocation = ccLocation; }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

}
