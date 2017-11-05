package com.yoga.gym.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cimbonda on 11/5/2017.
 */
@RestController
public class HomeController {

    @RequestMapping("")
    public String home() {
        return "Welcome to Mitre's & Cimps project!";
    }
}
