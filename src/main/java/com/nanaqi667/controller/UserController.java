package com.nanaqi667.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/user")
@RestController
public class UserController {
    @GetMapping(path = "/api")
    public String api() {
        return "success";
    }
}
