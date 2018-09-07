package com.jd.spring5webapp.exeptions;

public class PasswordNotCorrect extends RuntimeException {

    public PasswordNotCorrect() {
    }

    public PasswordNotCorrect(String message) {
        super(message);
    }

    public PasswordNotCorrect(String message, Throwable cause) {
        super(message, cause);
    }
}
