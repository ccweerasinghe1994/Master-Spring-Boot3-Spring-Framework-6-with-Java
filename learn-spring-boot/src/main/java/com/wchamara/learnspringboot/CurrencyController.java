package com.wchamara.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
    @Autowired
    private CurrencyConfiguration currencyConfiguration;

    @RequestMapping("/currency")
    public CurrencyConfiguration getAllCourses() {

        return currencyConfiguration;
    }
}
