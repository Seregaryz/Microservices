package ru.kpfu.itis.newsapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.newsapp.models.News;
import ru.kpfu.itis.newsapp.repositories.NewsRepository;


import java.time.LocalDateTime;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<News> showNews() {
        return newsRepository.findAll();
    }

    @Override
    public News showConcreteNews(Long id) {
        return newsRepository.getOne(id);
    }

    @Override
    public void save(News news) {
        news.setCreatedAt(LocalDateTime.now());
        newsRepository.save(news);
    }
}
