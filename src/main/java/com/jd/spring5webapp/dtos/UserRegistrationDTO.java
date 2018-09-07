package com.jd.spring5webapp.dtos;

import com.jd.spring5webapp.domain.User.UserAddress;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationDTO {

    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private UserAddress userAddress;
}
