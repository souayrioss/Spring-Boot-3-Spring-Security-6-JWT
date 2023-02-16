package org.roronoa.banklygateway.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AuthDto {
    @NotNull @NotEmpty @Email
    private String email;
    @NotNull @NotEmpty
    private String password;
}
