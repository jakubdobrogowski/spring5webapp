package com.jd.spring5webapp.repository;

import com.jd.spring5webapp.domain.User.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByEmail(String email);
}
