package com.FitnessApp.user;

import co.tide.com.fitnessapp.db.jooq.tables.pojos.User;
import com.FitnessApp.user.model.CreateUser;
import com.FitnessApp.user.model.LoginUser;
import com.FitnessApp.user.model.UpdateProfile;
import com.FitnessApp.user.service.UserService;
import java.util.Optional;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String registerUser(@ModelAttribute CreateUser user, HttpSession session) {

        UUID userId = userService.createUser(user);

        session.setAttribute("userId", userId);
        session.setAttribute("role", user.getRole());

        return "redirect:/users/profile";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute LoginUser user, HttpSession session, RedirectAttributes redirectAttributes) {

        Optional<User> userFromDb = userService.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());

        if (userFromDb.isEmpty()) {
            redirectAttributes.addFlashAttribute("errorMessage", "Wrong username or password");
            return "redirect:/loginPage";
        }

        session.setAttribute("userId", userFromDb.get().getId());
        session.setAttribute("role", userFromDb.get().getRole());

        return "redirect:/users/profile";
    }

    @GetMapping("/profile")
    public String showProfilePage(Model model, HttpSession session) {

        UUID userId = (UUID) session.getAttribute("userId");

        User userFromDb = userService.findUserByUserId(userId);

        model.addAttribute("firstName", userFromDb.getFirstName());
        model.addAttribute("lastName", userFromDb.getLastName());
        model.addAttribute("email", userFromDb.getEmail());
        model.addAttribute("role", userFromDb.getRole());
        model.addAttribute("bodyFat", userFromDb.getBodyFat());
        model.addAttribute("goalBodyFat", userFromDb.getGoalBodyFat());
        model.addAttribute("currentWeight", userFromDb.getCurrentWeight());
        model.addAttribute("goalWeight", userFromDb.getGoalWeight());
        return "profile";
    }

    @PostMapping("/profile/edit")
    public String editProfilePage(@ModelAttribute UpdateProfile request, HttpSession session) {

        UUID userId = (UUID) session.getAttribute("userId");

        userService.updateUpdateProfile(userId, request);

        return "redirect:/users/profile";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate();
        return "homePageNotLogged";
    }
}

