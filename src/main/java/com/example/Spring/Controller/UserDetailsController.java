package com.example.Spring.Controller;

import com.example.Spring.dto.UserDetailsDTO;
import com.example.Spring.entity.UserDetails;
import com.example.Spring.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserDetailsController {

    @Autowired
    UserDetailsService userDetailsService;

//    @PostMapping("/store-user")
//    public void saveInDB(@RequestParam(name = "name") String name,
//                         @RequestParam(name = "email") String email) {
//        UserDetails userDetails = new UserDetails(name, email);
//        userDetailsService.saveUser(userDetails);
//    }

    @GetMapping("/get-users")
    public List<UserDetails> getAllUsers() {
        return  userDetailsService.getAll();
    }

    @PostMapping("/save-using-onetoone")
    public UserDetails saveDetails(@RequestBody UserDetails userDetails){
        return userDetailsService.saveUserUsingOneToOne(userDetails);
    }
    @GetMapping("/find-by-id/{id}")
    public UserDetailsDTO findById(@PathVariable Long id) {
        return userDetailsService.findById(id).toDTO();
    }
}
