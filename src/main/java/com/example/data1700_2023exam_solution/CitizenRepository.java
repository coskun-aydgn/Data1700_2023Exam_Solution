package com.example.data1700_2023exam_solution;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CitizenRepository {
    @Autowired
    private JdbcTemplate db;

    private Logger logger=LoggerFactory.getLogger(CitizenController.class);

    public boolean saveCitizen(Citizen citizen ) {
        String sql = "insert into Citizen(firstName,surname,DoB,SSN,phoneNr,email,city,street) values(?,?,?,?,?,?,?,?)";
        try {
            db.update(sql,citizen.getFirstName(),citizen.getSurname(),citizen.getDoB(),citizen.getSSN(),
                    citizen.getPhoneNr(),citizen.getEmail(),citizen.getCity(), citizen.getStreet());
            return true;
        }catch (Exception e){
            logger.error("An error occured when saving citizen to database : "+e);
            return false;
        }


    }

}
