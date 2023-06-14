package com.FitnessApp.user.model;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateProfile {

    private String firstName;
    private String lastName;
    private String email;
    private BigDecimal bodyFat;
    private BigDecimal goalBodyFat;
    private Integer currentWeight;
    private Integer goalWeight;
}
