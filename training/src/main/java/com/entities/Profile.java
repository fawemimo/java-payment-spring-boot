package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(nullable = false, name = "bio")
    private String bio;

    @Column(nullable = false, name="phoneNumber")
    private String phoneNumber;

    @DateTimeFormat
    private LocalDate dateOfBirth;

    @Column(nullable = false, name="loyaltyPoints")
    private Integer loyaltyPoints;
}
