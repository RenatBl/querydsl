package ru.itis.querydsl.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.stereotype.Repository;
import ru.itis.querydsl.model.QUser;
import ru.itis.querydsl.model.User;

@Repository
public interface UserRepo extends MongoRepository<User, ObjectId>,
        QuerydslPredicateExecutor<User>,
        QuerydslBinderCustomizer<QUser> {

    default void customize(QuerydslBindings querydslBindings, QUser qUser) {

    }
}
