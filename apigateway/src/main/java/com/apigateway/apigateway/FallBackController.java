package com.apigateway.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "user service is down at this time! ";
    }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallback(){
        return "contact servive is down at this time!";
    }

}
