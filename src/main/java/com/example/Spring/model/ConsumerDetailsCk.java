package com.example.Spring.model;

import java.io.Serializable;
import java.util.Objects;

public class ConsumerDetailsCk implements Serializable {

    private String email;
    private String mobileNumber;

    public ConsumerDetailsCk() {

    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof ConsumerDetailsCk consumerDetailsCk)) {
            return false;
        }
        return this.email.equals(consumerDetailsCk.email) && this.mobileNumber.equals(consumerDetailsCk.mobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, mobileNumber);
    }
}
