package com.FitnessApp.meal.model;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Food;
import java.util.List;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MealAndFoods {

    private UUID mealId;
    private String mealName;
    private UUID userId;
    private List<Food> foods;
}
