package com.wchamara.learnspringframework.doa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mysql")
public class MySqlDoaService implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{1, 2, 3};
    }
}
