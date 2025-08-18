package com.example.Spring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE,
region = "productDetailsCache")  // this is used for 2nd level cache
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class ProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String pName;
    private String description;

    @OneToOne(mappedBy = "oneToOneBidirectional", fetch = FetchType.EAGER)  // this is for oneto one bidirectional
    //@JsonBackReference // for preventing infinite loop in get call
    private OneToOneBidrectional oneToOneBidirectional;

    public ProductDetails() {
    }

    public ProductDetails(String pName, String description) {
        this.pName = pName;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
