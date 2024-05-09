package com.example.data1700_2023exam_solution;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
    @Id
    @GeneratedValue
    private Integer CID;
    private String firstName;
    private String surname;
    private String doB;
    private String SSN;
    private String phoneNr;
    private String email, city, street;
    
}
