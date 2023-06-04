package com.FitnessApp.user;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.User;
import com.FitnessApp.user.model.CreateUser;
import com.FitnessApp.user.service.UserService;
import java.util.Optional;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public String showLoginPage() {

        return "loginPage";
    }

    @GetMapping("/register")
    public String showRegistrationPage() {

        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody CreateUser user, HttpServletRequest request, Model model) {

        UUID userId = userService.createUser(user);

        HttpSession session = request.getSession();
        session.setAttribute("userId", userId);
        session.setAttribute("username", user.getUsername());

        model.addAttribute("username", user.getUsername());
        return "redirect:/users/profile";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody CreateUser user, Model model) {

        Optional<User> userFromDb = userService.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());

        if (userFromDb.isEmpty()) {
            model.addAttribute("message", "There is no user with that username and password");
        }

        return "redirect:/users/profile";
    }

    @GetMapping("/profile")
    public String showProfilePage(Model model, HttpServletRequest request) {
        String username = (String) request.getSession().getAttribute("username");

        model.addAttribute("username", username);
        return "profile";
    }

    @GetMapping("/logout")
    public String logoutUser() {
        // Handle user logout logic
        // You can invalidate the session
        return "redirect:/users/";
    }
}

