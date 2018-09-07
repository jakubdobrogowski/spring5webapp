package com.jd.spring5webapp.domain.User;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;

    private String firstName;

    private String lastName;

    private String passwordHash;

    @OneToOne(cascade = CascadeType.ALL)
    private UserAddress userAddress;

    private User(UserBuilder userBuilder) {
        email = userBuilder.email;
        firstName = userBuilder.firstName;
        lastName = userBuilder.lastName;
        passwordHash = userBuilder.passwordHash;
        userAddress = userBuilder.userAddress;
    }


    public static class UserBuilder {

        private String email;

        private String firstName;

        private String lastName;

        private String passwordHash;

        private UserAddress userAddress;

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setPasswordHash(String passwordHash) {
            this.passwordHash = passwordHash;
            return this;
        }

        public UserBuilder setUserAddress(UserAddress userAddress) {
            this.userAddress = userAddress;
            return this;
        }

        public User build() {

            return new User(this);
        }

    }
}
