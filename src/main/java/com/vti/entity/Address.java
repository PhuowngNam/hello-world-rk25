package com.vti.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "street", length = 255)
    private String street;

    @Column(name = "city", length = 255)
    private String city;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address id(Integer id) {
        this.id = id;
        return this;
    }

    public Address street(String street) {
        this.street = street;
        return this;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    public Address user(User user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return "Address{" +
            "id=" + id +
            ", street='" + street + '\'' +
            ", city='" + city + '\'' +
            '}';
    }
}
