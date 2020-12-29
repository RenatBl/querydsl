package ru.itis.querydsl.service;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringPath;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itis.querydsl.model.User;
import ru.itis.querydsl.repo.UserRepo;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public User getUserByName(String name) {
        Predicate predicate;
        StringPath firstName = QUser.user.firstName;
        predicate = firstName.isNotNull().and(firstName.isNotEmpty());

        return userRepo.findOne(predicate)
                .orElseThrow(() ->
                        new IllegalArgumentException("User with name=" + name + " not found")
                );
    }
}
