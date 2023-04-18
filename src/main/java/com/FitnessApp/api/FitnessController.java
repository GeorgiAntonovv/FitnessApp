package com.FitnessApp.api;

import com.FitnessApp.external.model.macros.RapidApiMacrosResponse;
import com.FitnessApp.service.FitnessService;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/fitness-app")
public class FitnessController {

    private final FitnessService fitnessService;

    @GetMapping(path = "/bmi")
    public Double getBodyMassIndex(@RequestParam String weight, @RequestParam String height, @RequestParam String age)
            throws IOException {

        return fitnessService.getBMI(age, weight, height).getData().getBmi();
    }

    @GetMapping(path = "/macros")
    public RapidApiMacrosResponse getMacros(@RequestParam String age, @RequestParam String gender, @RequestParam String height,
            @RequestParam String weight, @RequestParam String activityLevel, @RequestParam String goal) throws IOException {

        return fitnessService.getMacros(age, gender, height, weight, activityLevel, goal);
    }
}
