package ru.itis.querydsl.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import ru.itis.querydsl.model.User;

public interface UserRepo extends MongoRepository<User, ObjectId>,
        QuerydslPredicateExecutor<User>,
        QuerydslBinderCustomizer<QUser> {
}
