package com.entities;

import jakarta.persistence.*;
import lombok.*;


@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, name = "street")
    private String street;

    @Column(nullable = false, name="city")
    private String city;

    @Column(nullable = false, name="zip")
    private String zip;

    @Column(nullable = false, name="state")
    private String state;


//    Many To One Relationship to the User account
    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User user;

}
