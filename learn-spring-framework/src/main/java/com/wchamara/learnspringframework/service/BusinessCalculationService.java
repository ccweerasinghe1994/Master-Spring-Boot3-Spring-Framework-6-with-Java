package com.wchamara.learnspringframework.service;

import com.wchamara.learnspringframework.doa.DataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ComponentScan("com.wchamara.learnspringframework.doa")
public class BusinessCalculationService {
    private final DataService dataService;

    public BusinessCalculationService(@Qualifier("mysql") DataService dataService) {
        this.dataService = dataService;
    }

    public int getMax() {
        return Arrays.stream(dataService.retrieveAllData()).max().orElse(0);
    }
}
