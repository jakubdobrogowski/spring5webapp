package com.jd.spring5webapp.services;

import com.jd.spring5webapp.converters.UserRegistrationDTOToUser;
import com.jd.spring5webapp.daos.UserDAO;
import com.jd.spring5webapp.domain.User.User;
import com.jd.spring5webapp.exeptions.UserExistsExeption;
import com.jd.spring5webapp.repository.UserRepository;
import com.jd.spring5webapp.dtos.UserRegistrationDTO;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    private UserDAO userDAO;
    private UserRepository userRepository;

    public UserRegistrationServiceImpl(UserDAO userDAO, UserRepository userRepository) {
        this.userDAO = userDAO;
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(UserRegistrationDTO userRegistrationDTO) {

        if (userRepository.findUserByEmail(userRegistrationDTO.getEmail()) != null) {

            throw new UserExistsExeption("Użytkownik o podanym mailu istnieje");
        }

        User user = UserRegistrationDTOToUser.convert(userRegistrationDTO);

        userRepository.save(user);
    }

}
