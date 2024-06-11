package com.example.feignclient.config;

import org.springframework.context.annotation.Bean;
import com.example.feignclient.error.FeignErrorDecoder ;
/**
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-11        koiw1       최초 생성
 */
public class FeignClientConfig {

    @Bean
    public FeignErrorDecoder getFeignErrorDecoder(){
        return new FeignErrorDecoder();
    }
}
