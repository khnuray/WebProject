package com.rungroop.web.dto;

import lombok.Data;

@Data
public class RegistrationDto {
    private Long id;
    @NotEmpty(message = "")
    private String username;
    @NotEmpty(message = "")
    private String email;
    @NotEmpty(message = "")
    private String password;
}
