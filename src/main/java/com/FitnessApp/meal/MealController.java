package com.FitnessApp.meal;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Food;
import co.tide.com.fitnessapp.db.jooq.tables.pojos.Meal;
import com.FitnessApp.food.service.FoodService;
import com.FitnessApp.meal.model.CreateMeal;
import com.FitnessApp.meal.model.MealAndFoods;
import com.FitnessApp.meal.service.MealService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/meals")
public class MealController {

    private final MealService mealService;
    private final FoodService foodService;

    @GetMapping("/")
    public String showMealPage(HttpSession session) {
        String role = (String) session.getAttribute("role");

        if (role == null) {
            return "loginPage";
        }

        return "meal";
    }

    @PostMapping
    public String createMeal(@RequestParam String mealName, HttpSession session) {

        UUID userId = (UUID) session.getAttribute("userId");
        CreateMeal meal = CreateMeal.builder()
                .userId(userId)
                .name(mealName)
                .build();
        mealService.createMeal(meal);
        return "meal";
    }

    @GetMapping
    @ResponseBody
    public List<MealAndFoods> getAllMeals(HttpSession session) {

        UUID userId = (UUID) session.getAttribute("userId");
        List<Meal> meals = mealService.findAllMealsByUserId(userId);

        List<MealAndFoods> mealAndFoods = new ArrayList<>();

        for (Meal meal : meals) {
            List<Food> foods = foodService.findAllFoodsByMealId(meal.getId());
            MealAndFoods fullMeal = MealAndFoods.builder()
                    .mealId(meal.getId())
                    .foods(foods)
                    .mealName(meal.getName())
                    .build();

            mealAndFoods.add(fullMeal);
        }

        return mealAndFoods;
    }

    @PostMapping("/{id}")
    public String deleteMeal(@PathVariable UUID id) {

        mealService.deleteMeal(id);
        return "meal";
    }
}

