package com.ming.authservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
@RequestMapping("/auth")
public class AuthController {

    /**
     * 获取当前用户
     * @param principal
     * @return
     */
    @GetMapping(value = "/current")
    public Principal getUser(Principal principal) {
        return principal;
    }

}