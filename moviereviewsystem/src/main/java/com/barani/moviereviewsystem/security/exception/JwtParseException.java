package com.barani.moviereviewsystem.security.exception;

import org.springframework.security.core.AuthenticationException;

public class JwtParseException extends AuthenticationException {

    public JwtParseException(Exception e) {
        super(e.getMessage(), e);
    }
}
