package com.example.data1700_2023exam_solution;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class Controller {
    @GetMapping("/hello")
    public String hello() {
        return "Your controller is working";
    }
}
