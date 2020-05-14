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
public class InfoNewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/infoNews")
    public String getNewsCount(Model model) {
        List<News> news = newsService.showNews();
        model.addAttribute("count", news.size());
            return "infoList";
    }
}
