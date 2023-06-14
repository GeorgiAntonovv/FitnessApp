package com.FitnessApp.meal.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateMeal {

    private UUID userId;
    private String name;
}
