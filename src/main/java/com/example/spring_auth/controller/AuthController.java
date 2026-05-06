package com.example.spring_auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class AuthController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin() {
        return "Hello admin";
    }

    @GetMapping("/customer")
    @PreAuthorize("hasRole('CUSTOMER')")
    public String cust() {
        return "Hello customer";
    }

    @GetMapping("/SuperAdmin")
    @PreAuthorize("hasRole('SUPER_ADMIN')")
    public String superAdmin() {
        return "Hello superAdmin";
    }

    @GetMapping("/guest")
    @PreAuthorize("hasRole('GUEST')")
    public String guest() {
        return "Hello guest";
    }



}
