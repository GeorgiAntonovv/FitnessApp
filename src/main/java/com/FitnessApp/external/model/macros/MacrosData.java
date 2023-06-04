package com.FitnessApp.external.model.macros;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MacrosData {

    private Double calorie;
    private Balanced balanced;
    private LowFat lowfat;
    private LowCarbs lowCarbs;
    private HighProtein highprotein;
}
