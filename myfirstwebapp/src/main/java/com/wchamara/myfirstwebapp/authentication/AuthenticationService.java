package com.wchamara.myfirstwebapp.authentication;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticateUser(String name, String password) {
        return name.equalsIgnoreCase("chamara") && password.equals("Sliit123!@#");
    }
}
