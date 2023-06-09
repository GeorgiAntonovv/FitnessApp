package com.FitnessApp.workout.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateWorkout {

    private UUID userId;
    private String name;
}
