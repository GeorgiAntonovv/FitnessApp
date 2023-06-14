package com.FitnessApp.calculator.model.macros;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties
public class RapidApiMacrosResponse {

    private String status_code;
    private String request_result;
    private MacrosData data;
}
