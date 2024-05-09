package com.example.data1700_2023exam_solution;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_1 {
    @Id
    @GeneratedValue
    private int ID;
    private String username;
    private String password;
}
