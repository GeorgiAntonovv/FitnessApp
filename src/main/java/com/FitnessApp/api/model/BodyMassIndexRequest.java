package com.FitnessApp.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BodyMassIndexRequest {

    private String weight;
    private String height;
}
