package com.jd.spring5webapp.exeptions;

public class UserExistsExeption extends RuntimeException {


    public UserExistsExeption() {
    }

    public UserExistsExeption(String message) {
        super(message);
    }

    public UserExistsExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
