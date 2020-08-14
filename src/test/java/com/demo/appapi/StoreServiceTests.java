package com.demo.appapi;

import com.demo.appapi.service.StoreService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StoreServiceTests {

    @Autowired
    private StoreService storeService;


    @Test
    public void 서비스에서받아오는지()
    {

        String result = storeService.getString();
        assertThat("Hi").isEqualTo(result);
    }
}
