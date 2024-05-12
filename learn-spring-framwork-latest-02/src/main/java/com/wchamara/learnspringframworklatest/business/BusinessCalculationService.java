package com.wchamara.learnspringframworklatest.business;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {

    private final DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int calculateSum() {
        int[] data = dataService.retrieveAllData();
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }
}
