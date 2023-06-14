package com.FitnessApp.exercise.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateExercise {

    private String exerciseName;
    private String sets;
    private String reps;
    private String notes;
}
