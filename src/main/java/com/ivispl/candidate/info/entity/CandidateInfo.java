package com.ivispl.candidate.info.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class CandidateInfo {

    @Id
    private Long id;
    private String panNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String currentEmployer;
    private String email;
    private String contactNumber;
    private String skill;

}

