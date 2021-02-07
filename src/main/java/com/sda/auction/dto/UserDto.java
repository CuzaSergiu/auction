package com.sda.auction.dto;

import lombok.Data;

@Data
public class UserDto {

    // == fields ==
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Boolean isAdmin;

}
