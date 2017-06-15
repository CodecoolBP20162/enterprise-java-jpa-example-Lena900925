package com.codecool.jpaexample.model;

import javax.persistence.*;


@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "country")
    private String country;

    @Column(name = "Zip", length = 4)
    private String Zip;

    @Column(name = "city")
    private String city;

    @Column(name = "addr")
    private String addr;

    public Address() {
    }

    public Address(String country, String Zip, String city, String addr) {
        this.country = country;
        this.Zip = Zip;
        this.city = city;
        this.addr = addr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return Zip;
    }

    public void setZipcode(String zipcode) {
        this.Zip = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", Zip='" + Zip + '\'' +
                ", city='" + city + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

}
