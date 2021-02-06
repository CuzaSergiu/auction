package com.sda.auction.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class UserDto {

    // == fields ==
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Boolean isAdmin;

    // == constructor ==

    // == getters and setters ==


}
