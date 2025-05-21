package com.example.Spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {
    @RequestMapping(path = "/fetchUser", method = RequestMethod.GET)
    @ResponseBody
   public String getUserDetails(@RequestParam(name = "firstName") String firstName,
                                @RequestParam(name = "lastName", required = false) String lastName,
                                @RequestParam(name = "age") int age) {
       return "firstName : " + firstName + " " + "lastName : " +lastName;
   }

   @ResponseBody
   @RequestMapping(path = "/getAddress", method = RequestMethod.GET)
   public String getAddress() {
       return  "Upper rajiv Gandhi nagar";
   }
}
