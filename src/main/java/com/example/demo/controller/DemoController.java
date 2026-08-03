package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class DemoController {

    @PostMapping("/demo")
    public List<String> toList(@RequestBody String str){
        if (str == null || str.isBlank()) {
            return Collections.emptyList();
            //mauja
        }

        return Arrays.stream(str.split(","))
                .map(String::trim)
                .toList(); // Use .collect(Collectors.toList()) if on Java 16 or lower
    }
}
