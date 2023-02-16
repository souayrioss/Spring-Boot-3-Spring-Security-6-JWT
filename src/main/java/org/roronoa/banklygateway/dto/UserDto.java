package org.roronoa.banklygateway.dto;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.roronoa.banklygateway.entity.Role;

import java.util.UUID;

@Data
public class UserDto {
    private Integer id;

    private String uuid;
    @NotNull @NotEmpty
    private String firstName;
    @NotNull @NotEmpty
    private String lastName;
    @NotNull @NotEmpty @Email
    private String email;
    @NotNull @NotEmpty
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

}
