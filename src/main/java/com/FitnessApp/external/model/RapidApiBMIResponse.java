package com.FitnessApp.external.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RapidApiBMIResponse {

    private Double bmi;
    private String height;
    private String weight;
    private String weightCategory;
}
