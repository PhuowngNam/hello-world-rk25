package com.vti.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", length = 255)
    private String username;

    @OneToMany(mappedBy = "user")
    private List<Address> addressList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User id(Integer id) {
        this.id = id;
        return this;
    }

    public User username(String username) {
        this.username = username;
        return this;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", addressList=" + addressList +
            '}';
    }

    public User addressList(List<Address> addressList) {
        this.addressList = addressList;
        return this;
    }
}
