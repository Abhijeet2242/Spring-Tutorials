package com.example.Spring.Controller;

import com.example.Spring.model.User;
import com.example.Spring.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HateosController {
    @Autowired
    User user;
    @GetMapping("/addUser")
    public ResponseEntity<UserResponse> addUer() {
        User userEntity = user.getUser();
        UserResponse userResponse = new UserResponse();
        userResponse.setId(userEntity.id);
        userResponse.setName(userEntity.name);
        userResponse.setVerified(true);

        Link verifyLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(HateosController.class)
                        .verifyUser(userResponse.getId()))
                .withRel("verify");

        //anotheter way
        Link verifyLink2 = Link.of("/api/sms-verify-finish2/" + userResponse.getId())
                        .withRel("verify")
                        .withType("Post");

        userResponse.addLink(verifyLink);
        userResponse.addLink(verifyLink2);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }
    @GetMapping("/sms-verify-finish/{id}")
    public ResponseEntity<String> verifyUser(@PathVariable int id) {
        return ResponseEntity.ok("User " + id + " verified successfully.");
    }


}
