package com.FitnessApp.workout;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Exercise;
import co.tide.com.fitnessapp.db.jooq.tables.pojos.Workout;
import com.FitnessApp.exercise.service.ExerciseService;
import com.FitnessApp.workout.model.CreateWorkout;
import com.FitnessApp.workout.model.WorkoutAndExercises;
import com.FitnessApp.workout.service.WorkoutService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/workouts")
public class WorkoutController {

    private final WorkoutService workoutService;
    private final ExerciseService exerciseService;

    @GetMapping("/")
    public String showWorkoutPage(HttpSession session) {

        String role = (String) session.getAttribute("role");

        if (role == null) {
            return "loginPage";
        }

        return "workout";
    }

    @PostMapping
    public String createWorkout(@RequestParam String workoutName, HttpSession session) {

        UUID userId = (UUID) session.getAttribute("userId");
        CreateWorkout workout = CreateWorkout.builder()
                .userId(userId)
                .name(workoutName)
                .build();
        workoutService.createWorkout(workout);
        return "workout";
    }

    @GetMapping
    @ResponseBody
    public List<WorkoutAndExercises> getAllWorkouts(HttpSession session) {

        UUID userId = (UUID) session.getAttribute("userId");
        List<Workout> workouts = workoutService.findAllWorkoutsByUserId(userId);

        List<WorkoutAndExercises> workoutAndExercises = new ArrayList<>();

        for (Workout workout : workouts) {
            List<Exercise> exercises = exerciseService.findAllExercisesByWorkoutId(workout.getId());
            WorkoutAndExercises fullWorkout = WorkoutAndExercises.builder()
                    .workoutId(workout.getId())
                    .exercises(exercises)
                    .workoutName(workout.getName())
                    .build();

            workoutAndExercises.add(fullWorkout);
        }

        return workoutAndExercises;
    }

    @PostMapping("/{id}")
    public String deleteWorkout(@PathVariable UUID id) {

        workoutService.deleteWorkout(id);
        return "workout";
    }
}

