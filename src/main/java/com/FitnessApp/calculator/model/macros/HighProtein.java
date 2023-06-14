package com.FitnessApp.calculator.model.macros;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HighProtein {

    @JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT, pattern = "0.00")
    private Double protein;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT, pattern = "0.00")
    private Double fat;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER_FLOAT, pattern = "0.00")
    private Double carbs;
}
