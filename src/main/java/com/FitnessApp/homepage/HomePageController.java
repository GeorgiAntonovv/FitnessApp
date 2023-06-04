package com.FitnessApp.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomePageController {

    @GetMapping
    public String showHomePage() {
        return "homePage";
    }

}
