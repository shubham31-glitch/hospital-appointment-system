package com.hospital.appointment.auth.dto;

import com.hospital.appointment.user.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotNull
    private Role role;
}

