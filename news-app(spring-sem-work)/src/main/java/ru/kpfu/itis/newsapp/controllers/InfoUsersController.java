package ru.kpfu.itis.newsapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itis.newsapp.models.News;
import ru.kpfu.itis.newsapp.models.user.User;
import ru.kpfu.itis.newsapp.services.NewsService;
import ru.kpfu.itis.newsapp.services.UserService;

import java.util.List;

public class InfoUsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/infoUsers")
    public String getUsersCount(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("count", users.size());
        return "infoListUser";
    }
}
