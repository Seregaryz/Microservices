package ru.kpfu.itis.newsapp.services;



import ru.kpfu.itis.newsapp.models.News;

import java.util.List;

public interface NewsService {
    List<News> showNews();

    News showConcreteNews(Long id);

    void save(News news);
}
