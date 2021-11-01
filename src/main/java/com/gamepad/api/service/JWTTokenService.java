package com.gamepad.api.service;

import io.jsonwebtoken.Clock;
import org.assertj.core.util.DateUtil;

import java.util.Date;
import java.util.Map;

public class JWTTokenService implements Clock, TokenService {



    @Override
    public String permanent(Map<String, String> attributes) {
        return null;
    }

    @Override
    public String expiring(Map<String, String> attributes) {
        return null;
    }

    @Override
    public Map<String, String> untrusted(String token) {
        return null;
    }

    @Override
    public Map<String, String> verify(String token) {
        return null;
    }

    @Override
    public Date now() {
        return DateUtil.now();
    }
}
