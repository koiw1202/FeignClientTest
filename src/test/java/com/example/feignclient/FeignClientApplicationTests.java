package com.example.feignclient;

import com.example.feignclient.dto.User;
import com.example.feignclient.restApi.RestApiTest;
import com.example.feignclient.restApi.RestApiTest2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class FeignClientApplicationTests {

    @Autowired
    public RestApiTest restApiTest ;

    @Autowired
    public RestApiTest2 restApiTest2 ;

    @Test
    void doFeignClientApiTest() {

        ArrayList<User> userArrayList = restApiTest.getUserInfo() ;



        userArrayList.stream()
                        .forEach(System.out::println) ;
    }

    @Test
    void doFeignClientApiTest2() {
        ArrayList<User> userArrayList = restApiTest2.getUserInfo() ;

        userArrayList.stream()
                .forEach(System.out::println) ;
    }


}
























