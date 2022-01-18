package com.example.mywebapp.repository;

import com.example.mywebapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
