package com.FitnessApp.meal.service;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Meal;
import com.FitnessApp.food.repository.FoodRepository;
import com.FitnessApp.meal.model.CreateMeal;
import com.FitnessApp.meal.repository.MealRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MealService {

    private final MealRepository mealRepository;
    private final FoodRepository foodRepository;

    public UUID createMeal(CreateMeal meal) {

        return mealRepository.insert(meal);
    }

    public List<Meal> findAllMealsByUserId(UUID userId) {

        return mealRepository.findAllByUserId(userId);
    }

    public void deleteMeal(UUID id) {

        foodRepository.deleteAllByMealId(id);
        mealRepository.deleteById(id);
    }
}

