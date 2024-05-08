package com.example.data1700_2023exam_solution;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.IIOException;

@Repository
public class Controller {
    @Autowired
    private CitizenRepository citizenRepostory;
    private Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/hello")
    public String hello() {
        return "Your controller is working";
    }
    @PostMapping("/saveCitizen")
    public void saveCitizen(@RequestBody Citizen citizen) throws IIOException {
         citizenRepostory.saveCitizen(citizen,HttpServletResponse response);
    }
}
