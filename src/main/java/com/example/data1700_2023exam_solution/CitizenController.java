package com.example.data1700_2023exam_solution;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CitizenController {
    @Autowired
    private CitizenRepository citizenRepostory;

    private Logger logger = LoggerFactory.getLogger(CitizenController.class);

    @GetMapping("/hello")
    public String hello() {
        return "Your controller is working";
    }

    @PostMapping ("/saveCitizen")
    public void lagreKunde(Citizen citizen, HttpServletResponse response ) throws IOException {
        citizenRepostory.saveCitizen(citizen);

    }
}
