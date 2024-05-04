package com.Prasanth.CarRental.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="User_reg")
@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
public class UserRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private long userId;
    @Column (nullable = false)
    private String name;
    @Column(unique=true,nullable = false)
    private String email;
    @Column(unique=true,nullable = false)
    private String phone;
    private String gender;
    @Column (nullable = false)
    private String address;
    @Column(unique=true,nullable = false)
    private String password;

    @OneToMany(mappedBy = "userRegister")
    private List<Rental> rentals;

    public UserRegister(String name, String email, String phone, String gender, String address, String password) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.password = password;

    }

    public UserRegister() {

    }

    public long getId() {
        return userId;
    }

    public void setId(long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
