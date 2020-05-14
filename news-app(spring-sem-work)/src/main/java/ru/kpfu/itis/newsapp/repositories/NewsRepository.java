package ru.kpfu.itis.newsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.newsapp.models.News;


public interface NewsRepository extends JpaRepository<News, Long> {
}
