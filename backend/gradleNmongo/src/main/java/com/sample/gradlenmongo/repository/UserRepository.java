package com.sample.gradlenmongo.repository;

import com.sample.gradlenmongo.dto.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {


}
