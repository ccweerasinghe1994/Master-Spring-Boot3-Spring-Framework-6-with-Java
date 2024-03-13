package com.wchamara.learnspringframework.Dao;

import org.springframework.stereotype.Component;

@Component
public class MySqlDoaService implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{11111, 22321, 4322};
    }
}
