package com.FitnessApp.exercise;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Exercise;
import com.FitnessApp.exercise.model.CreateExercise;
import com.FitnessApp.exercise.model.UpdateExercise;
import com.FitnessApp.exercise.service.ExerciseService;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/exercises")
public class ExerciseController {

    private final ExerciseService exerciseService;

    @GetMapping("/{id}")
    public ResponseEntity<Exercise> getExercise(@PathVariable UUID id) {
        Exercise exercise = exerciseService.getExerciseById(id);
        if (exercise != null) {
            return ResponseEntity.ok(exercise);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/{workoutId}")
    public String createExercise(@ModelAttribute CreateExercise request, @PathVariable UUID workoutId) {

        request.setWorkoutId(workoutId);
        exerciseService.createExercise(request);
        return "workout";
    }

    @PatchMapping("/{id}")
    public ResponseEntity updateExercise(@RequestBody UpdateExercise request,
            @PathVariable UUID id) {

        boolean updateWasSuccessful = exerciseService.updateExercise(id, request);
        if (updateWasSuccessful){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/{id}/delete")
    public String deleteExercise(@PathVariable UUID id) {

        exerciseService.deleteExercise(id);
        return "workout";
    }
}
