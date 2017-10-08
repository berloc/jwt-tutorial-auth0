package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ApplicationUser {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
}
