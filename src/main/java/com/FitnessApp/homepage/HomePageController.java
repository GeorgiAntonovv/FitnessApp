package com.FitnessApp.homepage;

import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomePageController {

    @GetMapping
    public String showHomePage(HttpSession session) {
        UUID userId = (UUID) session.getAttribute("userId");

        if (userId == null){
            return "homePageNotLogged";
        }
        return "homePage";
    }

}
