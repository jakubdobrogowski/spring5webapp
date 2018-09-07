package com.jd.spring5webapp.services;

import com.jd.spring5webapp.domain.User.User;
import com.jd.spring5webapp.dtos.UserLoggedInDTO;
import org.springframework.stereotype.Service;

@Service
public class UserContextHolder {

    private UserLoggedInDTO userLoggedInDTO;

    public  void logInUser(User user) {
        userLoggedInDTO = new UserLoggedInDTO(user.getEmail());
    }

    public  String getUserLoggedIn() {
        return userLoggedInDTO == null ? null : userLoggedInDTO.getLogin();
    }
}
