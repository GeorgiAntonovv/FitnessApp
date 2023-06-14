package com.FitnessApp.food.service;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Food;
import com.FitnessApp.food.model.CreateFood;
import com.FitnessApp.food.model.UpdateFood;
import com.FitnessApp.food.repository.FoodRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public UUID createFood(CreateFood food) {

        return foodRepository.insert(food);
    }

    public Food findFoodById(UUID id) {

        return foodRepository.findById(id).orElse(null);
    }

    public List<Food> findAllFoodsByMealId(UUID mealId) {

        return foodRepository.findAllByMealId(mealId);
    }

    public boolean updateFood(UUID id, UpdateFood food) {

        return foodRepository.updateFood(id, food);
    }

    public void deleteFood(UUID id) {

        foodRepository.deleteById(id);
    }
}

