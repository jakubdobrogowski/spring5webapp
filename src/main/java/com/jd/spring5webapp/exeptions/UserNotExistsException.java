package com.jd.spring5webapp.exeptions;

public class UserNotExistsException extends RuntimeException {

    public UserNotExistsException() {
    }

    public UserNotExistsException(String message) {
        super(message);
    }

    public UserNotExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
