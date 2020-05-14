package ru.kpfu.itis.newsapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itis.newsapp.models.News;
import ru.kpfu.itis.newsapp.models.user.User;
import ru.kpfu.itis.newsapp.security.UserDetailsImpl;
import ru.kpfu.itis.newsapp.services.NewsService;

import java.util.List;

@Controller
public class ListOfNewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/newsList")
    public String getNewsListPage(Authentication authentication, Model model) {
        List<News> news = newsService.showNews();
        model.addAttribute("news", news);
        if(authentication != null) {
            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
            User user = userDetails.getUser();
            model.addAttribute("user", user);
            model.addAttribute("isAuth", true);
            return "newsList";
        } else {
            model.addAttribute("isAuth", false);
            return "newsList";
        }
    }
}
