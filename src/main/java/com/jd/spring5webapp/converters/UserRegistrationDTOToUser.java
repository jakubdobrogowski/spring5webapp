package com.jd.spring5webapp.converters;

import com.jd.spring5webapp.domain.User.User;
import com.jd.spring5webapp.dtos.UserRegistrationDTO;
import org.apache.commons.codec.digest.DigestUtils;

public class UserRegistrationDTOToUser {


    public static User convert(UserRegistrationDTO userRegistrationDTO) {


        User user = new User.UserBuilder()
                .setFirstName(userRegistrationDTO.getFirstName())
                .setLastName(userRegistrationDTO.getLastName())
                .setEmail(userRegistrationDTO.getEmail())
                .setPasswordHash(DigestUtils.sha512Hex(userRegistrationDTO.getPassword()))
                .setUserAddress(userRegistrationDTO.getUserAddress())
                .build();

        return user;
    }
}
