package com.wchamara.learnspringframework.Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDoaService implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{11111, 22321, 4322};
    }
}
