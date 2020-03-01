package com.hu.REST.REST_DEMO.conrtoller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(BaseUri.BASE_URI)
public class WelcomeController {

    @PostMapping("/welcome")
    public String welcome(@RequestBody String name) {
        return "Hi " + name;
    }


}
