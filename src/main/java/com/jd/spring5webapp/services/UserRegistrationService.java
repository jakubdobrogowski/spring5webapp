package com.jd.spring5webapp.services;

import com.jd.spring5webapp.dtos.UserRegistrationDTO;

public interface UserRegistrationService {

    void registerUser(UserRegistrationDTO userRegistrationDTO);
}
