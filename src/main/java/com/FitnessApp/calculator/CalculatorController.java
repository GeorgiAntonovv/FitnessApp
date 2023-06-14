package com.FitnessApp.calculator;

import com.FitnessApp.calculator.model.bmi.BmiRequest;
import com.FitnessApp.calculator.model.macros.MacrosRequest;
import com.FitnessApp.calculator.model.macros.RapidApiMacrosResponse;
import com.FitnessApp.calculator.service.CalculatorService;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/calculators")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @GetMapping("/")
    public String showCalculator(HttpSession session) {

        String role = (String) session.getAttribute("role");
        if (role == null || role.equals("USER")) {
            return "loginPage";
        }
        return "calculator";
    }

    @GetMapping(path = "/bmi")
    public String getBodyMassIndex(@ModelAttribute BmiRequest request, Model model)
            throws IOException {

        Double bodyFat = calculatorService.getBMI(request.getAge(), request.getWeight(), request.getHeight()).getData()
                .getBmi();
        model.addAttribute("bodyFat", bodyFat);
        return "calculator";
    }

    @GetMapping(path = "/macros")
    public String getMacros(@ModelAttribute MacrosRequest request, Model model)
            throws IOException {

        RapidApiMacrosResponse macros = calculatorService.getMacros(request.getAge(), request.getGender(),
                request.getHeight(), request.getWeight(), request.getActivityLevel(), request.getGoal());

        String calories = String.format("%.2f", macros.getData().getCalorie());
        String fats = String.format("%.2f g", macros.getData().getHighprotein().getFat());
        String carbs = String.format("%.2f g", macros.getData().getHighprotein().getCarbs());
        String protein = String.format("%.2f g", macros.getData().getHighprotein().getProtein());

        model.addAttribute("calories", calories);
        model.addAttribute("fats", fats);
        model.addAttribute("carbs", carbs);
        model.addAttribute("protein", protein);
        return "calculator";
    }
}
