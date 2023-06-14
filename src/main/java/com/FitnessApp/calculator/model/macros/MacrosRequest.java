package com.FitnessApp.calculator.model.macros;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MacrosRequest {

    private String age;
    private String gender;
    private String height;
    private String weight;
    private String activityLevel;
    private String goal;
}
