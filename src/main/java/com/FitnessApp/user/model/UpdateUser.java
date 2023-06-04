package com.FitnessApp.user.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateUser {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
