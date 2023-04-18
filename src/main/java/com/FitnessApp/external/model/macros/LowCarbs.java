package com.FitnessApp.external.model.macros;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LowCarbs {

    private Double protein;
    private Double fat;
    private Double carbs;
}
