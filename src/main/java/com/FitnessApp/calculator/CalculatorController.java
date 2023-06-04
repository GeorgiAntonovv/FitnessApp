package com.FitnessApp.calculator;

import com.FitnessApp.external.model.macros.RapidApiMacrosResponse;
import com.FitnessApp.calculator.service.CalculatorService;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/calculators")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping(path = "/bmi")
    public String getBodyMassIndex(@RequestParam String weight, @RequestParam String height, @RequestParam String age, Model model)
            throws IOException {

        Double bodyFat = calculatorService.getBMI(age, weight, height).getData().getBmi();
        model.addAttribute("bodyFat", bodyFat);
        return "/redirect:calculator";
    }

    @GetMapping(path = "/macros")
    public String getMacros(@RequestParam String age, @RequestParam String gender, @RequestParam String height,
            @RequestParam String weight, @RequestParam String activityLevel, @RequestParam String goal, Model model) throws IOException {

        RapidApiMacrosResponse macros = calculatorService.getMacros(age, gender, height, weight, activityLevel, goal);
        model.addAttribute("fats", macros.getData().getHighprotein().getFat());
        model.addAttribute("carbs", macros.getData().getHighprotein().getCarbs());
        model.addAttribute("protein", macros.getData().getHighprotein().getProtein());
        return "/redirect:calculator";
    }
}
