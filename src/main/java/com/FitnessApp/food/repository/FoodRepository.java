package com.FitnessApp.food.repository;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Food;
import com.FitnessApp.food.model.CreateFood;
import com.FitnessApp.food.model.UpdateFood;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static co.tide.com.fitnessapp.db.jooq.tables.Food.FOOD;

@Repository
@RequiredArgsConstructor
public class FoodRepository {

    private final DSLContext dslContext;
    private final Clock clock;

    public UUID insert(CreateFood food) {

        UUID id = UUID.randomUUID();
        dslContext.insertInto(FOOD)
                .set(FOOD.ID, id)
                .set(FOOD.MEAL_ID, food.getMealId())
                .set(FOOD.FOOD_NAME, food.getFoodName())
                .set(FOOD.CALORIES, food.getCalories())
                .set(FOOD.PROTEIN, food.getProtein())
                .set(FOOD.FATS, food.getFats())
                .set(FOOD.CARBS, food.getCarbs())
                .set(FOOD.CREATED_ON, LocalDateTime.now(clock))
                .set(FOOD.UPDATED_ON, LocalDateTime.now(clock))
                .execute();

        return id;
    }

    public Optional<Food> findByMealId(UUID mealId) {

        return dslContext.selectFrom(FOOD)
                .where(FOOD.MEAL_ID.eq(mealId))
                .fetchOptionalInto(Food.class);
    }

    public void updateFood(UUID id, UpdateFood food) {

        dslContext.update(FOOD)
                .set(FOOD.MEAL_ID, food.getMealId())
                .set(FOOD.FOOD_NAME, food.getFoodName())
                .set(FOOD.CALORIES, food.getCalories())
                .set(FOOD.PROTEIN, food.getProtein())
                .set(FOOD.FATS, food.getFats())
                .set(FOOD.CARBS, food.getCarbs())
                .set(FOOD.UPDATED_ON, LocalDateTime.now(clock))
                .where(FOOD.ID.eq(id))
                .execute();
    }

    public void deleteById(UUID id) {

        dslContext.deleteFrom(FOOD)
                .where(FOOD.ID.eq(id))
                .execute();
    }
}

