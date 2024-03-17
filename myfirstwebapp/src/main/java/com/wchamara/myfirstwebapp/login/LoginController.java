package com.wchamara.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    // http://localhost:8080/login?name=chamara

    /**
     * Handles the "/login" request mapping.
     *
     * @return The name of the view to be rendered.
     */
    @RequestMapping("/login")
    public String login() {
        // Return the name of the view to be rendered.
        return "login";
    }
}
