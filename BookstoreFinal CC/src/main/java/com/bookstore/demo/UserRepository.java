package com.bookstore.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface UserRepository extends MongoRepository<User, String> {
  
    User findByUsername(String username);

}
