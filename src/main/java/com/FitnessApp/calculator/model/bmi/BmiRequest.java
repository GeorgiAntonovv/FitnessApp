package com.FitnessApp.calculator.model.bmi;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BmiRequest {

    private String weight;
    private String height;
    private String age;
}
