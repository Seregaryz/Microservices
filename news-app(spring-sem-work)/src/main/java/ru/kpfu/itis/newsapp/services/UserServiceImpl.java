package ru.kpfu.itis.newsapp.services;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import ru.kpfu.itis.newsapp.models.user.User;
import ru.kpfu.itis.newsapp.repositories.UsersRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> getUsers() {
        return usersRepository.findAll();
    }
}
