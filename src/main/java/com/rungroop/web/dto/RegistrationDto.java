package com.rungroop.web.dto;

import lombok.Data;

@Data
public class RegistrationDto {
    private Long id;
    private String username;
    private String email;
    private String password;
}
