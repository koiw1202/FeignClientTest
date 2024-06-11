package com.example.feignclient.controller;

import com.example.feignclient.dto.User;
import com.example.feignclient.dto.UserSubDto;
import com.example.feignclient.restApi.RestApiTest2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.feignclient.service.TestService ;

import java.util.ArrayList;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-11        koiw1       최초 생성
 */
@RestController
public class TestController {

    @Autowired
    public TestService testService ;

    @GetMapping("/objects")
    public ArrayList<User> getUserInfo() throws InterruptedException {
        return testService.getUserInfo() ;
    }

    @GetMapping("/objects2")
    public ArrayList<User> getUserInfo2() throws Exception {

        ArrayList<User> list = new ArrayList<>() ;

        Thread.sleep(5000) ;

        if(1==1)
            throw new Exception() ;

        for(int i = 0 ; i < 10; i++) {
            User user = new User() ;
            UserSubDto userSubDto = new UserSubDto() ;

            user.setId("1") ;
            user.setName("김성훈") ;
            userSubDto.setCapacity("1") ;
            userSubDto.setGeneration("1") ;
            userSubDto.setPrice("1") ;

            user.setData(userSubDto) ;
            list.add(user) ;
        }

        return list ;
    }
}