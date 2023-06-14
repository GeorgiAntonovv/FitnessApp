package com.FitnessApp.workout.model;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.Exercise;
import java.util.List;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkoutAndExercises {
    private UUID workoutId;
    private String workoutName;
    private UUID userId;
    private List<Exercise> exercises;
}
