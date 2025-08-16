package com.example.Spring.service;

import com.example.Spring.entity.UserDetails;
import com.example.Spring.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {
    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void saveUser(UserDetails us) {
        userDetailsRepository.save(us);
    }

    public List<UserDetails> getAll() {
       return userDetailsRepository.findAll();
    }

    public UserDetails saveUserUsingOneToOne(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    public UserDetails findById(Long id){
        return userDetailsRepository.findById(id).get();
    }
}
