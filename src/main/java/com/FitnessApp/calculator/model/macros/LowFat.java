package com.FitnessApp.calculator.model.macros;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LowFat {

    private Double protein;
    private Double fat;
    private Double carbs;
}
