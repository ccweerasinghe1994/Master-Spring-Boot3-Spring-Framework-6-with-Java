package com.wchamara.learnspringframework.doa;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDoaService implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{11111, 22321, 4322};
    }
}
