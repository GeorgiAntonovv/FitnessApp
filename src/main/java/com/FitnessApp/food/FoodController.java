package com.FitnessApp.food;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Food;
import com.FitnessApp.food.model.CreateFood;
import com.FitnessApp.food.model.UpdateFood;
import com.FitnessApp.food.service.FoodService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/foods")
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/{id}")
    public ResponseEntity<Food> getFood(@PathVariable UUID id) {
        Food food = foodService.findFoodById(id);
        if (food != null) {
            return ResponseEntity.ok(food);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{mealId}")
    public String createFood(@ModelAttribute CreateFood request, @PathVariable UUID mealId) {

        request.setMealId(mealId);
        foodService.createFood(request);
        return "meal";
    }

    @PatchMapping("/{id}")
    public ResponseEntity updateFood(@RequestBody UpdateFood request,
            @PathVariable UUID id) {

        boolean updateWasSuccessful = foodService.updateFood(id, request);
        if (updateWasSuccessful){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/{id}/delete")
    public String deleteFood(@PathVariable UUID id) {

        foodService.deleteFood(id);
        return "meal";
    }
}
