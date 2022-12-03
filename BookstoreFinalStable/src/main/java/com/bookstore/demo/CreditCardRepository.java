package com.bookstore.demo;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface CreditCardRepository extends MongoRepository<CreditCard, String> {
  
  List<CreditCard> findAllByUserId(String userId);


}
