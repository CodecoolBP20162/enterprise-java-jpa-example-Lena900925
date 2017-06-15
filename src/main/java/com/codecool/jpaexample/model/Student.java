package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "dateOfBirth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Transient
    private long age;

    @ElementCollection
    @CollectionTable(
            name="Phone",
            joinColumns=@JoinColumn(name="student_id")
    )

    @Column(name = "phoneNumbers")
    private List<String> phoneNumbers;

    @OneToOne
    private Address address;

    public Student() {
    }

    public Student(String name, String email, Date dateOfBirth, List<String> phoneNumbers) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = (Calendar.getInstance().getTimeInMillis() - dateOfBirth.getTime())
                / (60L * 60L * 1000L * 24L * 365L);
        this.phoneNumbers = phoneNumbers;
    }

    public Student(String name, String email, Date dateOfBirth, Address address, List<String> phoneNumbers) {
        this(name, email, dateOfBirth, phoneNumbers);
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getPhoneNumbers(){ return phoneNumbers;}

    public void setPhoneNumbers(List<String> phoneNumbers){ this.phoneNumbers = phoneNumbers; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address id=" + address.getId() +
                ", phone numbers=" + phoneNumbers +
                '}';
    }

}
