package com.example.feignclient.restApi;

import com.example.feignclient.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-08        koiw1       최초 생성
 */
//FeignClient를 사용한 코드

@FeignClient(name = "restApiTest2", url = "http://localhost:8080")
public interface RestApiTest2 {

    @GetMapping("/objects3")
    ArrayList<User> getUserInfo() ;
}
