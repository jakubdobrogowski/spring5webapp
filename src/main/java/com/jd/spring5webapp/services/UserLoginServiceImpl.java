package com.jd.spring5webapp.services;

import com.jd.spring5webapp.domain.User.User;
import com.jd.spring5webapp.repository.UserRepository;
import com.jd.spring5webapp.dtos.UserLoginDTO;

import com.jd.spring5webapp.exeptions.PasswordNotCorrect;
import com.jd.spring5webapp.exeptions.UserNotExistsException;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;


@Service
public class UserLoginServiceImpl implements UserLoginService {

    UserRepository userRepository;
    UserContextHolder userContextHolder;

    public UserLoginServiceImpl(UserRepository userRepository, UserContextHolder userContextHolder) {
        this.userRepository = userRepository;
        this.userContextHolder = userContextHolder;
    }

    @Override
    public void login(UserLoginDTO userLoginDTO) {

        User user = userRepository.findUserByEmail(userLoginDTO.getEmail());

        if (user == null) {

            throw new UserNotExistsException("Użytkownik Nie Istnieje");
        }

        if (passwordIsNotCorrect(userLoginDTO, user)) {

            throw new PasswordNotCorrect("Hasło Niepoprawne");

        }
        userContextHolder.logInUser(user);
    }

    private boolean passwordIsNotCorrect(UserLoginDTO userLoginDTO, User user) {
        return !DigestUtils.sha512Hex(userLoginDTO.getPassword().trim()).equals(user.getPasswordHash());
    }


}
