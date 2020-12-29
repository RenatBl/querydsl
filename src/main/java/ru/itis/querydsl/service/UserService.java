package ru.itis.querydsl.service;

import ru.itis.querydsl.model.User;

public interface UserService {

    User getUserByName(String name);

}
