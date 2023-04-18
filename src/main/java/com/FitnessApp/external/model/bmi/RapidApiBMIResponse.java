package com.FitnessApp.external.model.bmi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties
public class RapidApiBMIResponse {

    private String status_code;
    private String request_result;
    private BmiData data;
}
