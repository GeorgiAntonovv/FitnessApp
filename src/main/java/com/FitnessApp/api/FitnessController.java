package com.FitnessApp.api;

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
    public Double getBodyMassIndex(@RequestParam String weight, @RequestParam String height) throws IOException {

        return fitnessService.getBMI(weight, height).getBmi();
    }
}
