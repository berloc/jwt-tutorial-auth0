package com.example.demo.security;

public class SecurityConstans {

    static final String SECRET = "SecretKeyToGenJWTs";
    static final Long EXPIRATION_TIME = 864_000_000L; // 10 days
    static final String HEADER_STRING = "Authorization";
    static final String TOKEN_PREFIX = "Bearer ";
    public static final String SIGN_UP_URL = "/signup";
    public static final String LOGIN_URL = "/login";
}
