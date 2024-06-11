package com.example.feignclient.service;

import com.example.feignclient.dto.User;
import com.example.feignclient.restApi.RestApiTest2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-11        koiw1       최초 생성
 */
@Service
public class TestService {

    @Autowired
    public RestApiTest2 restApiTest2 ;
    
    public ArrayList<User> getUserInfo() throws InterruptedException {
        return restApiTest2.getUserInfo() ;
    }

}
