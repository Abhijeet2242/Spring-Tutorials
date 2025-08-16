package com.example.Spring.entity;

import com.example.Spring.model.ConsumerDetailsCk;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

// in this we are looking composite primary key and Implementation

//1. @Idclass and Id
//2. @EmbeddedClass and Embedded  -> for this approach  add annotation @Embeddle COnsumerDetailsCk  ans
@Table(name = "consumer") // here we have schemas, unique constraints
@IdClass(ConsumerDetailsCk.class)
@Entity
public class Consumer {

    private int id;
    @Id
    private String email;


    private String name;

    @Id
    private String mobileNumber;

    // here use
    // @EmbeddedId
    //ConsumeDetailsCK consumeDetailCk

    public Consumer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
