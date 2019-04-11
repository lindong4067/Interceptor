package com.lyndon.interceptor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: eznlzhi
 * @Email: lindong.zhao@ericsson.com
 * @Date: 12/27/2017
 */
@RestController
public class TargetController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello MyInterceptor !";
    }
}
