package com.FitnessApp.goal.model;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateGoal {

    private UUID userId;
    private Integer currentWeight;
    private Integer goalWeight;
    private String progressStatus;
}
