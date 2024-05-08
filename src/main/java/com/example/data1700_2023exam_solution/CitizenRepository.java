package com.example.data1700_2023exam_solution;


import jakarta.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.IOException;



@Repository
public class CitizenRepository {
    @Autowired
    private JdbcTemplate db;

    private Logger logger=LoggerFactory.getLogger(Controller.class);

    public void saveCitizen(Citizen citizen, HttpServletResponse response) throws IOException {
        String sql = "insert into Citizen(firstName,surname,DoB,SSN,phoneNr,email,city,street) values(?,?,?,?,?,?,?)";
        try {
            db.update(sql,citizen.getFirstName(),citizen.getSurname(),citizen.getDoB(),citizen.getSSN(),citizen.getPhoneNr(),citizen.getEmail(),citizen.getCity(), citizen.getStreet());
        }catch (Exception e){
            logger.error("An error occured when saving citizen to database : "+e);
            response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "An error occured when saving citizen to database : "+e);
        }

    }

}
