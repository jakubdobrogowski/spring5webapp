package com.jd.spring5webapp.daos;

import com.jd.spring5webapp.domain.User.User;
import com.jd.spring5webapp.repository.UserRepository;
import com.jd.spring5webapp.exeptions.UserNotExistsException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Service
public class UserDAO {

    UserRepository userRepository;

    public UserDAO(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserByEmail(String email) {

        Supplier<UserNotExistsException> exceptionSupplierUserNotExistsException =
                () -> new UserNotExistsException("Użytkownik Nie Istnieje");

        List<User> users = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            users.add(user);
        }



        return users.stream()
                .filter(e -> e.getEmail().equals(email))
                .findFirst()
                .orElseThrow(exceptionSupplierUserNotExistsException);
    }
}
