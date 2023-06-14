package com.FitnessApp.calculator.model.macros;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MacrosData {

    @JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT, pattern = "0.00")
    private Double calorie;
    private Balanced balanced;
    private LowFat lowfat;
    private LowCarbs lowCarbs;
    private HighProtein highprotein;
}
