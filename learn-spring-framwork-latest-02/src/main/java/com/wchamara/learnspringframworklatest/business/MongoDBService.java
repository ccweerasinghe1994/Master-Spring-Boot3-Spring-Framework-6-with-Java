package com.wchamara.learnspringframworklatest.business;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MongoDBService implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
    }
}
