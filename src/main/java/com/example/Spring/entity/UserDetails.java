package com.example.Spring.entity;

import com.example.Spring.dto.UserDetailsDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "db_seq_name", initialValue = 10, allocationSize = 2) // this is more optimised than
    private Long id;
    private String name;
    private String email;


    // default it is eagerly loading
    //make it lazy using fetchTYpe -> then git gives some not found error as jackson don't know about data
    //at serialization type
    // solution 1) use @JsonIgnore  2) create DTO
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    //@JsonIgnore
    private UserAddress userAddress;

    public UserDetails() {
    }

    public UserDetailsDTO toDTO() {
        return new UserDetailsDTO(this);
    }

    public UserDetails(String name, String email, UserAddress userAddress) {
        this.name = name;
        this.email = email;
        this.userAddress = userAddress;
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

    public UserAddress getUserAddress() { return userAddress; }
    public void setUserAddress(UserAddress userAddress) { this.userAddress = userAddress; }
}
