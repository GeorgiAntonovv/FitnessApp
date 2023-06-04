package com.FitnessApp.user.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginUser {

    private String username;
    private String password;
}
