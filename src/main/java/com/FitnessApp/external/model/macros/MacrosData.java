package com.FitnessApp.external.model.macros;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MacrosData {

    private Double calories;
    private Balanced balanced;
    private LowFat lowFat;
    private LowCarbs lowCarbs;
    private HighProtein highProtein;
}
