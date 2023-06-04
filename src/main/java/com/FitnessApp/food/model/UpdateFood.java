package com.FitnessApp.food.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateFood {

    private UUID mealId;
    private String foodName;
    private Integer calories;
    private Integer protein;
    private Integer fats;
    private Integer carbs;
}
