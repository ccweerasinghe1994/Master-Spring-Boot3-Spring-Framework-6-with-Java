package com.wchamara.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // http://localhost:8080/login?name=chamara

    /**
     * Handles the "/login" request mapping.
     *
     * @param name  The name parameter from the request.
     * @param model The ModelMap object used to pass attributes to the view.
     * @return The name of the view to be rendered.
     */
    @RequestMapping("/login")
    public String login(@RequestParam String name, ModelMap model) {
        // Add the name attribute to the model.
        model.put("name", name);

        // Return the name of the view to be rendered.
        return "login";
    }
}
