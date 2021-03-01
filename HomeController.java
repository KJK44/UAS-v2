package org.teamblack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET, value = "/logInUser/{username}/{password}")
    public String logInUser(@PathVariable("username") String username, @PathVariable("password") String password) {
        System.out.println("Username => " + username);
        System.out.println("Password => " + password);
        return "VALID";
    }

}
