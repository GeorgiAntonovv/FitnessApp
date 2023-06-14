package com.FitnessApp.calculator.model.bmi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BmiData {

    private Double bmi;
    private String health;
    private String healthy_bmi_range;
}
