package com.example.feignclient;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.http.HttpResponse;
import java.util.ArrayList;

@SpringBootTest
class FeignClientApplicationTests {

    @Autowired
    public RestApiTest restApiTest ;

    @Test
    void doFeignClientApiTest() {
        ArrayList<User> userArrayList = restApiTest.getUserInfo() ;

        userArrayList.stream()
                        .forEach(System.out::println);

    }

}
