package com.wchamara.learnspringframworklatest.business;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class MySqlDBService implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[0];
    }
}
