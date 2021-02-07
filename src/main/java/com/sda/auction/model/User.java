package com.sda.auction.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate dateOfBirth;

    // == relationships ==
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;


}
