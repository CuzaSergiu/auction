package com.sda.auction.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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
    private Date dateOfBirth;

    // == relationships ==
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;


}
