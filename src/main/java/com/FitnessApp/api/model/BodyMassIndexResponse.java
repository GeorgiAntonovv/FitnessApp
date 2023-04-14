package com.FitnessApp.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BodyMassIndexResponse {

    private Integer bodyMassIndex;
}
