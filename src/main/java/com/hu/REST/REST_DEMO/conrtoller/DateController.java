package com.hu.REST.REST_DEMO.conrtoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping(BaseUri.BASE_URI)
public class DateController {

    @GetMapping("/current-date")
    public String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();

        return "Het is weer een mooie mooie dag, namelijk: " + dtf.format(now);
    }

}
