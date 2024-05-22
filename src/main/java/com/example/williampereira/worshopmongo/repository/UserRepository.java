package com.example.williampereira.worshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.williampereira.worshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
