package com.example.Spring.dto;

import com.example.Spring.entity.UserDetails;

public class UserDetailsDTO {

    private Long id;

    private String name;

    private  String email;

    private String address;

    public UserDetailsDTO(UserDetails userDetails) {
        this.id = userDetails.getId();
        this.name = userDetails.getName();
        this.email = userDetails.getEmail();
        System.out.println("going to query for userAddress");
        this.address = userDetails.getUserAddress() != null ? userDetails.getUserAddress().getStreet() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
