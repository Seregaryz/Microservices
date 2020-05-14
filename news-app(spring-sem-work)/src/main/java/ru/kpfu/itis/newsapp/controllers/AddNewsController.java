package ru.kpfu.itis.newsapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.newsapp.models.News;
import ru.kpfu.itis.newsapp.security.UserDetailsImpl;
import ru.kpfu.itis.newsapp.services.NewsService;

@Controller
public class AddNewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/addPost")
    public String getNewPostPage(Authentication authentication, Model model) {
        if(authentication != null) {
            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
            model.addAttribute("user", userDetails.getUser());
            model.addAttribute("isAuth", true);
        } else  model.addAttribute("isAuth", false);
        return "add-post";
    }

    @PostMapping("/addPost")
    public String signUp(News news) {
        newsService.save(news);
        return "redirect:/newsList";
    }
}
