package ru.itis.querydsl.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.querydsl.model.User;
import ru.itis.querydsl.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{name}")
    public ResponseEntity<User> findUserByName(@PathVariable String name) {
        return ResponseEntity
                .ok(userService.getUserByName(name));
    }
}
