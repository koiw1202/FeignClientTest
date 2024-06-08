package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.http.HttpResponse;
import java.util.ArrayList;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-08        koiw1       최초 생성
 */
//FeignClient를 사용한 코드

@FeignClient(name = "restApiTest", url = "https://api.restful-api.dev")
public interface RestApiTest {

    @GetMapping("/objects")
    ArrayList<User> getUserInfo() ;
}
