package com.wchamara.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    @RequestMapping("/say-hello-in-html")
    @ResponseBody
    public String sayHelloInHTML() {

        StringBuffer html = new StringBuffer();
        html.append("<html>");
        html.append("<head>");
        html.append("<title>Home</title>");
        html.append("</head>");
        html.append("<body>");
        html.append("<h1>Home</h1>");
        html.append("<p>Welcome to the home page updated</p>");
        html.append("<a href=\"about.php\">About</a>");
        html.append("<a href=\"contact.php\">Contact</a>");
        html.append("</body>");
        html.append("</html>");


        return html.toString();
    }

    /**
     * Handles the request for "/say-hello-jsp" and returns the name of the JSP file to render.
     *
     * @return The name of the JSP file to render ("sayHello").
     */
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}