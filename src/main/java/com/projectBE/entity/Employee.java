package com.projectBE.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    private long id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String created_at;

    public Employee(){

    }

    public Employee(String name, String phone, String email, String address, String created_at) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.created_at = created_at;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "phone", nullable = false)
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "address", nullable = false)
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "created_at")
    public String getCreated() {
        return created_at;
    }
    public void setCreated(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email
                + ", address=" + address + ", created_at=" + created_at + "]";
    }

}
