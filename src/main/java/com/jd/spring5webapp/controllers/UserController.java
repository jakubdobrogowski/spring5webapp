package com.jd.spring5webapp.controllers;

import com.jd.spring5webapp.dtos.UserLoginDTO;
import com.jd.spring5webapp.dtos.UserRegistrationDTO;
import com.jd.spring5webapp.services.UserContextHolder;
import com.jd.spring5webapp.services.UserLoginService;
import com.jd.spring5webapp.services.UserRegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserLoginService userLoginService;
    private UserContextHolder userContextHolder;
    private UserRegistrationService userRegistrationService;

    public UserController(UserLoginService userLoginService, UserContextHolder userContextHolder, UserRegistrationService userRegistrationService) {
        this.userLoginService = userLoginService;
        this.userContextHolder = userContextHolder;
        this.userRegistrationService = userRegistrationService;
    }

    @GetMapping({"/", "/home_page"})
    public String homepage() {

        return "homePage";
    }

    @GetMapping("/login")
    public String loginForm(Model model) {

        model.addAttribute("put", new UserLoginDTO());
        return "login";
    }

    @PostMapping("/login")
    public String loginEffect(@ModelAttribute UserLoginDTO userLoginDTO, Model model) {

        userLoginService.login(userLoginDTO);
        model.addAttribute("user", userContextHolder.getUserLoggedIn());
        return "loginEffect";
    }

    @GetMapping("/registration")
    public String registrationForm(Model model) {

        model.addAttribute("form", new UserRegistrationDTO());
        return "registration";
    }

    @PostMapping("/registration")
    public String registrationEffect(@ModelAttribute UserRegistrationDTO userRegistrationDTO, Model model) {

        userRegistrationService.registerUser(userRegistrationDTO);
        model.addAttribute("userRegistration", userRegistrationDTO);
        return "registrationEffect";
    }
}
