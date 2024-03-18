package com.wchamara.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // http://localhost:8080/login?name=chamara

    /**
     * Handles the "/login" request mapping.
     *
     * @return The name of the view to be rendered.
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        // Return the name of the view to be rendered.
        return "login";
    }

    /**
     * Handles the "/login" POST request mapping.
     *
     * @param name     The name parameter from the request.
     * @param password The password parameter from the request.
     * @param model    The ModelMap object used to pass attributes to the view.
     * @return The name of the view to be rendered.
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String gotToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        // Add the name and password attributes to the model.
        model.put("name", name);
        model.put("password", password);

        // Return the name of the view to be rendered.
        return "welcome";
    }
}
