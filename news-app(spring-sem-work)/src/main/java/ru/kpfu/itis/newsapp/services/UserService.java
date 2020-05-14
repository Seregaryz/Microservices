package ru.kpfu.itis.newsapp.services;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.newsapp.models.user.User;

import java.util.List;

@Service
public interface UserService {

    List<User> getUsers();
}
