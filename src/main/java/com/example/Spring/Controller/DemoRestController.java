package com.example.Spring.Controller;

import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class DemoRestController {
    @InitBinder
    public  void initBinder(DataBinder binder) {
        binder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditor());
    }
    @GetMapping("/getName")  // used for creating getApi
    public String getUserName(@RequestParam(name = "firstName") String firstName,
                              @RequestParam(name = "lastName", required = false) String lastName,
                              @RequestParam(name = "age") int age) {
        return firstName + " " + lastName + " " + age;
    }
    @PostMapping("/saveUser/{firstName}")
    public String saveUserName(@PathVariable String firstName) {
        return "Path variable set Successfulluy : " + firstName;
    }



}
